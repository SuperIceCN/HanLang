package com.han_lang.compiler.symbol.exception;

import com.han_lang.compiler.symbol.BaseScope;

public class ScopeLinkFailException extends Exception{
    public BaseScope scope;
    public BaseScope target;
    public ScopeLinkFailException(BaseScope scope, BaseScope target){
        this.scope = scope;
        this.target = target;
    }

    @Override
    public String getMessage() {
        return "从" + scope + "到" + target + "符号作用域链接失败。\n";
    }
}
