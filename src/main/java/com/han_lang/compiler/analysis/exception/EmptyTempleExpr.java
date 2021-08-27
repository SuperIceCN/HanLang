package com.han_lang.compiler.analysis.exception;

public class EmptyTempleExpr extends Exception{
    public int line;
    public int column;
    public EmptyTempleExpr(int line, int column){
        this.line = line;
        this.column = column;
    }
}
