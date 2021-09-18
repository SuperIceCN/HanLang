package com.han_lang.compiler.llvm.generaotr.calc;

import com.han_lang.compiler.analysis.Calc;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen2;
import com.han_lang.util.MathUtil;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class LiteralGen extends Codegen2<LLVMValueRef, Type> {
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
            extraResult(Type.getAbstract(codeGenerator.getGlobal(), "bool", "<bool>"));
        }else if(literalCtx.DEC() != null){
            String text = literalCtx.getText();
            LLVMTypeRef typeRef = codeGenerator.getLLVMType(calc.getType().type);
            result(LLVMConstRealOfString(typeRef, text));
            extraResult(Type.getAbstract(codeGenerator.getGlobal(), "dec", "<dec>"));
        }else if(literalCtx.INT() != null){
            long num = MathUtil.autoParseLong(literalCtx.getText());
            LLVMTypeRef typeRef = codeGenerator.getLLVMType(calc.getType().type);
            result(LLVMConstInt(typeRef, num, 1));
            extraResult(Type.getAbstract(codeGenerator.getGlobal(), "int", "<int>"));
        }else if(literalCtx.STRING() != null){
            String text = literalCtx.getText();
            text = text.substring(1, text.length() - 1);
            result(LLVMBuildGlobalStringPtr(codeGenerator.llvmBuilder, text, codeGenerator.newAutoVar()));
            extraResult(Type.getAbstract(codeGenerator.getGlobal(), "string", "<string>"));
        }
    }
}
