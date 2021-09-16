package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.generaotr.calc.ValueInitGen;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import java.util.Objects;

import static org.bytedeco.llvm.global.LLVM.*;

public class NewConstGen extends Codegen<Void> {
    HanCompilerParser.ConstAndSetExprContext constExpr;

    public NewConstGen(HanCompilerParser.ConstAndSetExprContext constExpr) {
        this.constExpr = constExpr;
    }

    @Override
    public void gen() {
        Scope scope = codeGenerator.scope(constExpr);
        LLVMValueRef valueRef;
        Value value;
        //声明变量
        //当前对于常量的处理方式是跟变量类似的，但是从语法层面禁止了修改。
        {
            if(scope instanceof Global){
                NewGlobalVarGen globalVarGen = new NewGlobalVarGen(scope, constExpr.ID().getText());
                valueRef = globalVarGen.gen(codeGenerator).result();
                value = globalVarGen.extraResult();
                LLVMSetLinkage(valueRef, LLVMExternalWeakLinkage);
            }else {
                NewVarGen varGen = new NewVarGen(scope, constExpr.ID().getText());
                valueRef = varGen.gen(codeGenerator).result();
                value = varGen.extraResult();
            }
        }
        //如果有~的话就进行初始化
        {
            if(constExpr.OP_Init() != null)
                new ValueInitGen(valueRef, Objects.requireNonNull(value).getType()).gen(codeGenerator);
        }
        //为常量赋值
        {
            new VarSetGen(scope, constExpr.ID().getText(), null, constExpr.calcExpr())
                .gen(codeGenerator);
        }
    }
}
