package com.han_lang.compiler.ast;

import com.han_lang.compiler.CompileErrorUtil;
import com.han_lang.compiler.analysis.*;
import com.han_lang.compiler.analysis.exception.*;
import com.han_lang.compiler.analysis.scope.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HanVerifier extends HanCompilerBaseVisitor<Void> {
    Global global;
    public ParseTreeProperty<Scope> ast2scope = new ParseTreeProperty<>();
    public ParseTreeProperty<Type> ast2returnType = new ParseTreeProperty<>();

    public HanVerifier(Global global){
        this.global = global.setAst2Scope(ast2scope);
    }

    @Override
    public Void visitProgram(HanCompilerParser.ProgramContext ctx) {
        //声明所有类型
        for (HanCompilerParser.NewtypeExprContext newtypeExpr : ctx.newtypeExpr()){
            String typeName = newtypeExpr.ID().getText();
            if(global.globalTypeDeclared(typeName)){
                CompileErrorUtil.typeAlreadyDefined(
                        newtypeExpr.ID().getSymbol().getLine(), newtypeExpr.ID().getSymbol().getCharPositionInLine(),
                        "<" + newtypeExpr.ID().getText() + ">"
                );
            }else {
                global.declareGlobalType(typeName, Type.getAbstract(global, typeName, "<" + typeName + ">"));
            }
        }
        //实现所有类型
        ctx.newtypeExpr().forEach(newtypeExpr -> visit(global, newtypeExpr));
        //声明所有函数
        for (HanCompilerParser.FunctionExprContext functionExpr : ctx.functionExpr()){
            String funcName = Func.funcName(functionExpr);
            if(global.globalFuncDeclared(funcName)){
                CompileErrorUtil.funcAlreadyDefined(functionExpr.getStart().getLine(), functionExpr.getStart().getCharPositionInLine(), functionExpr.getStart().getText());
            }else {
                try {
                    Func func = Func.create(global, functionExpr);
                    global.addGlobalFunc(func);
                    Decorator decorator = new Decorator(global, funcName);
                    decorator.processFunc(func, functionExpr);
                } catch (TypeNotFoundException e) {
                    CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
                } catch (TypeNestingException e) {
                    CompileErrorUtil.typeNestingNotAllowed(e.line, e.column ,e.type);
                } catch (ValueAlreadyDefinedException e) {
                    CompileErrorUtil.valueAlreadyDefined(e.line, e.column, e.value);
                } catch (FunctionArgsNotMatchException e) {
                    CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.require, e.given);
                }
            }
        }
        //遍历最外层
        visit(global, ctx.expr(), global.getGlobalType("int"), false);
        //分析函数
        for (HanCompilerParser.FunctionExprContext functionExpr : ctx.functionExpr()){
            String funcName = Func.funcName(functionExpr);
            Func func = global.getGlobalFunc(funcName);
            FuncScope scope = new FuncScope(func);
            global.addChildScope(scope);
            scope.setParentScope(global);
            Arrays.stream(func.argumentTypes.types).map(each -> Value.create(each.name, each, false)).forEach(scope::addValue);
            visit(scope, Func.funcInnerExprs(functionExpr), func.returnType, false);
        }
        //System.out.println(this.global);
        return null;
    }

    @Override
    public Void visitInnerCalcExpr(HanCompilerParser.InnerCalcExprContext ctx) {
        try {
            scope(scope(ctx), ctx.calcExpr());
            Calc.create(scope(ctx), ctx.calcExpr());
        } catch (IllegalCastException e) {
            CompileErrorUtil.illegalCast(e.line, e.column, e.to, e.from);
        } catch (TypeNotFoundException e) {
            CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
        } catch (IllegalOperatorException e) {
            CompileErrorUtil.operatorNotFound(e.line, e.column, e.operator, e.types);
        } catch (ValueNotFoundException e) {
            CompileErrorUtil.symbolNotFound(e.line, e.column, e.value);
        } catch (TypeNotMatchException e) {
            CompileErrorUtil.typeNotMatch(e.line, e.column, e.require, e.given);
        } catch (TypeNestingException e) {
            CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
        } catch (EmptyTempleException e) {
            CompileErrorUtil.emptyTempleNotAllowed(e.line, e.column);
        } catch (FunctionArgsNotMatchException e) {
            CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.given, e.require);
        } catch (FunctionNotFoundException e) {
            CompileErrorUtil.funcNotFound(e.line, e.column, e.function);
        }
        return null;
    }

    @Override
    public Void visitNewtypeExpr(HanCompilerParser.NewtypeExprContext ctx) {
        try {
            Type type = Type.get(global, ctx.ID().getText(), ctx.typeExpr());
            if(Objects.requireNonNull(type).toSingleType().type.equals("<"+ctx.ID().getText()+">")){
                CompileErrorUtil.typeNestingNotAllowed(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
            }else {
                global.addGlobalType(type);
            }
        } catch (TypeNotFoundException e) {
            CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(),
                    ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
        } catch (TypeNestingException e) {
            CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
        }
        return null;
    }

    @Override
    public Void visitInnerVarExpr(HanCompilerParser.InnerVarExprContext ctx) {
        return visit(scope(ctx), ctx.varExpr());
    }

    @Override
    public Void visitVarExpr(HanCompilerParser.VarExprContext ctx) {
        Scope scope = scope(ctx);
        HanCompilerParser.TypeExprContext typeCtx = ctx.typeExpr();
        if(!scope.canDefineValue(ctx.ID().getText())){
            CompileErrorUtil.valueAlreadyDefined(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
            return null;
        }
        if (typeCtx instanceof HanCompilerParser.BasicTypeExprContext) {
            scope.addValue(Value.create(
                    ctx.ID().getText(),
                    global.getGlobalType(Type.typeBasic2String(((HanCompilerParser.BasicTypeExprContext) typeCtx).type_basic())),
                    false
            ));
        } else if (typeCtx instanceof HanCompilerParser.CustomTypeExprContext) {
            try {
                scope.addValue(Value.create(
                        ctx.ID().getText(),
                        Objects.requireNonNull(Type.get(global, ((HanCompilerParser.CustomTypeExprContext) typeCtx).ID().getText(), typeCtx)).trim().expandIfAlias(),
                        false
                ));
            } catch (TypeNotFoundException e) {
                CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(),
                        ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
            } catch (TypeNestingException e) {
                CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
            }
        } else if (typeCtx instanceof HanCompilerParser.BasicArrayExprContext
                || typeCtx instanceof HanCompilerParser.CustomArrayExprContext
                || typeCtx instanceof HanCompilerParser.StructExprContext
                || typeCtx instanceof HanCompilerParser.FuncTypeExprContext) {
            try {
                String typeName = Type.typeString(typeCtx);
                global.addGlobalType(Type.get(global, typeName, typeCtx));
                scope.addValue(Value.create(
                        ctx.ID().getText(),
                        global.getGlobalType(typeName),
                        false
                ));
            } catch (TypeNotFoundException e) {
                CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(),
                        ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
            } catch (TypeNestingException e) {
                CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
            }
        }
        return null;
    }

    @Override
    public Void visitInnerConstExpr(HanCompilerParser.InnerConstExprContext ctx) {
        return visit(scope(ctx), ctx.constAndSetExpr());
    }

    @Override
    public Void visitConstAndSetExpr(HanCompilerParser.ConstAndSetExprContext ctx) {
        Scope scope = scope(ctx);
        HanCompilerParser.TypeExprContext typeCtx = ctx.typeExpr();
        String valueName = ctx.ID().getText();
        //如果有重复就拒绝添加
        if(!scope.canDefineValue(ctx.ID().getText())){
            CompileErrorUtil.valueAlreadyDefined(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), valueName);
            return null;
        }
        //先不管赋值对错，将它加入作用域中，如果发现出错再删掉
        if (typeCtx instanceof HanCompilerParser.BasicTypeExprContext) {
            scope.addValue(Value.create(
                    valueName,
                    global.getGlobalType(Type.typeBasic2String(((HanCompilerParser.BasicTypeExprContext) typeCtx).type_basic())),
                    true
            ));
        } else if (typeCtx instanceof HanCompilerParser.CustomTypeExprContext) {
            try {
                scope.addValue(Value.create(
                        valueName,
                        Type.get(global, ((HanCompilerParser.CustomTypeExprContext) typeCtx).ID().getText(), typeCtx),
                        true
                ));
            } catch (TypeNotFoundException e) {
                CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(),
                        ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
            } catch (TypeNestingException e) {
                CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
            }
        } else if (typeCtx instanceof HanCompilerParser.BasicArrayExprContext
                || typeCtx instanceof HanCompilerParser.CustomArrayExprContext
                || typeCtx instanceof HanCompilerParser.StructExprContext
                || typeCtx instanceof HanCompilerParser.FuncTypeExprContext) {
            try {
                String typeName = Type.typeString(typeCtx);
                global.addGlobalType(Type.get(global, typeName, typeCtx));
                scope.addValue(Value.create(
                        valueName,
                        global.getGlobalType(typeName),
                        true
                ));
            } catch (TypeNotFoundException e) {
                CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(),
                        ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
            } catch (TypeNestingException e) {
                CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
            }
        }
        //检查赋值类型是否正确
        Calc calc = null;
        try {
            scope(scope, ctx.calcExpr());
            calc = Calc.create(scope, ctx.calcExpr());
        } catch (IllegalCastException e) {
            CompileErrorUtil.illegalCast(e.line, e.column, e.to, e.from);
        } catch (TypeNotFoundException e) {
            CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
        } catch (IllegalOperatorException e) {
            CompileErrorUtil.operatorNotFound(e.line, e.column, e.operator, e.types);
        } catch (ValueNotFoundException e) {
            CompileErrorUtil.symbolNotFound(e.line, e.column, e.value);
        } catch (TypeNotMatchException e) {
            CompileErrorUtil.typeNotMatch(e.line, e.column, e.require, e.given);
        } catch (TypeNestingException e) {
            CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
        } catch (EmptyTempleException e) {
            CompileErrorUtil.emptyTempleNotAllowed(e.line, e.column);
        } catch (FunctionArgsNotMatchException e) {
            CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.given, e.require);
        } catch (FunctionNotFoundException e) {
            CompileErrorUtil.funcNotFound(e.line, e.column, e.function);
        }
        Value value = scope.getValue(valueName);
        if(calc != null && !value.getType().equals(calc.getType())){
            scope.removeValue(valueName);
            CompileErrorUtil.typeNotMatch(ctx.calcExpr().getStart().getLine(),
                    ctx.calcExpr().getStart().getCharPositionInLine(),
                    value.getType().toString(), calc.getType().toString());
        }
        return null;
    }

    @Override
    public Void visitInnerSetExpr(HanCompilerParser.InnerSetExprContext ctx) {
        return visit(scope(ctx), ctx.setExpr());
    }

    @Override
    public Void visitSetExpr(HanCompilerParser.SetExprContext ctx) {
        Scope scope = scope(ctx);
        //如果是声明并赋值，先行执行声明
        if(ctx.varExpr() != null){
            visit(scope, ctx.varExpr());
        }
        Value value;
        if(ctx.ID() != null){
            if(!scope.valueAvailable(ctx.ID().getText())){
                CompileErrorUtil.symbolNotFound(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
                return null;
            }
            value = scope.getValue(ctx.ID().getText());
        }else if(ctx.varExpr() != null){
            if(!scope.valueAvailable(ctx.varExpr().ID().getText())){
                CompileErrorUtil.symbolNotFound(ctx.varExpr().ID().getSymbol().getLine(), ctx.varExpr().ID().getSymbol().getCharPositionInLine(), ctx.varExpr().ID().getText());
                return null;
            }
            value = scope.getValue(ctx.varExpr().ID().getText());
        }else {
            return null;
        }
        if(value.constant){
            CompileErrorUtil.constCannotSet(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
            return null;
        }
        Calc calc = null;
        try {
            scope(scope, ctx.calcExpr());
            calc = Calc.create(scope, ctx.calcExpr());
        } catch (IllegalCastException e) {
            CompileErrorUtil.illegalCast(e.line, e.column, e.to, e.from);
        } catch (TypeNotFoundException e) {
            CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
        } catch (IllegalOperatorException e) {
            CompileErrorUtil.operatorNotFound(e.line, e.column, e.operator, e.types);
        } catch (ValueNotFoundException e) {
            CompileErrorUtil.symbolNotFound(e.line, e.column, e.value);
        } catch (TypeNotMatchException e) {
            CompileErrorUtil.typeNotMatch(e.line, e.column, e.require, e.given);
        } catch (TypeNestingException e) {
            CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
        } catch (EmptyTempleException e) {
            CompileErrorUtil.emptyTempleNotAllowed(e.line, e.column);
        } catch (FunctionArgsNotMatchException e) {
            CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.given, e.require);
        } catch (FunctionNotFoundException e) {
            CompileErrorUtil.funcNotFound(e.line, e.column, e.function);
        }
        if(calc != null && !value.getType().equals(calc.getType())){
            scope.removeValue(value);
            CompileErrorUtil.typeNotMatch(ctx.calcExpr().getStart().getLine(),
                    ctx.calcExpr().getStart().getCharPositionInLine(),
                    value.getType().type, calc.getType().type);
        }
        return null;
    }

    @Override
    public Void visitInnerIfElseExpr(HanCompilerParser.InnerIfElseExprContext ctx) {
        return visit(scope(ctx), returnType(ctx), ctx.ifelseExpr());
    }

    @Override
    public Void visitIfelseExpr(HanCompilerParser.IfelseExprContext ctx) {
        List<HanCompilerParser.IfbodyExprContext> ifbodyExprContexts = ctx.ifbodyExpr();
        IfElse ifelse = null;
        Scope scope = scope(ctx);
        for(int i=0; i< ifbodyExprContexts.size(); i++){
            HanCompilerParser.IfbodyExprContext ifbodyCtx = ifbodyExprContexts.get(i);
            try {
                if(i == 0){
                    ifelse = new If(scope, ifbodyCtx.calcExpr());
                }else {
                    ifelse = new Elif(Objects.requireNonNull(ifelse), ifbodyCtx.calcExpr());
                }
                scope.addChildScope(ifelse);
                visit(scope, ifbodyCtx.expr(), returnType(ctx), false);
            } catch (IllegalOperatorException e) {
                CompileErrorUtil.operatorNotFound(e.line, e.column, e.operator, e.types);
            } catch (TypeNotFoundException e) {
                CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
            } catch (IllegalCastException e) {
                CompileErrorUtil.illegalCast(e.line, e.column, e.to, e.from);
            } catch (TypeNotMatchException e) {
                CompileErrorUtil.conditionTypeNotMatch(e.line, e.column, i == 0 ? ctx.KEY_If().getText() : ctx.KEY_Elif(i).getText(), e.given, e.require);
            } catch (ValueNotFoundException e) {
                CompileErrorUtil.symbolNotFound(e.line, e.column, e.value);
            } catch (TypeNestingException e) {
                CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
            } catch (EmptyTempleException e) {
                CompileErrorUtil.emptyTempleNotAllowed(e.line, e.column);
            } catch (FunctionArgsNotMatchException e) {
                CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.given, e.require);
            } catch (FunctionNotFoundException e) {
                CompileErrorUtil.funcNotFound(e.line, e.column, e.function);
            }
        }
        HanCompilerParser.IfbodyEndExprContext ifbodyCtx = ctx.ifbodyEndExpr();
        if(ifbodyCtx != null){
            ifelse = new Else(ifelse);
            scope.addChildScope(ifelse);
            visit(scope, ifbodyCtx.expr(), returnType(ctx), false);
        }
        return null;
    }

    @Override
    public Void visitInnerWhileExpr(HanCompilerParser.InnerWhileExprContext ctx) {
        return visit(scope(ctx), returnType(ctx), ctx.whileExpr());
    }

    @Override
    public Void visitWhileExpr(HanCompilerParser.WhileExprContext ctx) {
        Scope scope = scope(ctx);
        try {
            While wh = new While(scope, ctx.calcExpr());
            scope.addChildScope(wh);
            visit(scope, ctx.expr(), returnType(ctx), true);
        } catch (IllegalOperatorException e) {
            CompileErrorUtil.operatorNotFound(e.line, e.column, e.operator, e.types);
        } catch (TypeNotFoundException e) {
            CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
        } catch (IllegalCastException e) {
            CompileErrorUtil.illegalCast(e.line, e.column, e.to, e.from);
        } catch (TypeNotMatchException e) {
            CompileErrorUtil.conditionTypeNotMatch(e.line, e.column, ctx.KEY_Loop().getText(), e.given, e.require);
        } catch (ValueNotFoundException e) {
            CompileErrorUtil.symbolNotFound(e.line, e.column, e.value);
        } catch (TypeNestingException e) {
            CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
        } catch (EmptyTempleException e) {
            CompileErrorUtil.emptyTempleNotAllowed(e.line, e.column);
        } catch (FunctionArgsNotMatchException e) {
            CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.given, e.require);
        } catch (FunctionNotFoundException e) {
            CompileErrorUtil.funcNotFound(e.line, e.column, e.function);
        }
        return null;
    }

    public Void visit(Scope scope, List<HanCompilerParser.ExprContext> exprs, Type returnType
            , boolean isLoop) {
        boolean ret = false;
        for (HanCompilerParser.ExprContext expr : exprs) {
            if(ret){
                CompileErrorUtil.illegalExprAfterControl(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
            }else {
                visit(scope, returnType, expr);
            }
            if(expr instanceof HanCompilerParser.InnerFlowExprContext){
                HanCompilerParser.InnerFlowExprContext IFlowExpr = ((HanCompilerParser.InnerFlowExprContext) expr);
                HanCompilerParser.FlowExprContext flowExpr = IFlowExpr.flowExpr();
                if(flowExpr.KEY_Return() != null){
                    ret = true;
                    if (returnType.type.equals("<null>")) {
                        if (flowExpr.calcExpr() != null) {
                            CompileErrorUtil.funcIllegalReturn(flowExpr.getStart().getLine(), flowExpr.getStart().getCharPositionInLine(), flowExpr.calcExpr().getText());
                        }
                    } else {
                        try {
                            scope(scope, flowExpr.calcExpr());
                            Calc calc = Calc.create(scope, flowExpr.calcExpr());
                            if (!returnType.equals(calc.getType())) {
                                CompileErrorUtil.funcReturnTypeNotMatch(flowExpr.calcExpr().getStart().getLine(), flowExpr.calcExpr().getStart().getCharPositionInLine(), returnType.type, calc.getType().type);
                            }
                        } catch (IllegalCastException e) {
                            CompileErrorUtil.illegalCast(e.line, e.column, e.to, e.from);
                        } catch (TypeNotFoundException e) {
                            CompileErrorUtil.typeNotFound(e.line, e.column, e.type);
                        } catch (IllegalOperatorException e) {
                            CompileErrorUtil.operatorNotFound(e.line, e.column, e.operator, e.types);
                        } catch (ValueNotFoundException e) {
                            CompileErrorUtil.symbolNotFound(e.line, e.column, e.value);
                        } catch (TypeNotMatchException e) {
                            CompileErrorUtil.typeNotMatch(e.line, e.column, e.require, e.given);
                        } catch (TypeNestingException e) {
                            CompileErrorUtil.typeNestingNotAllowed(e.line, e.column, e.type);
                        } catch (EmptyTempleException e) {
                            CompileErrorUtil.emptyTempleNotAllowed(e.line, e.column);
                        } catch (FunctionArgsNotMatchException e) {
                            CompileErrorUtil.funcArgsNotMatch(e.line, e.column, e.given, e.require);
                        } catch (FunctionNotFoundException e) {
                            CompileErrorUtil.funcNotFound(e.line, e.column, e.function);
                        }
                    }
                }else {
                    if(!isLoop) {
                        CompileErrorUtil.illegalControlExpr(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                    }
                }
            }
        }
        return null;
    }

    public Void visit(Scope scope, ParseTree tree) {
        ast2scope.put(tree, scope);
        return super.visit(tree);
    }

    public Void visit(Scope scope, Type returnType, ParseTree tree) {
        ast2scope.put(tree, scope);
        ast2returnType.put(tree, returnType);
        return super.visit(tree);
    }

    public Void scope(Scope scope, ParseTree tree){
        ast2scope.put(tree, scope);
        return null;
    }

    public Scope scope(ParseTree tree) {
        return ast2scope.get(tree);
    }

    public Type returnType(ParseTree tree) {
        return ast2returnType.get(tree);
    }

}
