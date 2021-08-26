package com.han_lang.compiler.analysis;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.ast.HanCompilerParser;

public class Func {
    public Global global;
    @Expose
    public String funcName;
    @Expose
    public Type returnType;
    @Expose
    public TypeSet argumentTypes;

    protected Func(Global global, String funcName, Type returnType, TypeSet argumentTypes){
        this.global = global;
        this.funcName = funcName;
        this.returnType = returnType;
        this.argumentTypes = argumentTypes;
        this.global.declareGlobalFunc(funcName, this);
    }

    public TypeSet signatureTypeSet(){
        return argumentTypes.merge(new TypeSet(returnType));
    }

    public static Func make(Global global, HanCompilerParser.FunContext funcCtx){
        return null;
    }

    @Override
    public String toString() {
        return funcName;
    }
}
