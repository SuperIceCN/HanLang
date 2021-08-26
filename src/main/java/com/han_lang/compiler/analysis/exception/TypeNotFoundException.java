package com.han_lang.compiler.analysis.exception;

public class TypeNotFoundException extends Exception{
    public int line;
    public int column;
    public String type;
    public TypeNotFoundException(int line, int column, String type){
        this.line = line;
        this.column = column;
        this.type = type;
    }
}
