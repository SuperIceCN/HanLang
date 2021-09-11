package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMTargetRef;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class FuncDeclareGen extends Codegen<Void> {
    Func func;

    public FuncDeclareGen(Func func) {
        this.func = func;
    }

    @Override
    public void gen() {
        int argsCount = func.argumentTypes.size();
        PointerPointer<LLVMTargetRef> argLLVMTypes = new PointerPointer<>(argsCount);
        codeGenerator.addToDispose(argLLVMTypes);
        for(int i=0; i< argsCount; i++){
            Type t = func.argumentTypes.get(i);
            if(t.isBasic()){
                argLLVMTypes.put(i, codeGenerator.getLLVMType(t.type));
            }else {
                argLLVMTypes.put(i, LLVMPointerType(codeGenerator.getLLVMType(t.type), 0));
            }
        }
        LLVMTypeRef retType;
        if(func.returnType.isBasic()){
            retType = codeGenerator.getLLVMType(func.returnType.nameWithBracket());
        }else {
            retType = LLVMPointerType(codeGenerator.getLLVMType(func.returnType.nameWithBracket()), 0);
        }
        LLVMTypeRef funcType = LLVMFunctionType(retType, argLLVMTypes, argsCount, 0);
        LLVMAddFunction(codeGenerator.llvmModule, func.funcName , funcType);
        codeGenerator.addLLVMType("<"+func.signatureString()+">", funcType);
//        StringBuilder tmp = new StringBuilder();
//        tmp.append("declare ")
//                .append(new TypeUseGen(func.returnType).gen())
//                .append(" ")
//                .append(LLVMUtil.globalVar(func.funcName))
//                .append("(");
//        for(int i=0;i<func.argumentTypes.size();i++){
//            if(i != 0){
//                tmp.append(", ");
//            }
//            tmp.append(new TypeUseGen(func.argumentTypes.get(i)).gen());
//        }
//        tmp.append(")").append("\n");
//        return tmp.toString();
    }
}
