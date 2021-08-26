package com.han_lang.compiler.symbol.symbol;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.symbol.*;
import com.han_lang.compiler.symbol.exception.SymbolConflictException;

public class VariableSymbol extends BaseSymbol {
    private VariableSymbol(HanCompilerParser.VarExprContext declareCtx){
        this.type = SymbolType.Variable;
        this.format = SymbolFormat.Plain;
        this.declare = declareCtx;
        this.symbolName = declareCtx.ID().getText();
    }

    public static VariableSymbol create(BaseScope belongToScope, HanCompilerParser.VarExprContext declareCtx) throws SymbolConflictException {
        VariableSymbol t = new VariableSymbol(declareCtx);
        t.runtimeTypeId = RuntimeType.typeId(declareCtx.typeExpr());
        t.belongsTo = belongToScope;
        t.innerScope = RuntimeType.scope(t, declareCtx.typeExpr());
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
