package com.han_lang.compiler.analysis.exception;

public class FunctionNotFoundException extends Exception{
    public int line;
    public int column;
    public String function;
    public FunctionNotFoundException(int line, int column, String function){
        this.line = line;
        this.column = column;
        this.function = function;
    }
}
