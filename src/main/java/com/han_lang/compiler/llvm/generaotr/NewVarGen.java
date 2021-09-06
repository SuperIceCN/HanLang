package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.util.LLVMUtil;

public class NewVarGen extends Codegen {
    HanCompilerParser.VarExprContext varExpr;

    public NewVarGen(HanCompilerParser.VarExprContext varExpr) {
        this.varExpr = varExpr;
    }

    @Override
    public String gen() {
        StringBuilder tmp = new StringBuilder();
        Value value = codeGenerator.scope(varExpr).getValue(varExpr.ID().getText());
        String llvmVarName = LLVMUtil.localVar(value.valueName);
        tmp.append(llvmVarName).append(" = alloca ")
                .append(new TypeUseGen(value.getType()).gen()).append("\n");
        return tmp.toString();
    }
}
