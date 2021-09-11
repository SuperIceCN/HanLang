package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.generaotr.calc.LiteralGen;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class CalcGen extends Codegen<LLVMValueRef> {
    HanCompilerParser.CalcExprContext calcExpr;

    public CalcGen(HanCompilerParser.CalcExprContext calcExpr){
        this.calcExpr = calcExpr;
    }

    @Override
    public void gen() {
        Scope scope = codeGenerator.scope(calcExpr);
        Calc calc = scope.getCalcExprRecord(calcExpr);
        if(calcExpr instanceof HanCompilerParser.LExprContext){
            HanCompilerParser.LExprContext lExprContext = (HanCompilerParser.LExprContext) calcExpr;
            //字面量
            if(lExprContext.literal() != null){
                result(new LiteralGen(lExprContext.literal(), calc, scope).gen(codeGenerator).result());
            }
        }else if(calcExpr instanceof HanCompilerParser.LBExprContext){
            HanCompilerParser.LBExprContext lbExprContext = (HanCompilerParser.LBExprContext) calcExpr;
            //字面量
            if(lbExprContext.literal() != null){
                result(new LiteralGen(lbExprContext.literal(), calc, scope).gen(codeGenerator).result());
            }
        }
    }
}
