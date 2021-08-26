package com.han_lang.compiler.symbol.scope;

import com.han_lang.compiler.symbol.BaseScope;
import com.han_lang.compiler.symbol.BaseSymbol;
import com.han_lang.compiler.symbol.ScopeType;

public class InnerScope extends BaseScope {
    public InnerScope(BaseSymbol symbol){
        this.scopeName = "inner#" + symbol.symbolName;
        this.type = ScopeType.Inner;
    }
}
