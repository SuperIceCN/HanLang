package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class VarSetGen extends Codegen<Void> {
    HanCompilerParser.SetExprContext setExpr;

    public VarSetGen(HanCompilerParser.SetExprContext setExpr) {
        this.setExpr = setExpr;
    }

    @Override
    public void gen() {
        Scope scope = codeGenerator.scope(setExpr);
        if(setExpr.ID() != null){
            String text = setExpr.ID().getText();
            Value to = scope.getValue(text);
            LLVMValueRef toLLVMValue = codeGenerator.getLLVMValue(to);
            LLVMValueRef fromLLVMValue = new CalcGen(setExpr.calcExpr()).gen(codeGenerator).result();
            LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
        }
    }
}
