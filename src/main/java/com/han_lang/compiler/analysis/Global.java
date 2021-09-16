package com.han_lang.compiler.analysis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
import com.han_lang.compiler.analysis.basicType.BasicType;
import com.han_lang.compiler.ast.HanCompilerParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Global implements Scope{
    //@Expose
    public Map<String, Type> typeDeclares = new HashMap<>();
    @Expose
    public Map<String, Type> types = new HashMap<>();
    //@Expose
    public Map<String, Func> funDeclares = new HashMap<>();
    @Expose
    public Map<String, Func> funcs = new HashMap<>();
    /**
     * TypeSet: 所有参数类型+返回值类型
     */
    //@Expose
    public Map<TypeSet, Func> casters = new HashMap<>();
    /**
     * TypeSet: 所有参数类型，无返回值
     */
    //@Expose
    public Map<String, Map<TypeSet, Func>> operators = new HashMap<>();
    @Expose
    public List<Scope> childrenScope = new ArrayList<>();
    @Expose
    public ParseTreeProperty<Scope> ast2Scope = new ParseTreeProperty<>();
    @Expose
    public Map<String, Value> values = new HashMap<>();
    @Expose
    public Map<HanCompilerParser.CalcExprContext, Calc> calcRecordMap = new HashMap<>();

    public Global(){
        BasicType.init(this);
        BasicFunc.initCaster(this);
        BasicFunc.initOperator(this);
        BasicFunc.initGC(this);
    }

    public ParseTreeProperty<Scope> getAst2Scope() {
        return ast2Scope;
    }

    public Global setAst2Scope(ParseTreeProperty<Scope> ast2Scope) {
        this.ast2Scope = ast2Scope;
        return this;
    }

    public boolean globalTypeDeclared(String funcName){
        return typeDeclares.containsKey(funcName);
    }

    public void declareGlobalType(String typeName, Type type){
        typeDeclares.put(typeName, type);
    }

    public Type getDeclaredGlobalType(String typeName){
        return typeDeclares.get(typeName);
    }

    public Type getGlobalType(String typeName){
        return types.get(typeName);
    }

    public void addGlobalType(Type type){
        types.put(type.name, type);
    }

    public boolean hasGlobalType(String typeName){
        Type type = types.get(typeName);
        return type != null;
    }

    public Func getCaster(TypeSet typeSet){
        return casters.get(typeSet);
    }

    public void addCaster(Func caster){
        casters.put(caster.signatureTypeSet(), caster);
    }

    public boolean hasCaster(TypeSet typeSet){
        return casters.containsKey(typeSet);
    }

    public void removeCaster(TypeSet typeSet){
        casters.remove(typeSet);
    }

    public void removeCaster(Func caster){
        casters.remove(caster.signatureTypeSet());
    }

    public Func getOperator(String op, TypeSet typeSet){
        return operators.get(op).get(typeSet);
    }

    public void addOperator(String op, Func caster){
        Map<TypeSet, Func> tmp = operators.computeIfAbsent(op, k -> new HashMap<>());
        tmp.put(caster.argumentTypes, caster);
    }

    public boolean hasOperator(String op, TypeSet typeSet){
        Map<TypeSet, Func> tmp = operators.get(op);
        if(tmp != null){
            return tmp.containsKey(typeSet);
        }else {
            return false;
        }
    }

    public void removeOperator(String op, TypeSet typeSet){
        Map<TypeSet, Func> tmp = operators.get(op);
        if(tmp != null){
            tmp.remove(typeSet);
        }
    }

    public void removeOperator(String op, Func caster){
        removeOperator(op, caster.signatureTypeSet());
    }

    public boolean globalFuncDeclared(String funcName){
        return funDeclares.containsKey(funcName);
    }

    public void declareGlobalFunc(String funcName, Func func){
        funDeclares.put(funcName, func);
    }

    public Func getDeclaredGlobalFunc(String funcName){
        return funDeclares.get(funcName);
    }

    public boolean hasGlobalFunc(String funcName){
        return funcs.containsKey(funcName);
    }

    public void addGlobalFunc(Func func){
        funcs.put(func.funcName, func);
    }

    public Func getGlobalFunc(String funcName){
        return funcs.get(funcName);
    }

    @Override
    public String toString() {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().disableHtmlEscaping().excludeFieldsWithoutExposeAnnotation().create();
        return gson.toJson(this);
    }

    @Override
    public boolean valueAvailable(String valueName) {
        return this.hasValue(valueName);
    }

    @Override
    public boolean canDefineValue(String valueName) {
        return !valueAvailable(valueName) && !globalTypeDeclared(valueName) && !globalFuncDeclared(valueName);
    }

    @Override
    public Value getValue(String valueName) {
        return values.get(valueName);
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
    public Scope getParentScope() {
        return null;
    }

    @Override
    public void setParentScope(Scope parent) {
        //ignore
    }

    @Override
    public Global getGlobal() {
        return this;
    }

    @Override
    public void recordCalcExpr(HanCompilerParser.CalcExprContext ctx, Calc calc) {
        calcRecordMap.put(ctx, calc);
    }

    @Override
    public Calc getCalcExprRecord(HanCompilerParser.CalcExprContext ctx) {
        return calcRecordMap.get(ctx);
    }
}
