package com.han_lang.compiler.symbol.exception;

public class SymbolConflictException extends Exception{
    public String symbolName;
    public SymbolConflictException(String symbol){
        this.symbolName = symbol;
    }

    @Override
    public String getMessage() {
        return "符号"+symbolName+"已经存在。";
    }
}
