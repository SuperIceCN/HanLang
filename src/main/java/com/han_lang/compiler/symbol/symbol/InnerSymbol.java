package com.han_lang.compiler.symbol.symbol;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.symbol.*;

public class InnerSymbol extends BaseSymbol {
    public InnerSymbol(String name){
        this.type = SymbolType.Unknown;
        this.format = SymbolFormat.Plain;
        this.symbolName = name;
    }

    public static InnerSymbol create(String name, String runtimeTypeId){
        InnerSymbol symbol = new InnerSymbol(name);
        symbol.runtimeTypeId = runtimeTypeId;
        return symbol;
    }

    public static InnerSymbol create(String name, HanCompilerParser.TypeExprContext typeCtx){
        return create(name, RuntimeType.typeId(typeCtx));
    }

    public static InnerSymbol create(String name, HanCompilerParser.Type_basicContext typeCtx){
        return create(name, RuntimeType.typeId(typeCtx));
    }

    @Override
    public boolean hasInner(String name) {
        return innerScope.hasSymbol(name);
    }

    @Override
    public BaseSymbol getInner(String name) {
        return innerScope.getDirectSymbol(name);
    }

    @Override
    public void addInner(BaseSymbol symbol) {
        innerScope.addDirectSymbol(symbol);
    }
}
