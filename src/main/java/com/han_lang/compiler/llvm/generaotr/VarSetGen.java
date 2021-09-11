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

    Scope scope;
    String ID = null;
    HanCompilerParser.VarExprContext varExpr;
    HanCompilerParser.CalcExprContext calcExpr;


    public VarSetGen(HanCompilerParser.SetExprContext setExpr) {
        this.setExpr = setExpr;
        this.varExpr = setExpr.varExpr();
        if(setExpr.ID() != null) this.ID = setExpr.ID().getText();
        this.calcExpr = setExpr.calcExpr();
    }

    public VarSetGen(Scope scope, String ID, HanCompilerParser.VarExprContext varExpr, HanCompilerParser.CalcExprContext calcExpr) {
        this.scope = scope;
        this.ID = ID;
        this.varExpr = varExpr;
        this.calcExpr = calcExpr;
    }

    @Override
    public void gen() {
        if(scope == null) scope = codeGenerator.scope(setExpr);

        if(ID != null){
            String text = ID;
            Value to = scope.getValue(text);
            LLVMValueRef toLLVMValue = codeGenerator.getLLVMValue(to);
            LLVMValueRef fromLLVMValue = new CalcGen(calcExpr).gen(codeGenerator).result();
            LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
        }
        //声明合并赋值
        else if(varExpr != null){
            LLVMValueRef toLLVMValue;
            if(scope instanceof Global){
                NewGlobalVarGen globalVarGen = new NewGlobalVarGen(varExpr);
                globalVarGen.gen(codeGenerator);
                //将生成的value-llvmValueRef保存
                codeGenerator.addLLVMValue(globalVarGen.extraResult(), globalVarGen.result());
                //暂存生成的llvmValueRef
                toLLVMValue = globalVarGen.result();
            }else {
                NewVarGen varGen = new NewVarGen(varExpr);
                varGen.gen(codeGenerator);
                //将生成的value-llvmValueRef保存
                codeGenerator.addLLVMValue(varGen.extraResult(), varGen.result());
                //暂存生成的llvmValueRef
                toLLVMValue = varGen.result();
            }
            LLVMValueRef fromLLVMValue = new CalcGen(calcExpr).gen(codeGenerator).result();
            LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
        }
    }
}
