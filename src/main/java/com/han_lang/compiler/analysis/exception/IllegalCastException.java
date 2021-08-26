package com.han_lang.compiler.analysis.exception;

public class IllegalCastException extends Exception{
    public int line;
    public int column;
    public String from;
    public String to;
    public IllegalCastException(int line, int column, String from, String to){
        this.line = line;
        this.column = column;
        this.from = from;
        this.to = to;
    }
}
