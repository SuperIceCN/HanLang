package com.han_lang.compiler.analysis.exception;

public class TypeNotMatchException extends Exception{
    public int line;
    public int column;
    public String require;
    public String given;
    public TypeNotMatchException(int line, int column, String require, String given){
        this.line = line;
        this.column = column;
        this.require = require;
        this.given = given;
    }
}
