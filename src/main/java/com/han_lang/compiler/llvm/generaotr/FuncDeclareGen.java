package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.LLVMUtil;

public class FuncDeclareGen extends Codegen {
    Func func;

    public FuncDeclareGen(Func func) {
        this.func = func;
    }

    @Override
    public String gen() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("declare ")
                .append(new TypeUseGen(func.returnType).gen())
                .append(" ")
                .append(LLVMUtil.globalVar(func.funcName))
                .append("(");
        for(int i=0;i<func.argumentTypes.size();i++){
            if(i != 0){
                tmp.append(", ");
            }
            tmp.append(new TypeUseGen(func.argumentTypes.get(i)).gen());
        }
        tmp.append(")").append("\n");
        return tmp.toString();
    }
}
