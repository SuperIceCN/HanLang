package com.han_lang.compiler.analysis.scope;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.analysis.exception.*;
import com.han_lang.compiler.ast.HanCompilerParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class While implements Scope {
    Scope parent;
    @Expose
    public List<Scope> childrenScope = new ArrayList<>();
    @Expose
    public Map<String, Value> values = new HashMap<>();
    @Expose
    public Calc condition;

    public While(Scope parent, HanCompilerParser.CalcExprContext condition) throws IllegalOperatorException, IllegalCastException, TypeNotFoundException, ValueNotFoundException, TypeNotMatchException, TypeNestingException, EmptyTempleExpr {
        this.setParentScope(parent);
        Calc tmp = Calc.create(this, condition);
        if(tmp != null && tmp.getType().equals(this.getGlobal().getGlobalType("<bool>"))){
            this.setCondition(tmp);
        }else {
            throw new TypeNotMatchException(condition.getStart().getLine(), condition.getStart().getCharPositionInLine(), "<bool>", tmp.getType().type);
        }
    }

    public Calc getCondition() {
        return condition;
    }

    public void setCondition(Calc condition) {
        this.condition = condition;
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
