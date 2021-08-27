package com.han_lang.compiler.analysis.scope;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.exception.*;
import com.han_lang.compiler.ast.HanCompilerParser;

public class If extends IfElse {
    @Expose
    public Calc condition;

    public If(Scope parent, HanCompilerParser.CalcExprContext condition) throws IllegalOperatorException, TypeNotFoundException, IllegalCastException, TypeNotMatchException, ValueNotFoundException, TypeNestingException, EmptyTempleExpr {
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
}
