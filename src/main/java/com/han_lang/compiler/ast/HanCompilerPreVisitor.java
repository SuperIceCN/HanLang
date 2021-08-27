package com.han_lang.compiler.ast;

import com.han_lang.compiler.CompileErrorUtil;
import com.han_lang.compiler.symbol.BaseScope;
import com.han_lang.compiler.symbol.RuntimeType;
import com.han_lang.compiler.symbol.exception.SymbolConflictException;
import com.han_lang.compiler.symbol.scope.GlobalScope;
import com.han_lang.compiler.symbol.symbol.ConstantSymbol;
import com.han_lang.compiler.symbol.symbol.TypeSymbol;
import com.han_lang.compiler.symbol.symbol.VariableSymbol;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class HanCompilerPreVisitor extends HanCompilerBaseVisitor<VisitResult>{
    GlobalScope globalScope = new GlobalScope();
    ParseTreeProperty<BaseScope> ast2scope = new ParseTreeProperty<>();

    @Override
    public VisitResult visitProgram(HanCompilerParser.ProgramContext ctx) {
        System.out.println("Start visiting program...");
        boolean ok = true;
        //遍历所有子表达式节点
        for(HanCompilerParser.ExprContext expr: ctx.expr()){
            ast2scope.put(expr, globalScope);
            ok = ok && visit(expr).Ok();
        }
        System.out.println(globalScope);
        if(!ok) System.err.println("程序存在错误，请修正。");
        return ok ? VisitResult.defaultOk() : VisitResult.newErr();
    }

    @Override
    public VisitResult visitOperator1(HanCompilerParser.Operator1Context ctx) {
        return super.visitOperator1(ctx);
    }

    @Override
    public VisitResult visitOperator2_p1(HanCompilerParser.Operator2_p1Context ctx) {
        return super.visitOperator2_p1(ctx);
    }

    @Override
    public VisitResult visitOperator2_p2(HanCompilerParser.Operator2_p2Context ctx) {
        return super.visitOperator2_p2(ctx);
    }

    @Override
    public VisitResult visitOperator2_p3(HanCompilerParser.Operator2_p3Context ctx) {
        return super.visitOperator2_p3(ctx);
    }

    @Override
    public VisitResult visitOperator2_p4(HanCompilerParser.Operator2_p4Context ctx) {
        return super.visitOperator2_p4(ctx);
    }

    @Override
    public VisitResult visitOperator2_p5(HanCompilerParser.Operator2_p5Context ctx) {
        return super.visitOperator2_p5(ctx);
    }

    @Override
    public VisitResult visitOperator_all(HanCompilerParser.Operator_allContext ctx) {
        return super.visitOperator_all(ctx);
    }

    @Override
    public VisitResult visitType_basic(HanCompilerParser.Type_basicContext ctx) {
        return super.visitType_basic(ctx);
    }

    @Override
    public VisitResult visitInnerVarExpr(HanCompilerParser.InnerVarExprContext ctx) {
        linkScope(ctx, ctx.varExpr());
        return visit(ctx.varExpr());
    }

    @Override
    public VisitResult visitInnerConstExpr(HanCompilerParser.InnerConstExprContext ctx) {
        linkScope(ctx, ctx.constAndSetExpr());
        return visit(ctx.constAndSetExpr());
    }

    @Override
    public VisitResult visitInnerSetExpr(HanCompilerParser.InnerSetExprContext ctx) {
        linkScope(ctx, ctx.setExpr());
        return visit(ctx.setExpr());
    }

    @Override
    public VisitResult visitInnerCalcExpr(HanCompilerParser.InnerCalcExprContext ctx) {
        return visit(ctx.calcExpr());
    }

    @Override
    public VisitResult visitInnerIfElseExpr(HanCompilerParser.InnerIfElseExprContext ctx) {
        return visit(ctx.ifelseExpr());
    }

    @Override
    public VisitResult visitInnerWhileExpr(HanCompilerParser.InnerWhileExprContext ctx) {
        return visit(ctx.whileExpr());
    }

    @Override
    public VisitResult visitVarExpr(HanCompilerParser.VarExprContext ctx) {
        if(RuntimeType.typeValid(ast2scope.get(ctx), ctx.typeExpr())){
            try {
                VariableSymbol variableSymbol = VariableSymbol.create(ast2scope.get(ctx), ctx);
                return VisitResult.defaultOk();
            } catch (SymbolConflictException e) {
                CompileErrorUtil.symbolConflict(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
                return VisitResult.newErr();
            }
        }else {
            CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(), ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
            return VisitResult.newErr();
        }
    }

    @Override
    public VisitResult visitConstAndSetExpr(HanCompilerParser.ConstAndSetExprContext ctx) {
        if(RuntimeType.typeValid(ast2scope.get(ctx), ctx.typeExpr())){
            try {
                ConstantSymbol constantSymbol = ConstantSymbol.create(ast2scope.get(ctx), ctx);
                return VisitResult.defaultOk();
            } catch (SymbolConflictException e) {
                CompileErrorUtil.symbolConflict(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
                return VisitResult.newErr();
            }
        }else {
            CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(), ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
            return VisitResult.newErr();
        }
    }

    @Override
    public VisitResult visitNewtypeExpr(HanCompilerParser.NewtypeExprContext ctx) {
        BaseScope scope = ast2scope.get(ctx);
        try {
            TypeSymbol typeSymbol = TypeSymbol.abstractCreate(scope, ctx);
            if(RuntimeType.typeValid(scope, ctx.typeExpr())){
                scope.removeSymbol(typeSymbol.symbolName);
                typeSymbol = TypeSymbol.create(scope, ctx);
                return VisitResult.defaultOk();
            }else {
                scope.removeSymbol(typeSymbol.symbolName);
                CompileErrorUtil.typeNotFound(ctx.typeExpr().getStart().getLine(), ctx.typeExpr().getStart().getCharPositionInLine(), ctx.typeExpr().getText());
                return VisitResult.newErr();
            }
        } catch (SymbolConflictException e) {
            CompileErrorUtil.symbolConflict(ctx.ID().getSymbol().getLine(), ctx.ID().getSymbol().getCharPositionInLine(), ctx.ID().getText());
            return VisitResult.newErr();
        }
    }

    @Override
    public VisitResult visitTypeEntryPart(HanCompilerParser.TypeEntryPartContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitTypeEntryEnd(HanCompilerParser.TypeEntryEndContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitBasicTypeExpr(HanCompilerParser.BasicTypeExprContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitBasicArrayExpr(HanCompilerParser.BasicArrayExprContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitCustomTypeExpr(HanCompilerParser.CustomTypeExprContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitCustomArrayExpr(HanCompilerParser.CustomArrayExprContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitStructExpr(HanCompilerParser.StructExprContext ctx) {
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult visitSetExpr(HanCompilerParser.SetExprContext ctx) {
        linkScope(ctx, ctx.calcExpr());
        if(visit(ctx.calcExpr()).Ok()){
            if(ctx.varExpr() != null){
                linkScope(ctx, ctx.varExpr());
                if(visit(ctx.varExpr()).Ok()){
                    ast2scope.get(ctx).recordSet(ctx.varExpr().ID().getText(), ctx);
                    return VisitResult.defaultOk();
                }
            }else if(ctx.ID() != null){
                if(!ast2scope.get(ctx).recordSet(ctx.ID().getText(), ctx)){
                    CompileErrorUtil.symbolNotFound(ast2scope.get(ctx), ctx.ID().getText());
                    return VisitResult.newErr();
                }else {
                    return VisitResult.defaultOk();
                }
            }
        }
        return VisitResult.newErr();
    }

    @Override
    public VisitResult visitLExpr(HanCompilerParser.LExprContext ctx) {
        return super.visitLExpr(ctx);
    }

    @Override
    public VisitResult visitC2Expr(HanCompilerParser.C2ExprContext ctx) {
        return super.visitC2Expr(ctx);
    }

    @Override
    public VisitResult visitGDExpr(HanCompilerParser.GDExprContext ctx) {
        return super.visitGDExpr(ctx);
    }

    @Override
    public VisitResult visitC2ExprB(HanCompilerParser.C2ExprBContext ctx) {
        return super.visitC2ExprB(ctx);
    }

    @Override
    public VisitResult visitLBExpr(HanCompilerParser.LBExprContext ctx) {
        return super.visitLBExpr(ctx);
    }

    @Override
    public VisitResult visitGCExpr(HanCompilerParser.GCExprContext ctx) {
        return super.visitGCExpr(ctx);
    }

    @Override
    public VisitResult visitC1Expr(HanCompilerParser.C1ExprContext ctx) {
        return super.visitC1Expr(ctx);
    }

    @Override
    public VisitResult visitIExpr(HanCompilerParser.IExprContext ctx) {
        return super.visitIExpr(ctx);
    }

    @Override
    public VisitResult visitArgPartExpr(HanCompilerParser.ArgPartExprContext ctx) {
        return super.visitArgPartExpr(ctx);
    }

    @Override
    public VisitResult visitArgEndExpr(HanCompilerParser.ArgEndExprContext ctx) {
        return super.visitArgEndExpr(ctx);
    }

    @Override
    public VisitResult visitReturnExpr(HanCompilerParser.ReturnExprContext ctx) {
        return super.visitReturnExpr(ctx);
    }

    @Override
    public VisitResult visitFunRA(HanCompilerParser.FunRAContext ctx) {
        return super.visitFunRA(ctx);
    }

    @Override
    public VisitResult visitFunA(HanCompilerParser.FunAContext ctx) {
        return super.visitFunA(ctx);
    }

    @Override
    public VisitResult visitFunR(HanCompilerParser.FunRContext ctx) {
        return super.visitFunR(ctx);
    }

    @Override
    public VisitResult visitFun(HanCompilerParser.FunContext ctx) {
        return super.visitFun(ctx);
    }

    @Override
    public VisitResult visitIfbodyExpr(HanCompilerParser.IfbodyExprContext ctx) {
        return super.visitIfbodyExpr(ctx);
    }

    @Override
    public VisitResult visitIfbodyEndExpr(HanCompilerParser.IfbodyEndExprContext ctx) {
        return super.visitIfbodyEndExpr(ctx);
    }

    @Override
    public VisitResult visitIfelseExpr(HanCompilerParser.IfelseExprContext ctx) {
        return super.visitIfelseExpr(ctx);
    }

    @Override
    public VisitResult visitWhileExpr(HanCompilerParser.WhileExprContext ctx) {
        return super.visitWhileExpr(ctx);
    }

    @Override
    public VisitResult visitLiteral(HanCompilerParser.LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    protected VisitResult defaultResult() {
        return new VisitResult(Status.Ok);
    }

    @Override
    public VisitResult visit(ParseTree tree) {
        System.out.println("Visit: " + tree.getText());
        return super.visit(tree);
    }

    public void visitOk(ParserRuleContext tree) {
        VisitResult childVisitResult;
        childVisitResult = visit(tree);
        if(!childVisitResult.Ok()){
            CompileErrorUtil.printErrNode(tree);
        }
    }

    public void linkScope(ParseTree to, ParseTree... from){
        BaseScope target = ast2scope.get(to);
        for (ParseTree each : from){
            ast2scope.put(each, target);
        }
    }
}
