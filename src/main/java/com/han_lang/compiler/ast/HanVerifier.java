package com.han_lang.compiler.ast;

import com.han_lang.compiler.CompileErrorUtil;
import com.han_lang.compiler.analysis.*;
import com.han_lang.compiler.analysis.exception.*;
import com.han_lang.compiler.analysis.scope.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;
import java.util.Objects;

public class HanVerifier extends HanCompilerBaseVisitor<Void> {
    Global global;
    ParseTreeProperty<Scope> ast2scope = new ParseTreeProperty<>();

    public HanVerifier(Global global){
        this.global = global;
    }

    @Override
    public Void visitProgram(HanCompilerParser.ProgramContext ctx) {
        boolean ret = false;
        //声明所有类型和函数
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
        //实现所有类型和函数
        for (HanCompilerParser.NewtypeExprContext newtypeExpr : ctx.newtypeExpr()){
            visit(global, newtypeExpr);
        }
        for (HanCompilerParser.ExprContext expr : ctx.expr()) {
            if(expr instanceof HanCompilerParser.InnerFlowExprContext){
                if(((HanCompilerParser.InnerFlowExprContext) expr).flowExpr().KEY_Return() != null){
                    ret = true; continue;
                }else {
                    CompileErrorUtil.illegalControlExpr(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                }
            }
            if(ret){
                CompileErrorUtil.illegalExprAfterControl(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
            }else {
                visit(global, expr);
            }
        }
        System.out.println(this.global);
        return null;
    }

    @Override
    public Void visitNewtypeExpr(HanCompilerParser.NewtypeExprContext ctx) {
        try {
            global.addGlobalType(Type.get(global, ctx.ID().getText(), ctx.typeExpr()));
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
                        Type.get(global, ((HanCompilerParser.CustomTypeExprContext) typeCtx).ID().getText(), typeCtx),
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
                || typeCtx instanceof HanCompilerParser.StructExprContext) {
            try {
                String typeName = Type.typeId(typeCtx);
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
                || typeCtx instanceof HanCompilerParser.StructExprContext) {
            try {
                String typeName = Type.typeId(typeCtx);
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
            calc = Calc.create(scope, ctx.calcExpr());
        } catch (IllegalCastException e) {
            CompileErrorUtil.printErrNode(ctx);
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
        Calc calc = null;
        try {
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
        return visit(scope(ctx), ctx.ifelseExpr());
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
                boolean ret = false;
                for(HanCompilerParser.ExprContext expr : ifbodyCtx.expr()){
                    if(expr instanceof HanCompilerParser.InnerFlowExprContext){
                        if(((HanCompilerParser.InnerFlowExprContext) expr).flowExpr().KEY_Return() != null){
                            ret = true; continue;
                        }else {
                            CompileErrorUtil.illegalControlExpr(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                        }
                    }
                    if(ret){
                        CompileErrorUtil.illegalExprAfterControl(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                    }else {
                        visit(ifelse, expr);
                    }
                }
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
            }
        }
        HanCompilerParser.IfbodyEndExprContext ifbodyCtx = ctx.ifbodyEndExpr();
        if(ifbodyCtx != null){
            ifelse = new Else(ifelse);
            scope.addChildScope(ifelse);
            boolean ret = false;
            for(HanCompilerParser.ExprContext expr : ifbodyCtx.expr()){
                if(expr instanceof HanCompilerParser.InnerFlowExprContext){
                    if(((HanCompilerParser.InnerFlowExprContext) expr).flowExpr().KEY_Return() != null){
                        ret = true; continue;
                    }else {
                        CompileErrorUtil.illegalControlExpr(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                    }
                }
                if(ret){
                    CompileErrorUtil.illegalExprAfterControl(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                }else {
                    visit(ifelse, expr);
                }
            }
        }
        return null;
    }

    @Override
    public Void visitInnerWhileExpr(HanCompilerParser.InnerWhileExprContext ctx) {
        return visit(scope(ctx), ctx.whileExpr());
    }

    @Override
    public Void visitWhileExpr(HanCompilerParser.WhileExprContext ctx) {
        Scope scope = scope(ctx);
        try {
            While wh = new While(scope, ctx.calcExpr());
            scope.addChildScope(wh);
            boolean ret = false;
            for(HanCompilerParser.ExprContext expr : ctx.expr()){
                if(expr instanceof HanCompilerParser.InnerFlowExprContext){
                    if(((HanCompilerParser.InnerFlowExprContext) expr).flowExpr().KEY_Return() != null){
                        ret = true; continue;
                    }else {
                        CompileErrorUtil.illegalControlExpr(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                    }
                }
                if(ret){
                    CompileErrorUtil.illegalExprAfterControl(expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), expr.getText());
                }else {
                    visit(wh, expr);
                }
            }
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
        }
        return null;
    }

    public Void visit(Scope scope, ParseTree tree) {
        ast2scope.put(tree, scope);
        return super.visit(tree);
    }

    public Scope scope(ParseTree tree) {
        return ast2scope.get(tree);
    }

}
