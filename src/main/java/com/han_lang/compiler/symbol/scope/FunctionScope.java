package com.han_lang.compiler.symbol.scope;

import com.han_lang.compiler.symbol.BaseScope;
import com.han_lang.compiler.symbol.ScopeType;
import com.han_lang.compiler.symbol.exception.ScopeLinkFailException;
import com.han_lang.compiler.symbol.symbol.FunctionSymbol;

public class FunctionScope extends BaseScope {
    public FunctionScope(GlobalScope globalScope, FunctionSymbol function) throws ScopeLinkFailException {
        this.scopeName = "function#" + function.symbolName;
        this.type = ScopeType.Function;
        boolean addChildOk = globalScope.addChild(this);
        if(!addChildOk){
            throw new ScopeLinkFailException(this, globalScope);
        }
    }
}
