package com.han_lang.compiler.analysis.exception;

import com.han_lang.compiler.analysis.TypeSet;

public class IllegalOperatorException extends Exception{
    public int line;
    public int column;
    public String operator;
    public String[] types;
    public IllegalOperatorException(int line, int column, String operator, String... types){
        this.line = line;
        this.column = column;
        this.operator = operator;
        this.types = types;
    }

    public IllegalOperatorException(int line, int column, String operator, TypeSet set){
        this.line = line;
        this.column = column;
        this.operator = operator;
        types = new String[set.size()];
        for(int i=0;i<set.size();i++){
            types[i] = set.get(i).name;
        }
    }
}
