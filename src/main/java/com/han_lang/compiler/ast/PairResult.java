package com.han_lang.compiler.ast;

public class PairResult<T, F> extends VisitResult<T>{
    public F content2 = null;
    public PairResult(Status status) {
        super(status);
    }

    public F getContent2() {
        return content2;
    }

    public PairResult<T, F> setContent2(F content2) {
        this.content2 = content2;
        return this;
    }
}
