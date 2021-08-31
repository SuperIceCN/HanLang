package com.han_lang.compiler.analysis.scope;

import com.google.gson.annotations.Expose;
import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.exception.*;
import com.han_lang.compiler.ast.HanCompilerParser;

public class Elif extends IfElse {
    @Expose
    public Calc condition;
    @Expose
    public IfElse chainTo;

    public Elif(IfElse chainTo, HanCompilerParser.CalcExprContext condition) throws IllegalOperatorException, TypeNotFoundException, IllegalCastException, TypeNotMatchException, ValueNotFoundException, TypeNestingException, EmptyTempleException, FunctionNotFoundException, FunctionArgsNotMatchException {
        this.setParentScope(chainTo.getParentScope());
        this.setChainTo(chainTo);
        Calc tmp = Calc.create(this, condition);
        if(tmp != null && tmp.getType().equals(this.getGlobal().getGlobalType("bool"))){
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

    public IfElse getChainTo() {
        return chainTo;
    }

    public void setChainTo(IfElse chainTo) {
        this.chainTo = chainTo;
    }
}
