package com.han_lang.compiler.ast;

import com.han_lang.compiler.analysis.*;
import com.han_lang.compiler.llvm.generaotr.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.llvm.LLVM.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.bytedeco.llvm.global.LLVM.*;

public class HanCodegen extends HanCompilerBaseVisitor<VisitResult<?>>{
    public final String targetTriple = "x86_64-pc-windows-msvc";

    Global global;
    String programName;
    public ParseTreeProperty<Scope> ast2scope;
    public int labelIndex = 0;

    public LLVMModuleRef llvmModule;
    public LLVMContextRef llvmContext;
    public LLVMBuilderRef llvmBuilder;
    public LLVMTargetRef llvmTarget = new LLVMTargetRef();
    public LLVMTargetMachineRef llvmTargetMachine;
    public LLVMTargetDataRef llvmTargetData;

    public List<Pointer> toDispose = new LinkedList<>();
    public Map<String, LLVMTypeRef> llvmTypeMap = new HashMap<>();
    public Map<Value, LLVMValueRef> llvmValueMap = new HashMap<>();

    public HanCodegen(Global global, String programName, ParseTreeProperty<Scope> ast2scope){
        this.global = global;
        this.programName = programName;
        this.ast2scope = ast2scope;
        //初始化llvm
        LLVMInitializeCore(LLVMGetGlobalPassRegistry());
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeDisassembler();
        //LLVMInitializeNativeTargetMC();
        LLVMInitializeNativeTarget();
        BytePointer tt = new BytePointer(targetTriple);
        BytePointer err = new BytePointer();
        this.addToDispose(tt);
        this.addToDispose(err);
        LLVMGetTargetFromTriple(tt, llvmTarget, err);
        this.llvmTargetMachine = LLVMCreateTargetMachine(
                llvmTarget, targetTriple, "generic", "", 3, LLVMRelocDefault, LLVMCodeModelDefault
        );
        this.llvmTargetData = LLVMCreateTargetDataLayout(this.llvmTargetMachine);
        //创建llvm模块
        this.llvmContext = LLVMContextCreate();
        this.llvmModule = LLVMModuleCreateWithNameInContext(programName, llvmContext);
        this.llvmBuilder = LLVMCreateBuilderInContext(llvmContext);
        LLVMSetModuleDataLayout(llvmModule, llvmTargetData);
        //初始化基本类型
        initBasicLLVMTypes();
    }

    private void initBasicLLVMTypes(){
        llvmTypeMap.put("<byte>", LLVMInt8TypeInContext(llvmContext));
        llvmTypeMap.put("<sint>", LLVMInt16TypeInContext(llvmContext));
        llvmTypeMap.put("<int>", LLVMInt32TypeInContext(llvmContext));
        llvmTypeMap.put("<lint>", LLVMInt64TypeInContext(llvmContext));
        llvmTypeMap.put("<llint>", LLVMInt128TypeInContext(llvmContext));
        llvmTypeMap.put("<sdec>", LLVMHalfTypeInContext(llvmContext));
        llvmTypeMap.put("<dec>", LLVMFloatTypeInContext(llvmContext));
        llvmTypeMap.put("<ldec>", LLVMDoubleTypeInContext(llvmContext));
        llvmTypeMap.put("<lldec>", LLVMFP128TypeInContext(llvmContext));
        llvmTypeMap.put("<bool>", LLVMInt8TypeInContext(llvmContext));
        llvmTypeMap.put("<null>", LLVMVoidTypeInContext(llvmContext));
        LLVMTypeRef i8 = LLVMInt8TypeInContext(llvmContext);
        LLVMTypeRef i8Ptr = LLVMPointerType(i8, 0);
        llvmTypeMap.put("<string>", i8Ptr);
    }

    public String newAutoVar(){
        return "";
    }

    public String newAutoLabel(){
        return "l"+(labelIndex++);
    }

    public HanCodegen addToDispose(Pointer pointer){
        this.toDispose.add(pointer);
        return this;
    }

    public Type getGlobalType(String typeName){
        return global.getGlobalType(typeName);
    }

    public LLVMTypeRef getLLVMType(String typeExpr){
        return llvmTypeMap.get(typeExpr);
    }

    public void addLLVMType(String typeName, LLVMTypeRef typeRef){
        llvmTypeMap.put(typeName, typeRef);
    }

    public LLVMValueRef getLLVMValue(Value key) {
        return llvmValueMap.get(key);
    }

    public LLVMValueRef addLLVMValue(Value key, LLVMValueRef value) {
        return llvmValueMap.put(key, value);
    }

    @Override
    public VisitResult<Void> visitProgram(HanCompilerParser.ProgramContext ctx) {
        //配置模块
        LLVMSetTarget(llvmModule, targetTriple);
        //声明结构体
        for(Type each : global.typeDeclares.values()){
            new TypeDeclareGen(each).gen(this);
        }
        //实现结构体
        for(Type each : global.typeDeclares.values()){
            if(each.hasImpl()) new TypeImplGen(each).gen(this);
        }
        //声明函数
        for(Func each : global.funDeclares.values()){
            new FuncDeclareGen(each).gen(this);
        }
        //Main函数
        new MainFuncGen(ctx).gen(this);
//        //实现函数
//        for(HanCompilerParser.FunctionExprContext each : ctx.functionExpr()){
//            new FuncImplGen(global.getGlobalFunc(Func.funcName(each)), each).gen(this);
//        }

        //再次检查是否有误
        BytePointer pointer = new BytePointer();
        this.addToDispose(pointer);
        int result = LLVMVerifyModule(llvmModule, LLVMPrintMessageAction, pointer);
        if(result != 0){
            System.err.println("LLVM编译错误：\n    " + pointer.getString());
        }

        //输出模块IR
        LLVMDumpModule(llvmModule);
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult<String> visitInnerVarExpr(HanCompilerParser.InnerVarExprContext ctx) {
        return visitVarExpr(ctx.varExpr());
    }

    @Override
    public VisitResult<String> visitVarExpr(HanCompilerParser.VarExprContext ctx) {
        //String result = new NewVarGen(ctx).generator(this).gen();
        return new VisitResult<String>(Status.Ok);
    }

    @Override
    public PairResult<String, String> visitLExpr(HanCompilerParser.LExprContext ctx) {

        return new PairResult<String, String>(Status.Ok);
    }

    @Override
    public VisitResult<?> visitLBExpr(HanCompilerParser.LBExprContext ctx) {
        return super.visitLBExpr(ctx);
    }

    public VisitResult<String> visit(List<HanCompilerParser.ExprContext> exprs){
        StringBuilder tmp = new StringBuilder();
        for(HanCompilerParser.ExprContext expr : exprs){
            tmp.append(visit(expr).content).append("\n");
        }
        return new VisitResult<String>(Status.Ok).content(tmp.toString());
    }

    public Scope scope(ParseTree tree) {
        return ast2scope.get(tree);
    }

    @Override
    protected void finalize() {
        LLVMDisposeModule(llvmModule);
        LLVMContextDispose(llvmContext);
        LLVMDisposeBuilder(llvmBuilder);
        toDispose.forEach(Pointer::deallocate);
    }
}
