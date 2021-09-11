package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMTargetRef;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class TypeDeclareGen extends Codegen<Void> {
    Type type;

    public TypeDeclareGen(Type type){
        this.type = type;
    }

    @Override
    public void gen() {
        //如果是结构体
        if(type.expand().isStruct()){
            LLVMTypeRef typeRef = LLVMStructCreateNamed(codeGenerator.llvmContext, "struct."+type.name);
            codeGenerator.addLLVMType(type.nameWithBracket(), typeRef);
        }
        //如果是数组类型
        if(type.expand().isArray()){
            Type single = type.expand().toSingleType();
            LLVMTypeRef singleTypeRef = codeGenerator.getLLVMType(single.type);
            if(!single.isBasic()) {
                singleTypeRef = LLVMPointerType(singleTypeRef, 0);
            }
            LLVMTypeRef arrayTypeRef = LLVMArrayType(singleTypeRef, type.expand().toArrayLength());
            codeGenerator.addLLVMType(type.nameWithBracket(), arrayTypeRef);
        }
        //如果是函数类型
        if(type.expand().isFunc()){
            TypeSet argumentTypes = type.expand().toArgTypes();
            Type returnType = type.expand().toReturnType();
            int argsCount = argumentTypes.size();
            PointerPointer<LLVMTargetRef> argLLVMTypes = new PointerPointer<>(argsCount);
            codeGenerator.addToDispose(argLLVMTypes);
            for(int i=0; i< argsCount; i++){
                Type t = argumentTypes.get(i);
                if(t.isBasic()){
                    argLLVMTypes.put(i, codeGenerator.getLLVMType(t.type));
                }else {
                    argLLVMTypes.put(i, LLVMPointerType(codeGenerator.getLLVMType(t.type), 0));
                }
            }
            LLVMTypeRef retType;
            if(returnType.isBasic()){
                retType = codeGenerator.getLLVMType(returnType.type);
            }else {
                retType = LLVMPointerType(codeGenerator.getLLVMType(returnType.type), 0);
            }
            LLVMTypeRef funcType = LLVMFunctionType(retType, argLLVMTypes, argsCount, 0);
            codeGenerator.addLLVMType(type.nameWithBracket(), funcType);
        }
        //如果是别名类型
        if(type.expand().isAlias() && !type.isBasic()){
            codeGenerator.addLLVMType(type.nameWithBracket(), codeGenerator.getLLVMType(type.expand().type));
        }
    }
}
