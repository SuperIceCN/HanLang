package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.Codegen2;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

/**
 * 生成全局变量
 */
public class NewGlobalVarGen extends Codegen2<LLVMValueRef, Value> {
    HanCompilerParser.VarExprContext varExpr;

    public NewGlobalVarGen(HanCompilerParser.VarExprContext varExpr) {
        this.varExpr = varExpr;
    }

    @Override
    public void gen() {
        Value value = codeGenerator.scope(varExpr).getValue(varExpr.ID().getText());
        LLVMValueRef valueRef;
        //如果不是基本类型，变量应该是一个指针
        if(value.getType().isBasic()){
            valueRef = LLVMAddGlobal(codeGenerator.llvmModule, codeGenerator.getLLVMType(value.valueType.nameWithBracket()), value.valueName);
        }else {
            LLVMTypeRef ptr = LLVMPointerType(codeGenerator.getLLVMType(value.valueType.nameWithBracket()), 0);
            valueRef = LLVMAddGlobal(codeGenerator.llvmModule, ptr, value.valueName);
        }
        codeGenerator.addLLVMValue(value, valueRef);
        result(valueRef);
        extraResult(value);
    }
}
