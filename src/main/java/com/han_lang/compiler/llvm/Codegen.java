package com.han_lang.compiler.llvm;

import com.han_lang.compiler.ast.HanCodegen;

public abstract class Codegen {
    protected HanCodegen codeGenerator;

    public HanCodegen getCodeGenerator() {
        return codeGenerator;
    }

    public void gen(HanCodegen codeGenerator){
        this.codeGenerator = codeGenerator;
        gen(codeGenerator.genCode);
    }

    public void gen(StringBuilder output){
        output.append(gen());
    }

    public abstract String gen();
}
