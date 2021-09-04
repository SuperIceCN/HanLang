package com.han_lang.compiler.analysis;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.exception.TypeNestingException;
import com.han_lang.compiler.analysis.exception.TypeNotFoundException;
import com.han_lang.compiler.analysis.exception.ValueAlreadyDefinedException;
import com.han_lang.compiler.ast.HanCompilerParser;

import java.util.ArrayList;
import java.util.List;

public class Func {
    public Global global;
    @Expose
    public String funcName;
    @Expose
    public Type returnType;
    @Expose
    public TypeSet argumentTypes;
    @Expose
    public boolean used = false;
    //@Expose
    public Scope scope = null;

    protected Func(Global global, String funcName, Type returnType, TypeSet argumentTypes){
        this.global = global;
        this.funcName = funcName;
        this.returnType = returnType;
        this.argumentTypes = argumentTypes;
        this.global.declareGlobalFunc(funcName, this);
    }

    public boolean hasImpl(){
        return this.global.hasGlobalFunc(this.funcName);
    }

    public TypeSet signatureTypeSet(){
        return argumentTypes.merge(new TypeSet(returnType));
    }

    public String signatureString(){
        StringBuilder sig = new StringBuilder();
        sig.append("<").append(returnType.type.substring(1, returnType.type.length() - 1)).append(">").append("(");
        for(int i=0;i<argumentTypes.size();i++){
            if(i!=0){
                sig.append(",");
            }
            sig.append(argumentTypes.get(i).type);
        }
        sig.append(")");
        return sig.toString();
    }

    public boolean isUsed() {
        return used;
    }

    public Func setUsed(boolean used) {
        this.used = used;
        return this;
    }

    public Func setUsed() {
        return setUsed(true);
    }

    public Scope getScope() {
        return scope;
    }

    public Func setScope(Scope scope) {
        this.scope = scope;
        return this;
    }

    public static Func create(Global global, HanCompilerParser.FunctionExprContext funcExpr) throws TypeNotFoundException, TypeNestingException, ValueAlreadyDefinedException {
        if(funcExpr instanceof HanCompilerParser.FunContext){
            return make(global, (HanCompilerParser.FunContext) funcExpr);
        }else if(funcExpr instanceof HanCompilerParser.FunRContext){
            return make(global, (HanCompilerParser.FunRContext) funcExpr);
        }else if(funcExpr instanceof HanCompilerParser.FunAContext){
            return make(global, (HanCompilerParser.FunAContext) funcExpr);
        }else if(funcExpr instanceof HanCompilerParser.FunRAContext){
            return make(global, (HanCompilerParser.FunRAContext) funcExpr);
        }
        return null;
    }

    private static Func make(Global global, HanCompilerParser.FunContext funCtx){
        String funcName = funCtx.ID().getText();
        Type returnType = new Type(global, "null", "<null>");
        TypeSet argTypes = new TypeSet();
        return new Func(global, funcName, returnType, argTypes);
    }

    private static Func make(Global global, HanCompilerParser.FunRContext funCtx) throws TypeNotFoundException {
        String funcName = funCtx.ID(0).getText();
        Type returnType;
        if(funCtx.ID().size() == 2){
            String typeName = funCtx.ID(1).getText();
            if(global.hasGlobalType(typeName)){
                returnType = global.getGlobalType(typeName);
            }else {
                throw new TypeNotFoundException(funCtx.ID(1).getSymbol().getLine(), funCtx.ID(1).getSymbol().getCharPositionInLine(), typeName);
            }
        }else {
            returnType = global.getGlobalType(funCtx.type_basic().getText());
        }
        TypeSet argTypes = new TypeSet();
        return new Func(global, funcName, returnType, argTypes);
    }

    private static Func make(Global global, HanCompilerParser.FunAContext funCtx) throws ValueAlreadyDefinedException, TypeNestingException, TypeNotFoundException {
        String funcName = funCtx.ID().getText();
        Type returnType = new Type(global, "null", "<null>");
        List<Type> argTypeList = new ArrayList<>(funCtx.argPartExpr().size() + 1);
        for(HanCompilerParser.ArgPartExprContext each : funCtx.argPartExpr()){
            if(global.canDefineValue(each.ID().getText())){
                argTypeList.add(Type.get(global, each.ID().getText(), each.typeExpr()));
            }else {
                throw new ValueAlreadyDefinedException(each.ID().getSymbol().getLine(), each.ID().getSymbol().getCharPositionInLine(),each.ID().getText());
            }
        }
        if(global.canDefineValue(funCtx.argEndExpr().ID().getText())){
            argTypeList.add(Type.get(global, funCtx.argEndExpr().ID().getText(), funCtx.argEndExpr().typeExpr()));
        }else {
            throw new ValueAlreadyDefinedException(funCtx.argEndExpr().ID().getSymbol().getLine(), funCtx.argEndExpr().ID().getSymbol().getCharPositionInLine(),funCtx.argEndExpr().ID().getText());
        }
        TypeSet argTypes = new TypeSet(argTypeList.toArray(new Type[]{}));
        return new Func(global, funcName, returnType, argTypes);
    }

