package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.LLVMBasicBlockRef;
import org.bytedeco.llvm.LLVM.LLVMTypeRef;
import org.bytedeco.llvm.LLVM.LLVMValueRef;

import static org.bytedeco.llvm.global.LLVM.*;

public class MainFuncGen extends Codegen<Void> {
    HanCompilerParser.ProgramContext programCtx;

    public MainFuncGen(HanCompilerParser.ProgramContext programCtx) {
        this.programCtx = programCtx;
    }

    @Override
    public void gen() {
        PointerPointer<LLVMTypeRef> args = new PointerPointer<>(0);
        codeGenerator.addToDispose(args);
        LLVMTypeRef mainFuncType = LLVMFunctionType(LLVMInt32TypeInContext(codeGenerator.llvmContext), args, 0, 0);
        LLVMValueRef mainFuncValue = LLVMAddFunction(codeGenerator.llvmModule, "main", mainFuncType);
        LLVMBasicBlockRef block = LLVMAppendBasicBlockInContext(codeGenerator.llvmContext, mainFuncValue, "entry");
        LLVMPositionBuilderAtEnd(codeGenerator.llvmBuilder, block);

        boolean ret = false;

        //对每一条语句生成内容
        for(HanCompilerParser.ExprContext expr : programCtx.expr()){
            if(expr instanceof HanCompilerParser.InnerVarExprContext){
                new NewGlobalVarGen(((HanCompilerParser.InnerVarExprContext) expr).varExpr()).gen(codeGenerator);
            }else if(expr instanceof HanCompilerParser.InnerSetExprContext){
                new VarSetGen(((HanCompilerParser.InnerSetExprContext) expr).setExpr()).gen(codeGenerator);
            }
        }

        //返回值
        if(!ret){
            LLVMBuildRet(codeGenerator.llvmBuilder, LLVMConstInt(codeGenerator.getLLVMType("<int>"), 0, 1));
        }
    }
}
