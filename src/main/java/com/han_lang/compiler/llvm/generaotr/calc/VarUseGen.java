package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.LLVMBuildLoad;

public class VarUseGen extends Codegen<LLVMValueRef> {
    Scope scope;
    Value value;

    public VarUseGen(Scope scope, Value value) {
        this.scope = scope;
        this.value = value;
    }

    @Override
    public void gen() {
        result(LLVMBuildLoad(codeGenerator.llvmBuilder, codeGenerator.getLLVMValue(value), codeGenerator.newAutoVar()));
    }
}
