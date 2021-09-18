package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.Codegen2;
import com.han_lang.compiler.llvm.generaotr.calc.ValueInitGen;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import java.util.Objects;

import static org.bytedeco.llvm.global.LLVM.*;

/**
 * 生成全局变量
 */
public class NewGlobalVarGen extends Codegen2<LLVMValueRef, Value> {
    HanCompilerParser.VarExprContext varExpr = null;

    Scope scope;
    String ID;

    public NewGlobalVarGen(HanCompilerParser.VarExprContext varExpr) {
        this.varExpr = varExpr;
        this.ID = varExpr.ID().getText();
    }

    public NewGlobalVarGen(Scope scope, String ID) {
        this.scope = scope;
        this.ID = ID;
    }

    @Override
    public void gen() {
        Value value;
        if(varExpr != null) value = codeGenerator.scope(varExpr).getValue(ID);
        else value = scope.getValue(ID);

        LLVMValueRef valueRef;
        //如果不是基本类型，变量应该是一个指针
        if(value.getType().isBasic()){
            valueRef = LLVMAddGlobal(codeGenerator.llvmModule, codeGenerator.getLLVMType(value.valueType.nameWithBracket()), value.valueName);
        }else {
            LLVMTypeRef ptr = LLVMPointerType(codeGenerator.getLLVMType(value.valueType.nameWithBracket()), 0);
            valueRef = LLVMAddGlobal(codeGenerator.llvmModule, ptr, value.valueName);
        }
        codeGenerator.addLLVMValue(value, valueRef);

        //如果有初始化运算符就申请内存空间
        if(varExpr != null && varExpr.OP_Init() != null)
            new ValueInitGen(valueRef, Objects.requireNonNull(value).getType()).gen(codeGenerator);

        result(valueRef);
        extraResult(value);
    }
}
