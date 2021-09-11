package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.util.MathUtil;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class LiteralGen extends Codegen<LLVMValueRef> {
    HanCompilerParser.LiteralContext literalCtx;
    Scope scope;
    Calc calc;

    public LiteralGen(HanCompilerParser.LiteralContext literalCtx, Calc calc, Scope scope) {
        this.literalCtx = literalCtx;
        this.calc = calc;
        this.scope = scope;
    }

    @Override
    public void gen() {
        if(literalCtx.BOOL() != null){
            String text = literalCtx.getText();
            byte b = 0;
            switch (text){
                case "真": case "true":
                    b = 1; break;
                case "假": case "false":
                    b = 0; break;
            }
            result(LLVMConstInt(codeGenerator.getLLVMType("<bool>"), b, 0));
        }else if(literalCtx.DEC() != null){
            String text = literalCtx.getText();
            LLVMTypeRef typeRef = codeGenerator.getLLVMType(calc.getType().type);
            result(LLVMConstRealOfString(typeRef, text));
        }else if(literalCtx.INT() != null){
            long num = MathUtil.autoParseLong(literalCtx.getText());
            LLVMTypeRef typeRef = codeGenerator.getLLVMType(calc.getType().type);
            result(LLVMConstInt(typeRef, num, 1));
        }else if(literalCtx.STRING() != null){
            String text = literalCtx.getText();
            text = text.substring(1, text.length() - 1);
            result(LLVMBuildGlobalStringPtr(codeGenerator.llvmBuilder, text, codeGenerator.newAutoVar()));
        }
    }
}
