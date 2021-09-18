package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen2;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class FuncPtrGen extends Codegen2<LLVMValueRef, Type> {
    HanCompilerParser.FPtrExprContext fPtrExpr;

    public FuncPtrGen(HanCompilerParser.FPtrExprContext fPtrExpr) {
        this.fPtrExpr = fPtrExpr;
    }

    @Override
    public void gen() {
        String ID = fPtrExpr.ID().getText();
        result(LLVMGetNamedFunction(codeGenerator.llvmModule, ID));
        extraResult(codeGenerator.getFunc(ID).signatureType());
    }
}
