package com.han_lang.compiler.analysis.scope;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FuncScope implements Scope {
    Scope parent;
    Func func;
    @Expose
    public List<Scope> childrenScope = new ArrayList<>();
    @Expose
    public Map<String, Value> values = new HashMap<>();

    public FuncScope(Func func){
        this.func = func;
        this.parent = func.global;
        this.func.setScope(this);
    }

    @Override
    public boolean valueAvailable(String valueName) {
        if(this.hasValue(valueName)){
            return true;
        }else {
            return this.getParentScope().valueAvailable(valueName);
        }
    }

    @Override
    public boolean canDefineValue(String valueName) {
        return !valueAvailable(valueName) && !this.getGlobal().globalTypeDeclared(valueName) && !this.getGlobal().globalFuncDeclared(valueName);
    }

    @Override
    public Value getValue(String valueName) {
        Value value = values.get(valueName);
        if(value != null){
            return value;
        }else {
            return this.getParentScope().getValue(valueName);
        }
    }

    @Override
    public void removeValue(String valueName) {
        values.remove(valueName);
    }

    @Override
    public void removeValue(Value value) {
        values.remove(value.valueName);
    }

    @Override
    public void addValue(Value value) {
        values.put(value.valueName, value);
    }

    @Override
    public boolean hasValue(String valueName) {
        return values.containsKey(valueName);
    }

    @Override
    public void addChildScope(Scope child) {
        childrenScope.add(child);
        child.setParentScope(this);
    }

    @Override
    public void setParentScope(Scope parent) {
        this.parent = parent;
    }

    @Override
    public Scope getParentScope() {
        return parent;
    }

    @Override
    public Global getGlobal() {
        return parent.getGlobal();
    }
}
