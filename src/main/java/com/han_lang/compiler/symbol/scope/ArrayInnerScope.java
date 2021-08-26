package com.han_lang.compiler.symbol.scope;

import com.han_lang.compiler.symbol.BaseSymbol;

public class ArrayInnerScope extends InnerScope{
    public int len = 0;
    public BaseSymbol arrayType = null;
    public ArrayInnerScope(BaseSymbol symbol, int len, BaseSymbol arrayType) {
        super(symbol);
        this.scopeName += ("[" + len + "]");
        this.len = len;
        this.arrayType = arrayType;
        this.addSymbol(arrayType);
    }

    @Override
    public BaseSymbol getDirectSymbol(String name) {
        int index = Integer.parseInt(name);
        if(index >=0 && index < len){
            return arrayType;
        }
        return super.getDirectSymbol(name);
    }

    @Override
    public BaseSymbol getSymbol(String name) {
        int index = Integer.parseInt(name);
        if(index >=0 && index < len){
            return arrayType;
        }
        return super.getSymbol(name);
    }
}
