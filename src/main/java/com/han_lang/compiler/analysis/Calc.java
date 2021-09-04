package com.han_lang.compiler.analysis;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.exception.*;
import com.han_lang.compiler.ast.HanCompilerParser;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class Calc {
    @Expose
    public Type resultType = null;
    @Expose
    public String text;
    @Expose
    public boolean isFunc = false;

    protected Calc(Type type, String text) {
        this.resultType = type;
        this.text = text;
        if(type.isFunc()){
            this.setFunc(true);
        }
    }

    public Type getType() {
        return this.resultType;
    }

    public boolean isFunc() {
        return isFunc;
    }

    public Calc setFunc(boolean func) {
        isFunc = func;
        return this;
    }

    public static Calc create(Scope scope, HanCompilerParser.CalcExprContext ctx) throws IllegalCastException, TypeNotFoundException, IllegalOperatorException, ValueNotFoundException, TypeNotMatchException, TypeNestingException, EmptyTempleException, FunctionArgsNotMatchException, FunctionNotFoundException {
        if (ctx instanceof HanCompilerParser.LExprContext) {
            return make(scope, (HanCompilerParser.LExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.CastExprContext) {
            return make(scope, (HanCompilerParser.CastExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.LBExprContext) {
            return make(scope, (HanCompilerParser.LBExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.C1ExprContext) {
            return make(scope, (HanCompilerParser.C1ExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.C2ExprContext) {
            return make(scope, (HanCompilerParser.C2ExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.GDExprContext) {
            return make(scope, (HanCompilerParser.GDExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.GCExprContext) {
            return make(scope, (HanCompilerParser.GCExprContext) ctx);
        } else if (ctx instanceof HanCompilerParser.C2ExprBContext) {
            return make(scope, (HanCompilerParser.C2ExprBContext) ctx);
        } else if (ctx instanceof HanCompilerParser.ECExprContext) {
            return make(scope, (HanCompilerParser.ECExprContext) ctx);
        }else if(ctx instanceof HanCompilerParser.TExprContext){
            return make(scope, (HanCompilerParser.TExprContext) ctx);
        }else if(ctx instanceof HanCompilerParser.IExprContext){
            return make(scope, (HanCompilerParser.IExprContext) ctx);
        } else if(ctx instanceof HanCompilerParser.FPtrExprContext){
            return make(scope, (HanCompilerParser.FPtrExprContext) ctx);
        }
        return new Calc(new Type(scope.getGlobal(), "error", "<null>"), "error");
    }

    private static Calc make(Scope scope, HanCompilerParser.LExprContext declareCtx) throws ValueNotFoundException {
        String text = declareCtx.getText();
        if (declareCtx.literal() != null) {
            HanCompilerParser.LiteralContext ctx = declareCtx.literal();
            if (ctx.BOOL() != null) {
                return new Calc(scope.getGlobal().getGlobalType("bool"), text);
            } else if (ctx.STRING() != null) {
                return new Calc(scope.getGlobal().getGlobalType("string"), text);
            } else if (ctx.INT() != null) {
                return new Calc(scope.getGlobal().getGlobalType("int"), text);
            } else if (ctx.DEC() != null) {
                return new Calc(scope.getGlobal().getGlobalType("dec"), text);
            }
        } else if (declareCtx.ID() != null) {
            String valueName = declareCtx.ID().getText();
            if (scope.valueAvailable(valueName))
                return new Calc(scope.getValue(valueName).valueType, text);
            else if(scope.getGlobal().hasGlobalFunc(valueName))
                return new Calc(Type.getAbstract(scope.getGlobal(), valueName, "<"+scope.getGlobal().getGlobalFunc(valueName).signatureString()+">"), text);
            else
                throw new ValueNotFoundException(declareCtx.ID().getSymbol().getLine(), declareCtx.ID().getSymbol().getCharPositionInLine(), valueName);
        }
        return null;
    }

    private static Calc make(Scope scope, HanCompilerParser.LBExprContext declareCtx) throws ValueNotFoundException {
        String text = declareCtx.getText();
        if (declareCtx.literal() != null) {
            HanCompilerParser.LiteralContext ctx = declareCtx.literal();
            if (ctx.BOOL() != null) {
                return new Calc(scope.getGlobal().getGlobalType("bool"), text);
            } else if (ctx.STRING() != null) {
                return new Calc(scope.getGlobal().getGlobalType("string"), text);
            } else if (ctx.INT() != null) {
                return new Calc(scope.getGlobal().getGlobalType("int"), text);
            } else if (ctx.DEC() != null) {
                return new Calc(scope.getGlobal().getGlobalType("dec"), text);
            }
        } else if (declareCtx.ID() != null) {
            String valueName = declareCtx.ID().getText();
            if (scope.valueAvailable(valueName))
                return new Calc(scope.getValue(valueName).valueType, text);
            else if(scope.getGlobal().hasGlobalFunc(valueName))
                return new Calc(Type.getAbstract(scope.getGlobal(), valueName, "<"+scope.getGlobal().getGlobalFunc(valueName).signatureString()+">"), text);
            else
                throw new ValueNotFoundException(declareCtx.ID().getSymbol().getLine(), declareCtx.ID().getSymbol().getCharPositionInLine(), valueName);
        }
        return null;
    }

    private static Calc make(Scope scope, HanCompilerParser.CastExprContext castCtx) throws TypeNotFoundException, IllegalCastException, IllegalOperatorException, ValueNotFoundException, TypeNotMatchException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        Calc calc = Calc.create(scope, castCtx.calcExpr());
        TypeSet casting = new TypeSet(calc.getType(), Type.get(scope.getGlobal(), Type.typeString(castCtx.typeExpr()), castCtx.typeExpr()));
        if (scope.getGlobal().hasCaster(casting)) {
            return new Calc(scope.getGlobal().getCaster(casting).setUsed().returnType, castCtx.getText());
        } else {
            throw new IllegalCastException(castCtx.KEY_Cast().getSymbol().getLine(), castCtx.KEY_Cast().getSymbol().getCharPositionInLine(), calc.getType().type, Type.typeId(castCtx.typeExpr()));
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.C1ExprContext c1Ctx) throws TypeNotFoundException, IllegalCastException, IllegalOperatorException, ValueNotFoundException, TypeNotMatchException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        String op = operatorId(c1Ctx.operator1());
        TypeSet args = new TypeSet(create(scope, c1Ctx.calcExpr()).getType());
        if (scope.getGlobal().hasOperator(op, args)) {
            return new Calc(scope.getGlobal().getOperator(op, args).setUsed().returnType, c1Ctx.getText());
        } else {
            throw new IllegalOperatorException(c1Ctx.operator1().getStart().getLine(), c1Ctx.operator1().getStart().getCharPositionInLine(), c1Ctx.operator1().getText(), args);
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.C2ExprContext c2Ctx) throws IllegalOperatorException, TypeNotFoundException, IllegalCastException, ValueNotFoundException, TypeNotMatchException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        String op = "";
        Token token = c2Ctx.getStart();//这里为了防止极端情况NPException
        if (c2Ctx.operator2_p1() != null) {
            op = operatorId(c2Ctx.operator2_p1());
            token = c2Ctx.operator2_p1().getStart();
        } else if (c2Ctx.operator2_p2() != null) {
            op = operatorId(c2Ctx.operator2_p2());
            token = c2Ctx.operator2_p2().getStart();
        } else if (c2Ctx.operator2_p3() != null) {
            op = operatorId(c2Ctx.operator2_p3());
            token = c2Ctx.operator2_p3().getStart();
        } else if (c2Ctx.operator2_p4() != null) {
            op = operatorId(c2Ctx.operator2_p4());
            token = c2Ctx.operator2_p4().getStart();
        } else if (c2Ctx.operator2_p5() != null) {
            op = operatorId(c2Ctx.operator2_p5());
            token = c2Ctx.operator2_p5().getStart();
        }
        TypeSet args = new TypeSet(create(scope, c2Ctx.calcExpr(0)).getType(), create(scope, c2Ctx.calcExpr(1)).getType());
        if (scope.getGlobal().hasOperator(op, args)) {
            return new Calc(scope.getGlobal().getOperator(op, args).setUsed().returnType, c2Ctx.getText());
        } else {
            throw new IllegalOperatorException(token.getLine(), token.getCharPositionInLine(), token.getText(), args);
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.C2ExprBContext c2bCtx) throws TypeNotMatchException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, IllegalOperatorException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        String op = "";
        Token token = c2bCtx.start;//这里为了防止极端情况NPException
        if (c2bCtx.operator_all().operator2_p1() != null) {
            op = operatorId(c2bCtx.operator_all().operator2_p1());
            token = c2bCtx.operator_all().operator2_p1().getStart();
        } else if (c2bCtx.operator_all().operator2_p2() != null) {
            op = operatorId(c2bCtx.operator_all().operator2_p2());
            token = c2bCtx.operator_all().operator2_p2().getStart();
        } else if (c2bCtx.operator_all().operator2_p3() != null) {
            op = operatorId(c2bCtx.operator_all().operator2_p3());
            token = c2bCtx.operator_all().operator2_p3().getStart();
        } else if (c2bCtx.operator_all().operator2_p4() != null) {
            op = operatorId(c2bCtx.operator_all().operator2_p4());
            token = c2bCtx.operator_all().operator2_p4().getStart();
        } else if (c2bCtx.operator_all().operator2_p5() != null) {
            op = operatorId(c2bCtx.operator_all().operator2_p5());
            token = c2bCtx.operator_all().operator2_p5().getStart();
        }
        TypeSet args = new TypeSet(create(scope, c2bCtx.calcExpr(0)).getType(), create(scope, c2bCtx.calcExpr(1)).getType());
        if (scope.getGlobal().hasOperator(op, args)) {
            return new Calc(scope.getGlobal().getOperator(op, args).setUsed().returnType, c2bCtx.getText());
        } else {
            throw new IllegalOperatorException(token.getLine(), token.getCharPositionInLine(), token.getText(), args);
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.GDExprContext gdCtx) throws IllegalOperatorException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, TypeNotMatchException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        Calc calc = Calc.create(scope, gdCtx.calcExpr());
        if (gdCtx.ID() != null) {
            Type got = calc.getType().expand().matchSubtype(gdCtx.ID().getText());
            if (got != null) {
                return new Calc(got, gdCtx.getText());
            } else {
                throw new ValueNotFoundException(gdCtx.ID().getSymbol().getLine(), gdCtx.ID().getSymbol().getCharPositionInLine(), gdCtx.ID().getText());
            }
        } else {
            Type got = calc.getType();
            if(got != null){
                if (got.isArray()) {
                    return new Calc(got.toSingleType(), gdCtx.getText());
                } else {
                    throw new TypeNotMatchException(gdCtx.getStart().getLine(), gdCtx.getStart().getCharPositionInLine(),
                            got.toArrayType(1).type, got.type);
                }
            } else {
                throw new ValueNotFoundException(gdCtx.ID().getSymbol().getLine(), gdCtx.ID().getSymbol().getCharPositionInLine(), gdCtx.ID().getText());
            }
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.GCExprContext gcCtx) throws TypeNotMatchException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, IllegalOperatorException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        HanCompilerParser.CalcExprContext targetExpr = gcCtx.calcExpr(0);
        Calc target = Calc.create(scope, targetExpr);
        if (target.getType().isArray()) {
            HanCompilerParser.CalcExprContext getExpr = gcCtx.calcExpr(1);
            Calc get = Calc.create(scope, getExpr);
            if (get.getType().isInteger()) {
                return new Calc(target.getType().toSingleType(), gcCtx.getText());
            } else {
                throw new TypeNotMatchException(getExpr.getStart().getLine(), getExpr.getStart().getCharPositionInLine(),
                        scope.getGlobal().getGlobalType("int").toArrayType(1).type, get.getType().type);
            }
        } else {
            throw new TypeNotMatchException(targetExpr.getStart().getLine(), targetExpr.getStart().getCharPositionInLine(),
                    target.getType().toArrayType(1).type, target.getType().type);
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.ECExprContext ecCtx) throws TypeNotMatchException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, IllegalOperatorException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        String op = operatorId(ecCtx.operatorEnd());
        TypeSet args = new TypeSet(create(scope, ecCtx.calcExpr()).getType());
        if (scope.getGlobal().hasOperator(op, args)) {
            return new Calc(scope.getGlobal().getOperator(op, args).setUsed().returnType, ecCtx.getText());
        } else {
            throw new IllegalOperatorException(ecCtx.operatorEnd().getStart().getLine(), ecCtx.operatorEnd().getStart().getCharPositionInLine(), ecCtx.operatorEnd().getText(), args);
        }
    }

    private static Calc make(Scope scope, HanCompilerParser.TExprContext tCtx) throws EmptyTempleException, TypeNotMatchException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, IllegalOperatorException, TypeNestingException, FunctionNotFoundException, FunctionArgsNotMatchException {
        HanCompilerParser.TempleExprContext templeExpr = tCtx.templeExpr();
        if(templeExpr instanceof HanCompilerParser.EmptyTempleContext){
            throw new EmptyTempleException(templeExpr.getStart().getLine(), templeExpr.getStart().getCharPositionInLine());
        }else if(templeExpr instanceof HanCompilerParser.ArrayTempleContext){
            HanCompilerParser.ArrayTempleContext ctx = (HanCompilerParser.ArrayTempleContext) templeExpr;
            Calc ele = null;
            Calc tmp;
            for(int i=0;i<ctx.templePart().size();i++){
                tmp = create(scope, ctx.templePart(i).calcExpr());
                if(ele != null){
                    if(!tmp.getType().type.equals(ele.getType().type)){
                        throw new TypeNotMatchException(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ele.getType().type, tmp.getType().type);
                    }
                }else {
                    ele = tmp;
                }
            }
            tmp = create(scope, ctx.templeEnd().calcExpr());
            if(ele != null){
                if(!tmp.getType().type.equals(ele.getType().type)){
                    throw new TypeNotMatchException(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), ele.getType().type, tmp.getType().type);
                }
            }else {
                ele = tmp;
            }
            return new Calc(ele.getType().toArrayType(ctx.templePart().size() + 1), ctx.getText());
        }else if(templeExpr instanceof HanCompilerParser.StructTempleContext){
            HanCompilerParser.StructTempleContext ctx = (HanCompilerParser.StructTempleContext) templeExpr;
            List<Calc> calcList = new ArrayList<>(ctx.templePart().size() + 1);
            for(HanCompilerParser.TemplePartContext each : ctx.templePart()){
                calcList.add(create(scope, each.calcExpr()));
            }
            calcList.add(create(scope, ctx.templeEnd().calcExpr()));
            StringBuilder typeStringBuilder = new StringBuilder();
            calcList.forEach(e -> typeStringBuilder.append(',').append(e.getType().type));
            String typeString = typeStringBuilder.toString().replaceFirst(",", "");
            Type type = new Type(scope.getGlobal(), typeString, "<" + typeString + ">");
            calcList.forEach(e -> type.subtype(e.getType()));
            return new Calc(type, ctx.getText());
        }
        return null;
    }

    public static Calc make(Scope scope, HanCompilerParser.IExprContext iCtx) throws EmptyTempleException, TypeNotMatchException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, IllegalOperatorException, TypeNestingException, FunctionNotFoundException, FunctionArgsNotMatchException {
        List<HanCompilerParser.CalcExprContext> calcCtxList = iCtx.calcExpr();
        HanCompilerParser.CalcExprContext funcCalcExpr = calcCtxList.get(0);
        Calc target = create(scope, funcCalcExpr);
        if(target.isFunc()){
            List<Calc> argsCalc = new ArrayList<>();
            for(int i=1;i<calcCtxList.size();i++){
                argsCalc.add(Calc.create(scope, calcCtxList.get(i)));
            }
            TypeSet signatureArgs = target.getType().toArgTypes();
            TypeSet givenArgs = new TypeSet(argsCalc.stream().map(Calc::getType).toArray(Type[]::new));
            if(givenArgs.equals(signatureArgs)){
                return new Calc(target.getType().toReturnType(), iCtx.getText());
            }else {
                throw new FunctionArgsNotMatchException(iCtx.OP_Braket_Left().getSymbol().getLine(), iCtx.OP_Braket_Left().getSymbol().getCharPositionInLine(), signatureArgs.toString(), givenArgs.toString());
            }
        }else {
            throw new FunctionNotFoundException(funcCalcExpr.getStart().getLine(), funcCalcExpr.getStart().getCharPositionInLine(), funcCalcExpr.getText());
        }
    }

    public static Calc make(Scope scope, HanCompilerParser.FPtrExprContext fCtx) throws FunctionNotFoundException {
        if(scope.getGlobal().globalFuncDeclared(fCtx.ID().getText())){
            Func func = scope.getGlobal().getGlobalFunc(fCtx.ID().getText());
            return new Calc(new Type(scope.getGlobal(), func.funcName, "<"+func.signatureString()+">"), fCtx.getText());
        }else{
            throw new FunctionNotFoundException(fCtx.ID().getSymbol().getLine(), fCtx.ID().getSymbol().getCharPositionInLine(), fCtx.ID().getText());
        }
    }

    public static String operatorId(HanCompilerParser.Operator_allContext ctx) {
        if(ctx.operator2_p1() != null){
            return operatorId(ctx.operator2_p1());
        }else if(ctx.operator2_p2() != null){
            return operatorId(ctx.operator2_p2());
        }else if(ctx.operator2_p3() != null){
            return operatorId(ctx.operator2_p3());
        }else if(ctx.operator2_p4() != null){
            return operatorId(ctx.operator2_p4());
        }else{
            return operatorId(ctx.operator2_p5());
        }
    }

    public static String operatorId(HanCompilerParser.Operator1Context ctx) {
        if (ctx.OP_Minus() != null) {
            return "-";
        } else if (ctx.OP_Plus() != null) {
            return "+";
        } else if (ctx.OP_Not() != null) {
            return "!";
        } else {
            return "";
        }
    }

    public static String operatorId(HanCompilerParser.Operator2_p1Context ctx) {
        if (ctx.OP_Equal() != null) {
            return "==";
        } else if (ctx.OP_Greater() != null) {
            return ">";
        } else if ((ctx.OP_GreaterEqual() != null)) {
            return ">=";
        } else if (ctx.OP_Lower() != null) {
            return "<";
        } else if (ctx.OP_LowerEqual() != null) {
            return "<=";
        } else if (ctx.OP_NotEqual() != null) {
            return "!=";
        } else {
            return "";
        }
    }

    public static String operatorId(HanCompilerParser.Operator2_p2Context ctx) {
        if (ctx.OP_Minus() != null) {
            return "-";
        } else if (ctx.OP_Plus() != null) {
            return "+";
        } else {
            return "";
        }
    }

    public static String operatorId(HanCompilerParser.Operator2_p3Context ctx) {
        if (ctx.OP_Divide() != null) {
            return "/";
        } else if (ctx.OP_Mutiply() != null) {
            return "*";
        } else if (ctx.OP_Remain() != null) {
            return "%";
        } else {
            return "";
        }
    }

    public static String operatorId(HanCompilerParser.Operator2_p4Context ctx) {
        if (ctx.OP_Power() != null) {
            return "**";
        } else {
            return "";
        }
    }

    public static String operatorId(HanCompilerParser.Operator2_p5Context ctx) {
        if (ctx.OP_And() != null) {
            return "&&";
        } else if (ctx.OP_Or() != null) {
            return "||";
        } else {
            return "";
        }
    }

    public static String operatorId(HanCompilerParser.OperatorEndContext ctx) {
        if (ctx.OP_EndCall() != null) {
            return "#";
        } else {
            return "";
        }
    }
}
