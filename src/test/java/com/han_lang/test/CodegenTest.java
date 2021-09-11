package com.han_lang.test;

import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Test;

public class CodegenTest {
    @Test
    public void codegenTest1(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "type A<a<int>, b<sint>>;type C<int>;", "test1.hl"
        ));
    }

    @Test
    public void codegenTest2(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "function a<int>(c<dec>){var b<int>;}", "test2.hl"
        ));
    }

    @Test
    public void codegenTest3(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "type A<a<int>, b<sint>>;type B<_<A>>;\n" +
                        "function a<B>(c<A>){var b<B>;}", "test3.hl"
        ));
    }

    @Test
    public void codegenTest4(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "type A<int * 5>;type B<lldec>;\n" +
                        "function a<B>(c<A>){var b<B>;}", "test4.hl"
        ));
    }

    @Test
    public void codegenTest5(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "type A<()>;type B<one<int>, two<dec>>;\n" +
                        "var b<B>;\n" +
                        "var d<int>;\n" +
                        "function a<B>(c<A>){}\n" +
                        "var c<B>;\n" +
                        "b = c;\n" +
                        "var e<int> = 2233;" +
                        "d = e;", "test5.hl"
        ));
    }

    @Test
    public void codegenTest6(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "type A<()>;type B<int>;\n" +
                        "var myVar<B>; myVar = 20;", "test6.hl"
        ));
    }
}
