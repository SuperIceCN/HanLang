package com.han_lang.compiler.ast;

import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Scope;
import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.llvm.LLVMUtil;
import com.han_lang.compiler.llvm.generaotr.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.List;

public class HanCodegen extends HanCompilerBaseVisitor<VisitResult<?>>{
    Global global;
    String programName;
    public ParseTreeProperty<Scope> ast2scope = new ParseTreeProperty<>();
    public StringBuilder genCode = new StringBuilder();
    public int varIndex = 0;
    public int labelIndex = 0;

    public HanCodegen(Global global, String programName, ParseTreeProperty<Scope> ast2scope){
        this.global = global;
        this.programName = programName;
        this.ast2scope = ast2scope;
    }

    public String newAutoVar(){
        return "%"+(varIndex++);
    }

    public String newAutoLabel(){
        return "l"+(labelIndex++);
    }

    @Override
    public VisitResult<Void> visitProgram(HanCompilerParser.ProgramContext ctx) {
        //生成模块名
        this.genCode.append("; ModuleID = '").append(programName).append("'").append("\n");
        //声明并实现结构体
        for(Type each : global.typeDeclares.values()){
            if(each.hasImpl())
                new TypeImplGen(each).gen(this);
            else
                new TypeDeclareGen(each).gen(this);
        }
        //声明函数
        for(Func each : global.funDeclares.values()){
            if(!each.hasImpl())
                new FuncDeclareGen(each).gen(this);
        }
        //实现函数
        for(HanCompilerParser.FunctionExprContext each : ctx.functionExpr()){
            new FuncImplGen(global.getGlobalFunc(Func.funcName(each)), each).gen(this);
        }
        System.out.println(genCode.toString());
        return VisitResult.defaultOk();
    }

    @Override
    public VisitResult<String> visitInnerVarExpr(HanCompilerParser.InnerVarExprContext ctx) {
        return visitVarExpr(ctx.varExpr());
    }

    @Override
    public VisitResult<String> visitVarExpr(HanCompilerParser.VarExprContext ctx) {
        String result = new NewVarGen(ctx).generator(this).gen();
        return new VisitResult<String>(Status.Ok).content(result);
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
}
