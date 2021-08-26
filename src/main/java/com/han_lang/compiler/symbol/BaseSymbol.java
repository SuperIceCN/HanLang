package com.han_lang.compiler.symbol;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseSymbol {
    public SymbolType type = SymbolType.Unknown;
    public SymbolFormat format = SymbolFormat.Plain;
    public String symbolName = "";
    public String runtimeTypeId = "<null>";
    public ParserRuleContext declare = null;
    public List<SymbolReference> references = new ArrayList<>();
    public BaseScope belongsTo = null;
    public BaseScope innerScope = null;

    public abstract boolean hasInner(String name);
    public abstract BaseSymbol getInner(String name);
    public abstract void addInner(BaseSymbol symbol);

    @Override
    public String toString() {
        return "符号"+symbolName + "@" + runtimeTypeId + "#"
                + (declare == null ? "" : declare.getStart().getLine()+"/"+declare.getStart().getCharPositionInLine())
                +"（种类="+type
                +"；格式="+format
                +"；内部="+innerScope
                +"；引用="+references
                +"）";
    }
}
