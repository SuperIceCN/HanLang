package com.han_lang.compiler.symbol.symbol;

import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.symbol.BaseSymbol;
import com.han_lang.compiler.symbol.RuntimeType;
import com.han_lang.compiler.symbol.SymbolFormat;
import com.han_lang.compiler.symbol.SymbolType;
import com.han_lang.compiler.symbol.exception.ScopeLinkFailException;
import com.han_lang.compiler.symbol.exception.SymbolConflictException;
import com.han_lang.compiler.symbol.scope.FunctionScope;
import com.han_lang.compiler.symbol.scope.GlobalScope;

public class FunctionSymbol extends BaseSymbol {
    public FunctionSymbol(HanCompilerParser.FunctionExprContext declareCtx) {
        this.type = SymbolType.Function;
        this.format = SymbolFormat.Function;
        this.declare = declareCtx;
        if(declareCtx instanceof HanCompilerParser.FunContext){
            this.symbolName = ((HanCompilerParser.FunContext) declareCtx).ID().getText();
            this.runtimeTypeId = this.symbolName + RuntimeType.typeId() + "()";
        }else if(declareCtx instanceof HanCompilerParser.FunAContext){
            this.symbolName = ((HanCompilerParser.FunAContext) declareCtx).ID().getText();
            this.runtimeTypeId = this.symbolName + RuntimeType.typeId() + "(";
            StringBuilder args = new StringBuilder();
            for(HanCompilerParser.ArgPartExprContext each : ((HanCompilerParser.FunAContext) declareCtx).argPartExpr()){
                args.append(RuntimeType.typeId(each.typeExpr())).append(',');
            }
            args.append(RuntimeType.typeId(((HanCompilerParser.FunAContext) declareCtx).argEndExpr().typeExpr()));
            this.runtimeTypeId += (args.toString() + ")");
        }else if(declareCtx instanceof HanCompilerParser.FunRContext){
            this.symbolName = ((HanCompilerParser.FunRContext) declareCtx).ID().get(0).getText();
            this.runtimeTypeId = this.symbolName + RuntimeType.typeId(((HanCompilerParser.FunRContext) declareCtx).type_basic()) + "()";
        }else if(declareCtx instanceof HanCompilerParser.FunRAContext){
            this.symbolName = ((HanCompilerParser.FunRAContext) declareCtx).ID().get(0).getText();
            this.runtimeTypeId = this.symbolName + RuntimeType.typeId(((HanCompilerParser.FunRAContext) declareCtx).type_basic()) + "(";
            StringBuilder args = new StringBuilder();
            for(HanCompilerParser.ArgPartExprContext each : ((HanCompilerParser.FunRAContext) declareCtx).argPartExpr()){
                args.append(RuntimeType.typeId(each.typeExpr())).append(',');
            }
            args.append(RuntimeType.typeId(((HanCompilerParser.FunRAContext) declareCtx).argEndExpr().typeExpr()));
            this.runtimeTypeId += (args.toString() + ")");
        }
    }

    public static FunctionSymbol create(GlobalScope globalScope, HanCompilerParser.FunctionExprContext declareCtx) throws ScopeLinkFailException, SymbolConflictException {
        FunctionSymbol t = new FunctionSymbol(declareCtx);
        t.innerScope = new FunctionScope(globalScope, t);
        t.belongsTo = globalScope;
        if(declareCtx instanceof HanCompilerParser.FunContext){
            t.runtimeTypeId = t.symbolName + RuntimeType.typeId() + "()";
        }else if(declareCtx instanceof HanCompilerParser.FunAContext){
            t.runtimeTypeId = t.symbolName + RuntimeType.typeId() + "(";
            StringBuilder args = new StringBuilder();
            for(HanCompilerParser.ArgPartExprContext each : ((HanCompilerParser.FunAContext) declareCtx).argPartExpr()){
                args.append(RuntimeType.typeId(each.typeExpr())).append(',');
            }
            args.append(RuntimeType.typeId(((HanCompilerParser.FunAContext) declareCtx).argEndExpr().typeExpr()));
            t.runtimeTypeId += (args.toString() + ")");
        }else if(declareCtx instanceof HanCompilerParser.FunRContext){
            t.runtimeTypeId = t.symbolName + RuntimeType.typeId(((HanCompilerParser.FunRContext) declareCtx).type_basic()) + "()";
        }else if(declareCtx instanceof HanCompilerParser.FunRAContext){
            t.runtimeTypeId = t.symbolName + RuntimeType.typeId(((HanCompilerParser.FunRAContext) declareCtx).type_basic()) + "(";
            StringBuilder args = new StringBuilder();
            for(HanCompilerParser.ArgPartExprContext each : ((HanCompilerParser.FunRAContext) declareCtx).argPartExpr()){
                args.append(RuntimeType.typeId(each.typeExpr())).append(',');
            }
            args.append(RuntimeType.typeId(((HanCompilerParser.FunRAContext) declareCtx).argEndExpr().typeExpr()));
            t.runtimeTypeId += (args.toString() + ")");
        }
        boolean res = globalScope.addSymbol(t);
        if(!res){
            throw new SymbolConflictException(t.symbolName);
        }
        globalScope.addChild(t.innerScope);
        return t;
    }

    @Override
    public boolean hasInner(String name) {
        return this.innerScope.isSymbolAvailable(name);
    }

    @Override
    public BaseSymbol getInner(String name) {
        return this.innerScope.getSymbol(name);
    }

    @Override
    public void addInner(BaseSymbol symbol) {
        this.innerScope.addSymbol(symbol);
    }
}
