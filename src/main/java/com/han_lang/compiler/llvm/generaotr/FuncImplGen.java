package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Func;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.util.LLVMUtil;

public class FuncImplGen extends Codegen<Void> {
    Func func;
    HanCompilerParser.FunctionExprContext funcCtx;

    public FuncImplGen(Func func, HanCompilerParser.FunctionExprContext ctx) {
        this.func = func;
        this.funcCtx = ctx;
    }

    @Override
    public void gen() {
//        StringBuilder tmp = new StringBuilder();
//        tmp.append("define ")
//                .append(new TypeUseGen(func.returnType).gen())
//                .append(" ")
//                .append(LLVMUtil.globalVar(func.funcName))
//                .append("(");
//        for(int i=0;i<func.argumentTypes.size();i++){
//            if(i != 0){
//                tmp.append(", ");
//            }
//            tmp.append(new TypeUseGen(func.argumentTypes.get(i)).gen());
//        }
//        //TODO 支持分支与循环结构
//        String content = codeGenerator.visit(Func.funcInnerExprs(funcCtx)).content;
//        //检测是否返回，否则就返回默认值
//        String[] lines = content.split("\n");
//        boolean ended = false;
//        for(int i=lines.length-1;i>=0;i--){
//            if(!lines[i].trim().equals("")){
//                continue;
//            }
//            if(lines[i].startsWith("ret ") || lines[i].startsWith("br ")){
//                ended = true;
//                break;
//            }
//        }
//        if(!ended){
//            if(content.endsWith("\n")){
//                content = content.substring(0, content.length() - 1);
//            }
//            String tn = new TypeUseGen(func.returnType).asRefIfNotBasic().gen();
//            if(func.returnType.isBool() || func.returnType.isInteger()){
//                content += "ret " + tn + " 0\n";
//            }else if(func.returnType.isDecimal()){
//                content += "ret " + tn + " 0.0\n";
//            }else if(func.returnType.isString()){
//                String val = codeGenerator.newAutoVar();
//                content += (val + " = inttoptr i64 0 to i8*\nret i8* " + val + "\n");
//            }else if(func.returnType.isVoid()){
//                content += "ret void\n";
//            }else {
//                String val = codeGenerator.newAutoVar();
//                content += (val + " = inttoptr i64 0 to " + tn + "\nret " + tn + " " + val + "\n");
//            }
//        }
//        tmp.append(") ").append("{\n")
//                .append(codeGenerator.newAutoLabel()).append(":\n")
//                .append(content).append("}");
//        return tmp.toString();
    }
}
