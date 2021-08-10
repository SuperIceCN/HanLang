package com.han_lang.test;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;
import org.junit.jupiter.api.Test;

import static org.bytedeco.llvm.global.LLVM.*;

public class llvmTest {
    public final BytePointer error = new BytePointer();
    @Test
    public void simpleLLVM(){
        // Stage 1: Initialize LLVM components
        LLVMInitializeCore(LLVMGetGlobalPassRegistry());

        // 初始化wasm编译工具链
        LLVMInitializeWebAssemblyAsmPrinter();
        LLVMInitializeWebAssemblyAsmParser();
        LLVMInitializeWebAssemblyDisassembler();
        LLVMInitializeWebAssemblyTarget();
        LLVMInitializeWebAssemblyTargetMC();
        LLVMInitializeWebAssemblyTargetInfo();

        // 初始化本机编译工具链
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeDisassembler();
        LLVMInitializeNativeTarget();

        // Stage 2: Build the sum function
        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef module = LLVMModuleCreateWithNameInContext("sum", context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);
        LLVMTypeRef i32Type = LLVMInt32TypeInContext(context);
        PointerPointer<Pointer> sumArgumentTypes = new PointerPointer<>(2)
                .put(0, i32Type)
                .put(1, i32Type);
        LLVMTypeRef sumType = LLVMFunctionType(i32Type, sumArgumentTypes, /* argumentCount */ 2, /* isVariadic */ 0);

        LLVMValueRef sum = LLVMAddFunction(module, "sum", sumType);
        LLVMSetFunctionCallConv(sum, LLVMCCallConv);
        LLVMSetVisibility(sum, LLVMDefaultVisibility);
        LLVMAddTargetDependentFunctionAttr(sum, "wasm-export-name", LLVMGetValueName(sum).getString());

        LLVMValueRef lhs = LLVMGetParam(sum, 0);
        LLVMSetValueName(lhs, "a");
        LLVMValueRef rhs = LLVMGetParam(sum, 1);
        LLVMSetValueName(rhs, "b");
        LLVMBasicBlockRef entry = LLVMAppendBasicBlockInContext(context, sum, "entry");

        LLVMPositionBuilderAtEnd(builder, entry);
        LLVMValueRef result = LLVMBuildAdd(builder, lhs, rhs, "result = lhs + rhs");
        LLVMBuildRet(builder, result);

        LLVMDumpModule(module);
        if (LLVMVerifyModule(module, LLVMPrintMessageAction, error) != 0) {
            System.out.println("Failed to validate module: " + error.getString());
            return;
        }

        // Stage 3: Dump the module to file
        if (LLVMWriteBitcodeToFile(module, "./sum.bc") != 0) {
            System.err.println("Failed to write bitcode to file");
            return;
        }

        // Stage 4: Create the relocatable object file
        //BytePointer triple = LLVMGetDefaultTargetTriple();
        //wasm32-unknown-wasi-unknown
        BytePointer triple = new BytePointer("wasm32-unknown-wasi-unknown");
        System.out.println(triple.getString());
        LLVMTargetRef target = new LLVMTargetRef();

        if (LLVMGetTargetFromTriple(triple, target, error) != 0) {
            System.out.println("Failed to get target from triple: " + error.getString());
            LLVMDisposeMessage(error);
            return;
        }

        String cpu = "generic";
        String cpuFeatures = "";
        int optimizationLevel = 0;
        LLVMTargetMachineRef tm = LLVMCreateTargetMachine(
                target, triple.getString(), cpu, cpuFeatures, optimizationLevel,
                LLVMRelocDefault, LLVMCodeModelDefault
        );

        BytePointer ObjOutputFile = new BytePointer("./sum.wasm");
        if (LLVMTargetMachineEmitToFile(tm, module, ObjOutputFile, LLVMObjectFile, error) != 0) {
            System.err.println("Failed to emit relocatable object file: " + error.getString());
            LLVMDisposeMessage(error);
            return;
        }

        // Stage 5: Dispose of allocated resources
        triple.deallocate();
        ObjOutputFile.deallocate();
        LLVMDisposeMessage(triple);
        LLVMDisposeBuilder(builder);
        LLVMDisposeModule(module);
        LLVMContextDispose(context);
    }
}
