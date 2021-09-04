package com.han_lang.test;

import org.antlr.v4.runtime.CharStreams;
import org.junit.jupiter.api.Test;

public class CodegenTest {
    @Test
    public void codegenTest1(){
        com.han_lang.compiler.Compiler.compile(CharStreams.fromString(
                "type A<a<int>, b<sint>>;", "test1.hl"
        ));
    }
}
