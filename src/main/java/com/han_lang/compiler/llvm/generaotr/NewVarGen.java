package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.Codegen2;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class NewVarGen extends Codegen2<LLVMValueRef, Value> {
    HanCompilerParser.VarExprContext varExpr;

    public NewVarGen(HanCompilerParser.VarExprContext varExpr) {
        this.varExpr = varExpr;
    }

    @Override
    public void gen() {
        Value value = codeGenerator.scope(varExpr).getValue(varExpr.ID().getText());
        LLVMValueRef valueRef;
        //非基本类型应当为一个指针
        if(value.getType().isBasic()){
            valueRef = LLVMBuildAlloca(codeGenerator.llvmBuilder, codeGenerator.getLLVMType(value.valueType.type), value.valueName);
        }else {
            LLVMTypeRef ptr = LLVMPointerType(codeGenerator.getLLVMType(value.valueType.type), 0);
            valueRef = LLVMBuildAlloca(codeGenerator.llvmBuilder, ptr, value.valueName);
        }
        codeGenerator.addLLVMValue(value, valueRef);
        result(valueRef);
        extraResult(value);
    }
}
