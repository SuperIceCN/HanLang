package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.generaotr.calc.VarUseGen;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class VarSetGen extends Codegen<Void> {
    HanCompilerParser.SetExprContext setExpr;

    public VarSetGen(HanCompilerParser.SetExprContext setExpr) {
        this.setExpr = setExpr;
    }

    @Override
    public void gen() {
        Scope scope = codeGenerator.scope(setExpr);
        if(setExpr.ID() != null){
            String text = setExpr.ID().getText();
            Value to = scope.getValue(text);
            LLVMValueRef toLLVMValue = codeGenerator.getLLVMValue(to);
            LLVMValueRef fromLLVMValue = new CalcGen(setExpr.calcExpr()).gen(codeGenerator).result();
            LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
        }
        //声明合并赋值
        else if(setExpr.varExpr() != null){
            LLVMValueRef toLLVMValue;
            if(scope instanceof Global){
                NewGlobalVarGen globalVarGen = new NewGlobalVarGen(setExpr.varExpr());
                globalVarGen.gen(codeGenerator);
                //将生成的value-llvmValueRef保存
                codeGenerator.addLLVMValue(globalVarGen.extraResult(), globalVarGen.result());
                //暂存生成的llvmValueRef
                toLLVMValue = globalVarGen.result();
            }else {
                NewVarGen varGen = new NewVarGen(setExpr.varExpr());
                varGen.gen(codeGenerator);
                //将生成的value-llvmValueRef保存
                codeGenerator.addLLVMValue(varGen.extraResult(), varGen.result());
                //暂存生成的llvmValueRef
                toLLVMValue = varGen.result();
            }
            LLVMValueRef fromLLVMValue = new CalcGen(setExpr.calcExpr()).gen(codeGenerator).result();
            LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
        }
    }
}