    private static Func make(Global global, HanCompilerParser.FunRAContext funCtx) throws ValueAlreadyDefinedException, TypeNestingException, TypeNotFoundException {
        String funcName = funCtx.ID(0).getText();
        Type returnType;
        if(funCtx.ID().size() == 2){
            String typeName = funCtx.ID(1).getText();
            if(global.hasGlobalType(typeName)){
                returnType = global.getGlobalType(typeName);
            }else {
                throw new TypeNotFoundException(funCtx.ID(1).getSymbol().getLine(), funCtx.ID(1).getSymbol().getCharPositionInLine(), typeName);
            }
        }else {
            returnType = global.getGlobalType(Type.typeBasic2String(funCtx.type_basic()));
        }
        List<Type> argTypeList = new ArrayList<>(funCtx.argPartExpr().size() + 1);
        for(HanCompilerParser.ArgPartExprContext each : funCtx.argPartExpr()){
            if(global.canDefineValue(each.ID().getText())){
                argTypeList.add(Type.get(global, each.ID().getText(), each.typeExpr()));
            }else {
                throw new ValueAlreadyDefinedException(each.ID().getSymbol().getLine(), each.ID().getSymbol().getCharPositionInLine(),each.ID().getText());
            }
        }
        if(global.canDefineValue(funCtx.argEndExpr().ID().getText())){
            argTypeList.add(Type.get(global, funCtx.argEndExpr().ID().getText(), funCtx.argEndExpr().typeExpr()));
        }else {
            throw new ValueAlreadyDefinedException(funCtx.argEndExpr().ID().getSymbol().getLine(), funCtx.argEndExpr().ID().getSymbol().getCharPositionInLine(),funCtx.argEndExpr().ID().getText());
        }
        TypeSet argTypes = new TypeSet(argTypeList.toArray(new Type[]{}));
        return new Func(global, funcName, returnType, argTypes);
    }

    public static String funcName(HanCompilerParser.FunctionExprContext funcExpr){
        if(funcExpr instanceof HanCompilerParser.FunContext){
            return ((HanCompilerParser.FunContext) funcExpr).ID().getText();
        }else if(funcExpr instanceof HanCompilerParser.FunRContext){
            return ((HanCompilerParser.FunRContext) funcExpr).ID(0).getText();
        }else if(funcExpr instanceof HanCompilerParser.FunAContext){
            return ((HanCompilerParser.FunAContext) funcExpr).ID().getText();
        }else if(funcExpr instanceof HanCompilerParser.FunRAContext){
            return ((HanCompilerParser.FunRAContext) funcExpr).ID(0).getText();
        }
        return "";
    }

    public static List<HanCompilerParser.ExprContext> funcInnerExprs(HanCompilerParser.FunctionExprContext funcExpr){
        if(funcExpr instanceof HanCompilerParser.FunContext){
            return ((HanCompilerParser.FunContext) funcExpr).expr();
        }else if(funcExpr instanceof HanCompilerParser.FunRContext){
            return ((HanCompilerParser.FunRContext) funcExpr).expr();
        }else if(funcExpr instanceof HanCompilerParser.FunAContext){
            return ((HanCompilerParser.FunAContext) funcExpr).expr();
        }else if(funcExpr instanceof HanCompilerParser.FunRAContext){
            return ((HanCompilerParser.FunRAContext) funcExpr).expr();
        }
        return new ArrayList<>(0);
    }

    public static HanCompilerParser.DecoratorExprContext funcInnerDecoratorExpr(HanCompilerParser.FunctionExprContext funcExpr){
        if(funcExpr instanceof HanCompilerParser.FunContext){
            return ((HanCompilerParser.FunContext) funcExpr).decoratorExpr();
        }else if(funcExpr instanceof HanCompilerParser.FunRContext){
            return ((HanCompilerParser.FunRContext) funcExpr).decoratorExpr();
        }else if(funcExpr instanceof HanCompilerParser.FunAContext){
            return ((HanCompilerParser.FunAContext) funcExpr).decoratorExpr();
        }else if(funcExpr instanceof HanCompilerParser.FunRAContext){
            return ((HanCompilerParser.FunRAContext) funcExpr).decoratorExpr();
        }
        return null;
    }

    @Override
    public String toString() {
        return funcName;
    }
}
