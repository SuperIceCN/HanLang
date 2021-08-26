package com.han_lang.compiler.symbol.exception;

import com.han_lang.compiler.symbol.BaseScope;

public class NoSymbolException extends Exception{
    public BaseScope scope;
    public String symbolName;
    public NoSymbolException(BaseScope scope, String symbolName){
        this.scope = scope;
        this.symbolName = symbolName;
    }

    @Override
    public String getMessage() {
        return "在"+scope+"中找不到符号："+symbolName+"。";
    }
}
