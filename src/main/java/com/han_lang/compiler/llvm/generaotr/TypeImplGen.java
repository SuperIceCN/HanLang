package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class TypeImplGen extends Codegen<Void> {
    Type type;

    public TypeImplGen(Type type){
        this.type = type;
    }

    @Override
    public void gen() {
        //如果是非结构体（基本类型或数组）并且不是类型别名，略过不实现
        //llvm中数组使用字面量类型即可
        if(type.expand().isStruct()) {
            type = type.global.getGlobalType(type.name);
            System.out.println(type);
            LLVMTypeRef struct = codeGenerator.getLLVMType(type.nameWithBracket());
            PointerPointer<LLVMTypeRef> elements = new PointerPointer<>(type.subtypes.size());
            codeGenerator.addToDispose(elements);
            for(int i=0;i<type.subtypes.size();i++){
                Type t = type.subtypes.get(i);
                if(t.isBasic()){
                    elements.put(i, codeGenerator.getLLVMType(t.type));
                }else {
                    LLVMTypeRef ptr = LLVMPointerType(codeGenerator.getLLVMType(t.type), 0);
                    elements.put(i, ptr);
                }
            }
            LLVMStructSetBody(struct, elements, type.subtypes.size(), 0);
        }
    }
}
