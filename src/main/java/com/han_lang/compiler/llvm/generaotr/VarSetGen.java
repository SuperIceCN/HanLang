package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Value;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import java.util.Objects;

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
        LLVMValueRef toLLVMValue = null;
        LLVMValueRef fromLLVMValue = null;
        Value to = null;
        if(ID != null){
            String text = ID;
            to = scope.getValue(text);
            toLLVMValue = codeGenerator.getLLVMValue(to);
            fromLLVMValue = new CalcGen(calcExpr).gen(codeGenerator).result();
        }
        //声明合并赋值
        else if(varExpr != null){
            if(scope instanceof Global){
                NewGlobalVarGen globalVarGen = new NewGlobalVarGen(varExpr);
                globalVarGen.gen(codeGenerator);
                //将生成的value-llvmValueRef保存
                codeGenerator.addLLVMValue(globalVarGen.extraResult(), globalVarGen.result());
                //暂存生成的llvmValueRef
                toLLVMValue = globalVarGen.result();
                to = globalVarGen.extraResult();
            }else {
                NewVarGen varGen = new NewVarGen(varExpr);
                varGen.gen(codeGenerator);
                //将生成的value-llvmValueRef保存
                codeGenerator.addLLVMValue(varGen.extraResult(), varGen.result());
                //暂存生成的llvmValueRef
                toLLVMValue = varGen.result();
                to = varGen.extraResult();
            }
            fromLLVMValue = new CalcGen(calcExpr).gen(codeGenerator).result();
        }
        //如果两个值都是结构相同的结构体，但是名称不同，执行自动转换
        LLVMTypeRef fromLLVMType = LLVMTypeOf(fromLLVMValue);
        LLVMTypeRef toLLVMType = LLVMPointerType(codeGenerator.getLLVMType(Objects.requireNonNull(to).getType().nameWithBracket()), 0);
        int fromLLVMTypeKindId = LLVMGetTypeKind(fromLLVMType);
        int toLLVMTypeKindId = LLVMGetTypeKind(toLLVMType);
        if((fromLLVMTypeKindId == LLVMStructTypeKind || fromLLVMTypeKindId == LLVMConstantStructValueKind)
                && (toLLVMTypeKindId == LLVMStructTypeKind || toLLVMTypeKindId == LLVMConstantStructValueKind)){
            if(!LLVMGetStructName(fromLLVMType).getString().equals(LLVMGetStructName(toLLVMType).getString())){
                LLVMValueRef valueRef = LLVMBuildPointerCast(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMType, codeGenerator.newAutoVar());
                LLVMBuildStore(codeGenerator.llvmBuilder, valueRef, toLLVMValue);
            }else {
                LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
            }
        }
        //否则直接存入指针
        else {
            LLVMBuildStore(codeGenerator.llvmBuilder, fromLLVMValue, toLLVMValue);
        }
    }
}
