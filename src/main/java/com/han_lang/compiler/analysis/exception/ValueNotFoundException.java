package com.han_lang.compiler.analysis.exception;

public class ValueNotFoundException extends Exception{
    public int line;
    public int column;
    public String value;
    public ValueNotFoundException(int line, int column, String value){
        this.line = line;
        this.column = column;
        this.value = value;
    }
}
