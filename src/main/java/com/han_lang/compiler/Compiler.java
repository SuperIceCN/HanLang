package com.han_lang.compiler;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.ast.HanCompilerLexer;
import com.han_lang.compiler.ast.HanCompilerParser;
import com.han_lang.compiler.ast.HanCompilerPreVisitor;
import com.han_lang.compiler.ast.HanVerifier;
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
        HanCompilerLexer lexer = new HanCompilerLexer(charStream);
        HanCompilerParser parser = new HanCompilerParser(new CommonTokenStream(lexer));
        ParseTree ast2 = parser.program();
        //程序检验
        HanCompilerPreVisitor preVisitor = new HanCompilerPreVisitor();
        preVisitor.visit(ast2);
    }
    public static void verify(CharStream charStream){
        Global global = new Global();
        HanCompilerLexer lexer = new HanCompilerLexer(charStream);
        HanCompilerParser parser = new HanCompilerParser(new CommonTokenStream(lexer));
        ParseTree ast2 = parser.program();
        HanVerifier preVisitor = new HanVerifier(global);
        preVisitor.visit(ast2);
    }
}
