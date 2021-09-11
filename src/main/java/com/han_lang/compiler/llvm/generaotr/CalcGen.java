package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.generaotr.calc.*;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static com.han_lang.util.DataUtil.switchNotNull;
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
            //引用其他量
            else if(lExprContext.ID() != null){
                result(new VarUseGen(scope, scope.getValue(lExprContext.ID().getText())).gen(codeGenerator).result());
            }
        }else if(calcExpr instanceof HanCompilerParser.LBExprContext){
            HanCompilerParser.LBExprContext lbExprContext = (HanCompilerParser.LBExprContext) calcExpr;
            //字面量
            if(lbExprContext.literal() != null){
                result(new LiteralGen(lbExprContext.literal(), calc, scope).gen(codeGenerator).result());
            }
            //引用其他量
            else if(lbExprContext.ID() != null){
                result(new VarUseGen(scope, scope.getValue(lbExprContext.ID().getText())).gen(codeGenerator).result());
            }
        }else if(calcExpr instanceof HanCompilerParser.CastExprContext){
            HanCompilerParser.CastExprContext castExprContext = (HanCompilerParser.CastExprContext) calcExpr;
            result(new CastGen(castExprContext, scope).gen(codeGenerator).result());
        }else if(calcExpr instanceof HanCompilerParser.C1ExprContext){
            HanCompilerParser.C1ExprContext c1ExprContext = (HanCompilerParser.C1ExprContext) calcExpr;
            String operator = Calc.operatorId(c1ExprContext.operator1());
            result(new OperatorGen(operator, c1ExprContext.calcExpr()).gen(codeGenerator).result());
        }else if(calcExpr instanceof HanCompilerParser.C2ExprContext){
            HanCompilerParser.C2ExprContext c2ExprContext = (HanCompilerParser.C2ExprContext) calcExpr;
            String operator = switchNotNull(
                    Calc.operatorId(c2ExprContext.operator2_p1()),
                    Calc.operatorId(c2ExprContext.operator2_p2()),
                    Calc.operatorId(c2ExprContext.operator2_p3()),
                    Calc.operatorId(c2ExprContext.operator2_p4()),
                    Calc.operatorId(c2ExprContext.operator2_p5())
            );
            result(new OperatorGen(operator, c2ExprContext.calcExpr(0), c2ExprContext.calcExpr(1)).gen(codeGenerator).result());
        }else if(calcExpr instanceof HanCompilerParser.ECExprContext){
            HanCompilerParser.ECExprContext ecExprContext = (HanCompilerParser.ECExprContext) calcExpr;
            String operator = Calc.operatorId(ecExprContext.operatorEnd());
            result(new OperatorGen(operator, ecExprContext.calcExpr()).gen(codeGenerator).result());
        }else if(calcExpr instanceof HanCompilerParser.C2ExprBContext){
            HanCompilerParser.C2ExprBContext c2bExprContext = (HanCompilerParser.C2ExprBContext) calcExpr;
            String operator = Calc.operatorId(c2bExprContext.operator_all());
            result(new OperatorGen(operator, c2bExprContext.calcExpr(0), c2bExprContext.calcExpr(1)).gen(codeGenerator).result());
        }else if (calcExpr instanceof HanCompilerParser.FPtrExprContext){
            result(new FuncPtrGen((HanCompilerParser.FPtrExprContext) calcExpr).gen(codeGenerator).result());
        }
    }
}
