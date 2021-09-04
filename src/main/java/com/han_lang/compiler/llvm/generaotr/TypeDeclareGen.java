package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.llvm.Codegen;

import static com.han_lang.compiler.llvm.LLVMUtil.localVar;

public class TypeDeclareGen extends Codegen {
    Type type;

    public TypeDeclareGen(Type type){
        this.type = type;
    }

    @Override
    public String gen() {
        //如果是非结构体（基本类型或数组）并且不是类型别名，略过不声明
        StringBuilder tmp = new StringBuilder();
        if(type.expand().isStruct()){
            tmp.append(localVar(type.name)).append(" = type opaque\n");
        }
        return tmp.toString();
    }
}
