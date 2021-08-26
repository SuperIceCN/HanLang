package com.han_lang.compiler.symbol.symbol;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.symbol.*;
import com.han_lang.compiler.symbol.exception.SymbolConflictException;

public class TypeSymbol extends BaseSymbol {
    private TypeSymbol(HanCompilerParser.NewtypeExprContext declareCtx){
        this.type = SymbolType.Type;
        this.format = SymbolFormat.Plain;
        this.declare = declareCtx;
        this.symbolName = declareCtx.ID().getText();
    }

    public static TypeSymbol create(BaseScope belongToScope, HanCompilerParser.NewtypeExprContext declareCtx) throws SymbolConflictException {
        TypeSymbol t = new TypeSymbol(declareCtx);
        t.belongsTo = belongToScope;
        t.innerScope = RuntimeType.scope(t, declareCtx.typeExpr());
        t.runtimeTypeId = RuntimeType.typeId(declareCtx.typeExpr());
        boolean res = belongToScope.addSymbol(t);
        if(!res){
            throw new SymbolConflictException(t.symbolName);
        }
        return t;
    }

    public static TypeSymbol abstractCreate(BaseScope belongToScope, HanCompilerParser.NewtypeExprContext declareCtx) throws SymbolConflictException {
        TypeSymbol t = new TypeSymbol(declareCtx);
        t.belongsTo = belongToScope;
        t.runtimeTypeId = RuntimeType.typeId(declareCtx.typeExpr());
        boolean res = belongToScope.addSymbol(t);
        if(!res){
            throw new SymbolConflictException(t.symbolName);
        }
        return t;
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
