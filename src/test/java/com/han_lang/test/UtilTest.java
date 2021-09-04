package com.han_lang.test;

import com.han_lang.compiler.llvm.LLVMUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UtilTest {
    @Test
    public void llvmFormatTest(){
        String s = "你\"hao\n";
        String o = LLVMUtil.llvmFormat(s);
        System.out.println(o);
        assertEquals("\\E4\\BD\\A0\\22hao\\0A", o);
    }

    @Test
    public void llvmStringLengthTest(){
        String s = "你\"hao\n";
        int len = LLVMUtil.llvmStringLength(s);
        System.out.println(len);
        assertEquals(9, len);
    }
}
