package com.han_lang.compiler.symbol;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

/**
 * @author 超神的冰凉
 * 符号作用域基类，用于进行变量作用域和类型检查及后续代码生成
 */
public abstract class BaseScope {
    public String scopeName;
    public ScopeType type;
    public Map<String, BaseSymbol> symbols = new LinkedHashMap<>();
    public List<BaseScope> children = new ArrayList<>();
    public BaseScope parent = null;

    public boolean addSymbol(BaseSymbol symbol){
        //符号冲突
        if(isSymbolAvailable(symbol.symbolName)){
            return false;
        }
        //正确添加
        symbols.put(symbol.symbolName, symbol);
        symbol.belongsTo = this;
        return true;
    }

    public boolean addDirectSymbol(BaseSymbol symbol){
        if(hasSymbol(symbol.symbolName)){
            return false;
        }
        symbols.put(symbol.symbolName, symbol);
        symbol.belongsTo = this;
        return true;
    }

    public BaseSymbol removeSymbol(String name){
        BaseSymbol symbol = symbols.remove(name);
        symbol.belongsTo = null;
        return symbol;
    }

    public boolean hasSymbol(String name){
        return symbols.containsKey(name);
    }

    public boolean isSymbolAvailable(String name){
        if(this.hasSymbol(name)){
            return true;
        }else{
            if(parent != null){
                return parent.isSymbolAvailable(name);
            }else{
                return false;
            }
        }
    }

    public BaseSymbol getDirectSymbol(String name){
        if(this.hasSymbol(name)){
            return this.symbols.get(name);
        }else {
            return null;
        }
    }

    public BaseSymbol getSymbol(String name){
        if(this.hasSymbol(name)){
            return this.symbols.get(name);
        }else{
            if(parent != null){
                return parent.getSymbol(name);
            }else{
                return null;
            }
        }
    }

    public boolean addChild(BaseScope scope){
        if(scope.type == ScopeType.Global){
            return false;
        }
        this.children.add(scope);
        scope.parent = this;
        return true;
    }

    public boolean recordGet(String name, ParserRuleContext... from){
        BaseSymbol symbol = this.getSymbol(name);
        if(symbol != null){
            symbol.references.add(new SymbolReference(SymbolReferenceType.Get, symbol, this, Arrays.asList(from)));
            return true;
        }else {
            return false;
        }
    }

    public boolean recordGet(BaseSymbol symbol, ParserRuleContext... from){
        if(!hasSymbol(symbol.symbolName)){
            return false;
        }else {
            symbol.references.add(new SymbolReference(SymbolReferenceType.Get, symbol, this, Arrays.asList(from)));
            return true;
        }
    }

    public boolean recordSet(String name, ParserRuleContext... from){
        BaseSymbol symbol = this.getSymbol(name);
        if(symbol != null){
            symbol.references.add(new SymbolReference(SymbolReferenceType.Set, symbol, this, Arrays.asList(from)));
            return true;
        }else {
            return false;
        }
    }

    public boolean recordSet(BaseSymbol symbol, ParserRuleContext... from){
        if(!hasSymbol(symbol.symbolName)){
            return false;
        }else {
            symbol.references.add(new SymbolReference(SymbolReferenceType.Set, symbol, this, Arrays.asList(from)));
            return true;
        }
    }

    public boolean recordCall(String name, ParserRuleContext... from){
        BaseSymbol symbol = this.getSymbol(name);
        if(symbol != null){
            symbol.references.add(new SymbolReference(SymbolReferenceType.Call, symbol, this, Arrays.asList(from)));
            return true;
        }else {
            return false;
        }
    }

    public boolean recordCall(BaseSymbol symbol, ParserRuleContext... from){
        if(!hasSymbol(symbol.symbolName)){
            return false;
        }else {
            symbol.references.add(new SymbolReference(SymbolReferenceType.Call, symbol, this, Arrays.asList(from)));
            return true;
        }
    }

    @Override
    public String toString() {
        return "符号作用域：（名称="+scopeName+"；类别="+type+"；指向="+parent+"；包含="+symbols+"；分支="+children+"）";
    }
}
