package com.han_lang.compiler.analysis;

import com.han_lang.compiler.analysis.exception.FunctionArgsNotMatchException;
import com.han_lang.compiler.analysis.exception.TypeNestingException;
import com.han_lang.compiler.analysis.exception.TypeNotFoundException;
import com.han_lang.compiler.ast.HanCompilerParser;

public class Decorator {
    public Global global;
    public String name;

    public Decorator(Global global, String name) {
        this.global = global;
        this.name = name;
    }

    public void processFunc(Func func, HanCompilerParser.FunctionExprContext declareCtx) throws TypeNestingException, TypeNotFoundException, FunctionArgsNotMatchException {
        HanCompilerParser.DecoratorExprContext decoratorExpr = Func.funcInnerDecoratorExpr(declareCtx);
        if(decoratorExpr instanceof HanCompilerParser.DecoratorCastContext){
            HanCompilerParser.DecoratorCastContext ctx = (HanCompilerParser.DecoratorCastContext) decoratorExpr;
            Type from = Type.get(func.global, "from", ctx.typeExpr(0));
            Type to = Type.get(func.global, "to", ctx.typeExpr(1));
            TypeSet args = new TypeSet(from, to);
            if(args.equals(func.signatureTypeSet())){
                global.addCaster(func);
            }else {
                throw new FunctionArgsNotMatchException(declareCtx.getStart().getLine(), declareCtx.getStart().getCharPositionInLine(), args.toString(), func.signatureTypeSet().toString());
            }
        }else if(decoratorExpr instanceof HanCompilerParser.DecoratorOp1Context){
            HanCompilerParser.DecoratorOp1Context ctx = (HanCompilerParser.DecoratorOp1Context) decoratorExpr;
            String op = Calc.operatorId(ctx.operator1());
            Type from = Type.get(func.global, "from", ctx.typeExpr(0));
            Type to = Type.get(func.global, "to", ctx.typeExpr(1));
            TypeSet args = new TypeSet(from, to);
            if(args.equals(func.signatureTypeSet())){
                global.addOperator(op, func);
            }else {
                throw new FunctionArgsNotMatchException(declareCtx.getStart().getLine(), declareCtx.getStart().getCharPositionInLine(), args.toString(), func.signatureTypeSet().toString());
            }
        }else if(decoratorExpr instanceof HanCompilerParser.DecoratorOpEndContext){
            HanCompilerParser.DecoratorOpEndContext ctx = (HanCompilerParser.DecoratorOpEndContext) decoratorExpr;
            String op = Calc.operatorId(ctx.operatorEnd());
            Type from = Type.get(func.global, "from", ctx.typeExpr(0));
            Type to = Type.get(func.global, "to", ctx.typeExpr(1));
            TypeSet args = new TypeSet(from, to);
            if(args.equals(func.signatureTypeSet())){
                global.addOperator(op, func);
            }else {
                throw new FunctionArgsNotMatchException(declareCtx.getStart().getLine(), declareCtx.getStart().getCharPositionInLine(), args.toString(), func.signatureTypeSet().toString());
            }
        }else if(decoratorExpr instanceof HanCompilerParser.DecoratorOp2Context){
            HanCompilerParser.DecoratorOp2Context ctx = (HanCompilerParser.DecoratorOp2Context) decoratorExpr;
            String op = Calc.operatorId(ctx.operator_all());
            Type from1 = Type.get(func.global, "from", ctx.typeExpr(0));
            Type from2 = Type.get(func.global, "from", ctx.typeExpr(1));
            Type to = Type.get(func.global, "to", ctx.typeExpr(2));
            TypeSet args = new TypeSet(from1, from2, to);
            if(args.equals(func.signatureTypeSet())){
                global.addOperator(op, func);
            }else {
                throw new FunctionArgsNotMatchException(declareCtx.getStart().getLine(), declareCtx.getStart().getCharPositionInLine(), args.toString(), func.signatureTypeSet().toString());
            }
        }
    }
}
