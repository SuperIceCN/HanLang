package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.LLVMUtil;

public class FuncImplGen extends Codegen {
    Func func;
    HanCompilerParser.FunctionExprContext funcCtx;

    public FuncImplGen(Func func, HanCompilerParser.FunctionExprContext ctx) {
        this.func = func;
        this.funcCtx = ctx;
    }

    @Override
    public String gen() {
        StringBuilder tmp = new StringBuilder();
        tmp.append("define ")
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
        //TODO 支持分支与循环结构
        tmp.append(") ").append("{\n")
                .append(codeGenerator.newAutoLabel()).append(":\n")
                .append(codeGenerator.visit(Func.funcInnerExprs(funcCtx)).content).append("}");
        return tmp.toString();
    }
}
