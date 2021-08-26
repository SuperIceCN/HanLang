package com.han_lang.compiler.analysis.exception;

public class TypeNestingException extends Exception{
    public int line;
    public int column;
    public String type;
    public TypeNestingException(int line, int column, String type){
        this.line = line;
        this.column = column;
        this.type = type;
    }
}
