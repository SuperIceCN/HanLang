package com.han_lang.compiler.llvm;

import com.han_lang.compiler.ast.HanCodegen;

public abstract class Codegen<R> {
    protected HanCodegen codeGenerator;
    protected R result = null;

    public HanCodegen getCodeGenerator() {
        return codeGenerator;
    }

    public Codegen<R> generator(HanCodegen codeGenerator){
        this.codeGenerator = codeGenerator;
        return this;
    }

    public Codegen<R> gen(HanCodegen codeGenerator){
        this.codeGenerator = codeGenerator;
        gen();
        return this;
    }

    public abstract void gen();

    public R result(){
        return result;
    }

    public Codegen<R> result(R result){
        this.result = result;
        return this;
    }

    public Codegen<R> shareResult(Codegen<R> shareTo){
        shareTo.result(this.result);
        return this;
    }
}
