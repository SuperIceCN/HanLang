package com.han_lang.compiler.symbol;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class SymbolReference {
    public SymbolReferenceType type;
    public BaseSymbol refToSymbol;
    public List<ParserRuleContext> refFromCtx;
    public BaseScope refFromScope;
    public SymbolReference(SymbolReferenceType type, BaseSymbol refToSymbol, BaseScope refFromScope, List<ParserRuleContext> refFromCtx){
        this.type = type;
        this.refToSymbol = refToSymbol;
        this.refFromScope = refFromScope;
        this.refFromCtx = refFromCtx;
    }

    @Override
    public String toString() {
        return type+"引用于"+refFromScope.scopeName;
    }
}
