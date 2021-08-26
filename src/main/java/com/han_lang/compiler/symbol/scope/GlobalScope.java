package com.han_lang.compiler.symbol.scope;

import com.han_lang.compiler.symbol.BaseScope;
import com.han_lang.compiler.symbol.ScopeType;

public class GlobalScope extends BaseScope {
    public GlobalScope(){
        this.scopeName = "global";
        this.type = ScopeType.Global;
    }
}
