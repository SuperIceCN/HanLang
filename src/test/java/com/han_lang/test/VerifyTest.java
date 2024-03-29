package com.han_lang.test;

import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Test;

public class VerifyTest {
    @Test
    public void simpleMath(){
        com.han_lang.compiler.Compiler.compile(
                CharStreams.fromString("type B<a<int>, b<sss>>;")
        );
    }

    @Test
    public void simpleType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<int>;")
        );
    }

    @Test
    public void arrayType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<int * 6>;")
        );
    }

    @Test
    public void redefineType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<int>;\ntype B<int>;")
        );
    }

    @Test
    public void simpleStructType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<a<int>, b<dec>, c<llint>>;")
        );
    }

    @Test
    public void funcType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<<int>()>;")
        );
    }

    @Test
    public void selfRefType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<_<dec>, a<A>, s<dec>>;type B<A>;")
        );
    }

    @Test
    public void simpleVar(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var __add2_int_int<int>;")
        );
    }

    @Test
    public void typeVar(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<int>;var a<A>;")
        );
    }

    @Test
    public void arrayVar(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<int * 114514>;")
        );
    }

    @Test
    public void structVar(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var A<a<int>, b<dec>, c<string>>;")
        );
    }

    @Test
    public void redefineVar(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var A<int>;\nvar A<dec>;")
        );
    }

    @Test
    public void simpleSet(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<int>;\n" +
                        "var a<A>; var b<A>;\n" +
                        "a = -2;\n" +
                        "b = -1.2;")
        );
    }

    @Test
    public void typeSet(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type A<dec>;\n" +
                        "type B<dec>;\n" +
                        "var a<A> = 1.1;\n" +
                        "var b<B> = 2.2;")
        );
    }

    @Test
    public void simpleConst(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("const a<int> = 2.4;")
        );
    }

    @Test
    public void redefineConst(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("const a<int> = 1;\nconst a<dec> = 2.2;")
        );
    }

    @Test
    public void testIfelse(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("if(true){var a<int>;}")
        );
    }

    @Test
    public void testIfelseScope(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<bool> = true;\nif(a){var b<int>;a=1 as<bool>type;}")
        );
    }

    @Test
    public void testIfelseReturn(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("如果(23 as <bool> type){var a<int>;return;}")
        );
    }

    @Test
    public void testWhile(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("while(false){var bbb<int>;}")
        );
    }

    @Test
    public void testGetStruct(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("type X<_<int>, $<X>>;var a<X>;var b<int> = a:$:$:_;")
        );
    }

    @Test
    public void testGetArray(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<int * 8>; var b<int> = a:[9.1];")
        );
    }

    @Test
    public void testGetArray2(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<b<int>, c<dec>>;")
        );
    }

    @Test
    public void testGetArray3(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<int>; a = (5.5 + 6 as <dec> type) as <int> type;")
        );
    }

    @Test
    public void testTemple(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<int * 6>; a = {|2, 3, 11, 13|};")
        );
    }

    @Test
    public void testTemple2(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("var a<b<int*6>, c<dec>>; a = {{|2, 3|}, 3 as <dec> type};")
        );
    }

    @Test
    public void testSimpleFunc1(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString(TestUtil.getCode("入口函数.hl"))
        );
    }

    @Test
    public void testSimpleFunc2(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString(TestUtil.getCode("求和.hl"))
        );
    }

    @Test
    public void testCaster(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString(TestUtil.getCode("自定义类型转换.hl"))
        );
    }

    @Test
    public void testOperator(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString(TestUtil.getCode("自定义操作符.hl"))
        );
    }

    @Test
    public void testFuncType(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString(TestUtil.getCode("函数类型变量.hl"))
        );
    }

    @Test
    public void testWhile2(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString(TestUtil.getCode("循环.hl"))
        );
    }

    @Test
    public void testConstSet(){
        com.han_lang.compiler.Compiler.verify(
                CharStreams.fromString("const a<int> = 2; a=3;")
        );
    }
}
