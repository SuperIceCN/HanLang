package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class FuncPtrGen extends Codegen<LLVMValueRef> {
    HanCompilerParser.FPtrExprContext fPtrExpr;

    public FuncPtrGen(HanCompilerParser.FPtrExprContext fPtrExpr) {
        this.fPtrExpr = fPtrExpr;
    }

    @Override
    public void gen() {
        result(LLVMGetNamedFunction(codeGenerator.llvmModule, fPtrExpr.ID().getText()));
    }
}
