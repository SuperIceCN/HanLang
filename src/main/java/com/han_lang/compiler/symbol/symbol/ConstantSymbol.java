package com.han_lang.compiler.symbol.symbol;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.symbol.*;
import com.han_lang.compiler.symbol.exception.SymbolConflictException;

public class ConstantSymbol extends BaseSymbol {
    private ConstantSymbol(HanCompilerParser.ConstAndSetExprContext declareExpr){
        this.type = SymbolType.Constant;
        this.format = SymbolFormat.Plain;
        this.declare = declareExpr;
        this.symbolName = declareExpr.ID().getText();
    }

    public static ConstantSymbol create(BaseScope belongToScope, HanCompilerParser.ConstAndSetExprContext declareExpr) throws SymbolConflictException {
        ConstantSymbol t = new ConstantSymbol(declareExpr);
        t.runtimeTypeId = RuntimeType.typeId(declareExpr.typeExpr());
        t.belongsTo = belongToScope;
        t.innerScope = RuntimeType.scope(t, declareExpr.typeExpr());
        boolean res = belongToScope.addSymbol(t);
        if(!res){
            throw new SymbolConflictException(t.symbolName);
        }
        belongToScope.recordSet(t, declareExpr);
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
