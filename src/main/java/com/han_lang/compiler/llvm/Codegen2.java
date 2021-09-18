package com.han_lang.compiler.llvm;

import com.han_lang.compiler.ast.HanCodegen;

public abstract class Codegen2<R1, R2> extends Codegen<R1> {
    protected R2 extraResult = null;

    public Codegen2<R1, R2> gen(HanCodegen codeGenerator){
        super.gen(codeGenerator);
        return this;
    }

    public R2 extraResult(){
        return extraResult;
    }

    public Codegen2<R1, R2> extraResult(R2 result){
        this.extraResult = result;
        return this;
    }

    public Codegen2<R1, R2> shareExtra(Codegen2<?, R2> shareTo){
        shareTo.extraResult(this.extraResult);
        return this;
    }

    public Codegen2<R1, R2> shareAll(Codegen2<R1, R2> shareTo){
        this.shareExtra(shareTo).shareResult(shareTo);
        return this;
    }
}
