package com.han_lang.compiler.analysis.scope;

import com.google.gson.annotations.Expose;

public class Else extends IfElse{
    @Expose
    public IfElse chainTo;

    public Else(IfElse chainTo){
        this.setChainTo(chainTo);
    }

    public IfElse getChainTo() {
        return chainTo;
    }

    public void setChainTo(IfElse chainTo) {
        this.chainTo = chainTo;
    }
}
