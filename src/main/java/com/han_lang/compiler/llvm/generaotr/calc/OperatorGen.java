package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.generaotr.CalcGen;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class OperatorGen extends Codegen<LLVMValueRef> {
    String operator;
    HanCompilerParser.CalcExprContext calcExpr1;
    HanCompilerParser.CalcExprContext calcExpr2;

    public OperatorGen(String operator, HanCompilerParser.CalcExprContext calcExpr1, HanCompilerParser.CalcExprContext calcExpr2) {
        this.operator = operator;
        this.calcExpr1 = calcExpr1;
        this.calcExpr2 = calcExpr2;
    }

    public OperatorGen(String operator, HanCompilerParser.CalcExprContext calcExpr1) {
        this.operator = operator;
        this.calcExpr1 = calcExpr1;
    }

    @Override
    public void gen() {
        Scope scope = codeGenerator.scope(calcExpr1);
        //获取运算符函数
        TypeSet argsTypeSet = new TypeSet(scope.getCalcExprRecord(calcExpr1).getType());
        if(calcExpr2 != null){
            argsTypeSet = argsTypeSet.merge(new TypeSet(scope.getCalcExprRecord(calcExpr2).getType()));
        }
        Func opFunc = scope.getGlobal().getOperator(operator, argsTypeSet);
        //获取LLVM中的运算符函数
        LLVMValueRef funcRef = LLVMGetNamedFunction(codeGenerator.llvmModule, opFunc.funcName);
        //构建参数数组
        PointerPointer<LLVMValueRef> argsPtr = new PointerPointer<>(argsTypeSet.size());
        codeGenerator.addToDispose(argsPtr);
        argsPtr.put(0, new CalcGen(calcExpr1, scope.getCalcExprRecord(calcExpr1).getType()).gen(codeGenerator).result());
        if(calcExpr2 != null){
            argsPtr.put(1, new CalcGen(calcExpr2, scope.getCalcExprRecord(calcExpr2).getType()).gen(codeGenerator).result());
        }
        //构建调用
        result(LLVMBuildCall(codeGenerator.llvmBuilder, funcRef, argsPtr, argsTypeSet.size(), codeGenerator.newAutoVar()));
    }
}
