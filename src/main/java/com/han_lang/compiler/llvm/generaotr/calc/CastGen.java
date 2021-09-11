package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.generaotr.CalcGen;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class CastGen extends Codegen<LLVMValueRef> {
    HanCompilerParser.CastExprContext castExpr;
    Scope scope;

    public CastGen(HanCompilerParser.CastExprContext castExpr, Scope scope) {
        this.castExpr = castExpr;
        this.scope = scope;
    }

    @Override
    public void gen() {
        //查找转换函数
        Calc castCalc = scope.getCalcExprRecord(castExpr);
        Calc fromCalc = scope.getCalcExprRecord(castExpr.calcExpr());
        TypeSet typeSet = new TypeSet(fromCalc.getType(), castCalc.getType());
        Func func = scope.getGlobal().getCaster(typeSet);
        //获取函数并生成参数和返回类型
        LLVMValueRef funcValueRef = LLVMGetNamedFunction(codeGenerator.llvmModule, func.funcName);
        LLVMValueRef argValueRef = new CalcGen(castExpr.calcExpr()).gen(codeGenerator).result();

        PointerPointer<LLVMValueRef> argsPtr = new PointerPointer<>(1);
        argsPtr.put(0, argValueRef);
        codeGenerator.addToDispose(argsPtr);
        result(LLVMBuildCall(codeGenerator.llvmBuilder, funcValueRef, argsPtr, 1, codeGenerator.newAutoVar()));
    }
}
