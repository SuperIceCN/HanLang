package com.han_lang.compiler;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.ast.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {
    public static void main(String... args){
        System.out.println("helloworld");
        verify(CharStreams.fromString("var a<int * 114514>;"));
    }
    public static void compile(CharStream charStream){
        Global global = new Global();
        HanCompilerLexer lexer = new HanCompilerLexer(charStream);
        HanCompilerParser parser = new HanCompilerParser(new CommonTokenStream(lexer));
        ParseTree ast = parser.program();
        HanVerifier preVisitor = new HanVerifier(global);
        preVisitor.visit(ast);
        HanCodegen codegen = new HanCodegen(global, charStream.getSourceName(), preVisitor.ast2scope);
        codegen.visit(ast);
    }
    public static void verify(CharStream charStream){
        Global global = new Global();
        HanCompilerLexer lexer = new HanCompilerLexer(charStream);
        HanCompilerParser parser = new HanCompilerParser(new CommonTokenStream(lexer));
        ParseTree ast = parser.program();
        HanVerifier preVisitor = new HanVerifier(global);
        preVisitor.visit(ast);
    }
}
