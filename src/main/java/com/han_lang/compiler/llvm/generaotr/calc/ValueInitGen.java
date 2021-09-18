package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class ValueInitGen extends Codegen<LLVMValueRef> {
    LLVMValueRef llvmValue;
    Type type;

    public ValueInitGen(LLVMValueRef llvmValue, Type type) {
        this.llvmValue = llvmValue;
        this.type = type;
    }

    @Override
    public void gen() {
        LLVMTypeRef llvmType;
        llvmType = codeGenerator.getLLVMType(type.type);
        if(llvmType == null){
            llvmType = codeGenerator.getLLVMType(type.nameWithBracket());
        }
        if(type.isInteger()){
            LLVMBuildStore(codeGenerator.llvmBuilder, LLVMConstInt(llvmType, 0, 1), llvmValue);
        }else if(type.isDecimal()){
            LLVMBuildStore(codeGenerator.llvmBuilder, LLVMConstReal(llvmType, 0d), llvmValue);
        }else if(type.isBool()){
            LLVMBuildStore(codeGenerator.llvmBuilder, LLVMConstInt(llvmType, 0, 1), llvmValue);
        }else if(type.isString()){
            LLVMBuildStore(codeGenerator.llvmBuilder, LLVMBuildGlobalStringPtr(codeGenerator.llvmBuilder, "\0", codeGenerator.newAutoVar()), llvmValue);
        }else{
            long size = LLVMABISizeOfType(codeGenerator.llvmTargetData, llvmType);
            LLVMValueRef funcValue = LLVMGetNamedFunction(codeGenerator.llvmModule, "__GC_malloc");
            BytePointer tmp = new BytePointer(codeGenerator.newAutoVar());
            codeGenerator.addToDispose(tmp);
            LLVMValueRef retValue = LLVMBuildCall(codeGenerator.llvmBuilder, funcValue
                    , LLVMConstInt(codeGenerator.getLLVMType("<lint>"), size, 1), 1, tmp);
            //获取指针指向的类型
            LLVMValueRef tmpValue = LLVMBuildLoad(codeGenerator.llvmBuilder, llvmValue, codeGenerator.newAutoVar());
            LLVMTypeRef llvmDePtrType = LLVMTypeOf(tmpValue);
            LLVMValueRef ptr = LLVMBuildIntToPtr(codeGenerator.llvmBuilder, retValue, llvmDePtrType, codeGenerator.newAutoVar());
            result(LLVMBuildStore(codeGenerator.llvmBuilder, ptr, llvmValue));
        }
    }
}
