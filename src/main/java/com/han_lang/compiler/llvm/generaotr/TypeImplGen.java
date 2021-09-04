package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.llvm.Codegen;

import static com.han_lang.compiler.llvm.LLVMUtil.localVar;

public class TypeImplGen extends Codegen {
    Type type;

    public TypeImplGen(Type type){
        this.type = type;
    }

    @Override
    public String gen() {
        //如果是非结构体（基本类型或数组）并且不是类型别名，略过不实现
        //llvm中数组使用字面量类型即可
        StringBuilder tmp = new StringBuilder();
        if(type.expand().isStruct()){
            type = type.global.getGlobalType(type.name);
            tmp.append(localVar(type.name)).append(" = type { ");
            for(int i=0;i<type.subtypes.size();i++){
                if(i!=0){
                    tmp.append(", ");
                }
                Type t = type.subtypes.get(i);
                if(t.isBasic())
                    tmp.append(new TypeUseGen(t).gen());
                else
                    tmp.append(new TypeUseGen(t).asRef().gen());
            }
            tmp.append(" }\n");
        }
        return tmp.toString();
    }
}
