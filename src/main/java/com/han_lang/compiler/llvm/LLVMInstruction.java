package com.han_lang.compiler.llvm;

import com.han_lang.compiler.analysis.Type;

public interface LLVMInstruction {
    String ir();
    Type type();
}
