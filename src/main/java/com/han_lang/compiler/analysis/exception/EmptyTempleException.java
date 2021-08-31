package com.han_lang.compiler.analysis.exception;

public class EmptyTempleException extends Exception{
    public int line;
    public int column;
    public EmptyTempleException(int line, int column){
        this.line = line;
        this.column = column;
    }
}
