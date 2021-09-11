package com.han_lang.compiler.llvm;

public abstract class Codegen2<R1, R2> extends Codegen<R1> {
    protected R2 extraResult = null;

    public R2 extraResult(){
        return extraResult;
    }

    public Codegen2<R1, R2> extraResult(R2 result){
        this.extraResult = result;
        return this;
    }
}
