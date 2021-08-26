package com.han_lang.compiler.analysis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

public class Value {
    @Expose
    public String valueName;
    @Expose
    public Type valueType;
    @Expose
    public boolean constant = false;
    protected Value(String valueName, Type valueType, boolean constant){
        this.valueName = valueName;
        this.valueType = valueType;
        this.constant = constant;
    }

    public Type getType(){
        return this.valueType;
    }

    public static Value create(String valueName, Type valueType, boolean constant){
        return new Value(valueName, valueType, constant);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Value){
            Value another = (Value) obj;
            return another.valueName.equals(this.valueName)
                    && another.valueType.equals(this.valueType)
                    && another.constant == this.constant;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().disableHtmlEscaping().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(this);
    }
}
