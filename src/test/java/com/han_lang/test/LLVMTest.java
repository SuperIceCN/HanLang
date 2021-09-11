package com.han_lang.test;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.bytedeco.llvm.global.LLVM.*;

public class LLVMTest {
    @Test
    public void llvm(){
        BytePointer error = new BytePointer();

        // Stage 1: Initialize LLVM components
        LLVMInitializeCore(LLVMGetGlobalPassRegistry());
        LLVMInitializeAllTargetInfos();
        LLVMInitializeAllAsmParsers();
        LLVMInitializeAllAsmPrinters();
        LLVMInitializeAllDisassemblers();
        LLVMInitializeAllTargetMCs();
        LLVMInitializeAllTargets();

        // Stage 2: Build the sum function
        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef module = LLVMModuleCreateWithNameInContext("sum", context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);
        LLVMTypeRef i32Type = LLVMInt32TypeInContext(context);
        LLVMTypeRef structType = LLVMStructCreateNamed(context, "hi");
        PointerPointer<Pointer> sumArgumentTypes = new PointerPointer<>(3)
                .put(0, i32Type)
                .put(1, i32Type)
                .put(2, structType);
        LLVMTypeRef sumType = LLVMFunctionType(i32Type, sumArgumentTypes, /* argumentCount */ 3, /* isVariadic */ 0);

        LLVMValueRef sum = LLVMAddFunction(module, "sum", sumType);
        LLVMSetFunctionCallConv(sum, LLVMCCallConv);

        LLVMValueRef lhs = LLVMGetParam(sum, 0);
        LLVMValueRef rhs = LLVMGetParam(sum, 1);
        LLVMBasicBlockRef entry = LLVMAppendBasicBlockInContext(context, sum, "entry");

        LLVMPositionBuilderAtEnd(builder, entry);
        LLVMValueRef result = LLVMBuildAdd(builder, lhs, rhs, "result = lhs + rhs");
        LLVMBuildRet(builder, result);


        //////
        LLVMPositionBuilderAtEnd(builder, entry);
        LLVMValueRef outputString = LLVMBuildGlobalStringPtr(builder, "Hello world!", "teststr");
        //printf
        LLVMTypeRef i8Type = LLVMInt8TypeInContext(context);
        LLVMTypeRef i8ptrType = LLVMPointerType(i8Type, 0);
        PointerPointer<Pointer> printfArgumentTypes = new PointerPointer<>(1)
                .put(0, i8ptrType);
        LLVMTypeRef printfType = LLVMFunctionType(i32Type, printfArgumentTypes, /* argumentCount */ 1, /* isVariadic */ 1);
        LLVMValueRef printf = LLVMAddFunction(module, "printf", printfType);
        //main
        LLVMTypeRef mainType = LLVMFunctionType(i32Type, new PointerPointer<Pointer>(0), 0, 0);
        LLVMValueRef main = LLVMAddFunction(module, "main", mainType);
        LLVMSetFunctionCallConv(main, LLVMCCallConv);


        LLVMBasicBlockRef l0 = LLVMAppendBasicBlockInContext(context, main, "l0");
        LLVMPositionBuilderAtEnd(builder, l0);
//        LLVMValueRef outputStringElement = LLVMBuildGEP(builder, outputString, new PointerPointer<Pointer>(2)
//                .put(0, LLVMConstInt(i32Type, 0, 1))
//                .put(0, LLVMConstInt(i32Type, 0, 1)), 2, "trytry");
//        LLVMValueRef outputStringElement = LLVMBuildInBoundsGEP(builder, outputString, new PointerPointer<Pointer>(2)
//                .put(0, LLVMConstInt(i32Type, 0, 1))
//                .put(0, LLVMConstInt(i32Type, 0, 1)), 0, "teststr");

        PointerPointer<Pointer> callPrintfArgs = new PointerPointer<>(1)
                .put(0, outputString);
        LLVMBuildCall(builder, printf, callPrintfArgs, 1, "ok");
        LLVMBuildRet(builder, LLVMConstInt(i32Type, 0, 1));
        //////
        String tripleStr = "wasm32-unknown-emscripten-unknown";
        //i686-pc-windows-gnu
        LLVMSetTarget(module, tripleStr);

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
        //BytePointer triple = new BytePointer("i686-pc-windows-gnu");
        BytePointer triple = new BytePointer(tripleStr);
        LLVMTargetRef target = new LLVMTargetRef();

        if (LLVMGetTargetFromTriple(triple, target, error) != 0) {
            System.out.println("Failed to get target from triple: " + error.getString());
            LLVMDisposeMessage(error);
            return;
        }

        System.out.println(LLVMGetTargetDescription(target).getString());

        String cpu = "generic";
        String cpuFeatures = "";
        int optimizationLevel = 3;
        LLVMTargetMachineRef tm = LLVMCreateTargetMachine(
                target, triple.getString(), cpu, cpuFeatures, optimizationLevel,
                LLVMRelocDefault, LLVMCodeModelDefault
        );

        BytePointer outputFile2 = new BytePointer("./sum.wasm");
        if (LLVMTargetMachineEmitToFile(tm, module, outputFile2, LLVMObjectFile, error) != 0) {
            System.err.println("Failed to emit relocatable object file: " + error.getString());
            LLVMDisposeMessage(error);
            return;
        }
        boolean loadable = lto_module_is_object_file("./sum.obj");
        System.out.println("LOAD: "+loadable);

        // Stage 5: Dispose of allocated resources
//        outputFile.deallocate();
        LLVMDisposeMessage(triple);
        LLVMDisposeBuilder(builder);
        LLVMDisposeModule(module);
        LLVMContextDispose(context);
    }
}
