package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen2;
import com.han_lang.compiler.llvm.generaotr.calc.*;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static com.han_lang.util.DataUtil.switchNotNull;
import static org.bytedeco.llvm.global.LLVM.*;

public class CalcGen extends Codegen2<LLVMValueRef, Type> {
    HanCompilerParser.CalcExprContext calcExpr;
    Type expect;

    public CalcGen(HanCompilerParser.CalcExprContext calcExpr, Type expect){
        this.calcExpr = calcExpr;
        this.expect = expect;
    }

    @Override
    public void gen() {
        Scope scope = codeGenerator.scope(calcExpr);
        Calc calc = scope.getCalcExprRecord(calcExpr);
        if(calcExpr instanceof HanCompilerParser.LExprContext){
            HanCompilerParser.LExprContext lExprContext = (HanCompilerParser.LExprContext) calcExpr;
            //字面量
            if(lExprContext.literal() != null){
                new LiteralGen(lExprContext.literal(), calc, scope).gen(codeGenerator).shareAll(this);
            }
            //引用其他量
            else if(lExprContext.ID() != null){
                new VarUseGen(scope, scope.getValue(lExprContext.ID().getText())).gen(codeGenerator).shareAll(this);
            }
        }else if(calcExpr instanceof HanCompilerParser.LBExprContext){
            HanCompilerParser.LBExprContext lbExprContext = (HanCompilerParser.LBExprContext) calcExpr;
            //字面量
            if(lbExprContext.literal() != null){
                new LiteralGen(lbExprContext.literal(), calc, scope).gen(codeGenerator).shareAll(this);
            }
            //引用其他量
            else if(lbExprContext.ID() != null){
                new VarUseGen(scope, scope.getValue(lbExprContext.ID().getText())).gen(codeGenerator).shareAll(this);
            }
        }else if(calcExpr instanceof HanCompilerParser.CastExprContext){
            HanCompilerParser.CastExprContext castExprContext = (HanCompilerParser.CastExprContext) calcExpr;
            new CastGen(castExprContext, scope).gen(codeGenerator).shareAll(this);
        }else if(calcExpr instanceof HanCompilerParser.C1ExprContext){
            HanCompilerParser.C1ExprContext c1ExprContext = (HanCompilerParser.C1ExprContext) calcExpr;
            String operator = Calc.operatorId(c1ExprContext.operator1());
            new OperatorGen(operator, c1ExprContext.calcExpr()).gen(codeGenerator).shareAll(this);
        }else if(calcExpr instanceof HanCompilerParser.C2ExprContext){
            HanCompilerParser.C2ExprContext c2ExprContext = (HanCompilerParser.C2ExprContext) calcExpr;
            String operator = switchNotNull(
                    Calc.operatorId(c2ExprContext.operator2_p1()),
                    Calc.operatorId(c2ExprContext.operator2_p2()),
                    Calc.operatorId(c2ExprContext.operator2_p3()),
                    Calc.operatorId(c2ExprContext.operator2_p4()),
                    Calc.operatorId(c2ExprContext.operator2_p5())
            );
            new OperatorGen(operator, c2ExprContext.calcExpr(0), c2ExprContext.calcExpr(1)).gen(codeGenerator).shareAll(this);
        }else if(calcExpr instanceof HanCompilerParser.ECExprContext){
            HanCompilerParser.ECExprContext ecExprContext = (HanCompilerParser.ECExprContext) calcExpr;
            String operator = Calc.operatorId(ecExprContext.operatorEnd());
            new OperatorGen(operator, ecExprContext.calcExpr()).gen(codeGenerator).shareAll(this);
        }else if(calcExpr instanceof HanCompilerParser.C2ExprBContext){
            HanCompilerParser.C2ExprBContext c2bExprContext = (HanCompilerParser.C2ExprBContext) calcExpr;
            String operator = Calc.operatorId(c2bExprContext.operator_all());
            new OperatorGen(operator, c2bExprContext.calcExpr(0), c2bExprContext.calcExpr(1)).gen(codeGenerator).shareAll(this);
        }else if (calcExpr instanceof HanCompilerParser.FPtrExprContext){
            new FuncPtrGen((HanCompilerParser.FPtrExprContext) calcExpr).gen(codeGenerator).shareAll(this);
        }
    }
}
