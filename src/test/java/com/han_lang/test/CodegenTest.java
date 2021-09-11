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

    @Test
    public void codegenTest7(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "const a<int> = 23;\n" +
                        "const b<int> = a;\n" +
                        "const c<dec> = 2554.33;\n" +
                        "const d<bool> = true;\n", "test7.hl"
        ));
    }

    @Test
    public void codegenTestCaster1(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "const a<int> = 23;\n" +
                        "var v<lint> = a as <lint> type;\n", "testCaster1.hl"
        ));
    }

    @Test
    public void codegenTestCaster2(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "const a<int> = 23;\n" +
                        "var b<lint> = 23.322 as <lldec> type as <int> type as <lint> type;\n", "testCaster2.hl"
        ));
    }

    @Test
    public void codegenTestReturnInMain() {
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "const a<int> = 23;\n" +
                        "return a;\n", "testReturnInMain.hl"
        ));
    }

    @Test
    public void codegenTestOperator1() {
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "const a<int> = 23 + 32;\n" +
                        "return a;\n", "testOperator1.hl"
        ));
    }

    @Test
    public void codegenTestOperator2() {
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "const a<int> = 22;" +
                        "const b<int> = 33 + a;" +
                        "var c<ldec> = (b as <dec> type * 22.33) as <ldec> type;\n" +
                        "return 0;\n", "testOperator2.hl"
        ));
    }

    @Test
    public void codegenTestOperator3() {
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "var a<bool> = !(true || false) && true;", "testOperator3.hl"
        ));
    }

    @Test
    public void codegenTestFuncPtr1() {
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "var a<()> = @nothing;\n" +
                        "function nothing{/*......*/}", "testFuncPtr1.hl"
        ));
    }

    @Test
    public void codegenTestFuncPtr2() {
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "var a<<int>(<byte>, <bool>, <llint>)> = @aIntFunc;\n" +
                        "function aIntFunc<int>(arg1<byte>, arg2<bool>, arg3<llint>){/*......*/}", "testFuncPtr2.hl"
        ));
    }

}
