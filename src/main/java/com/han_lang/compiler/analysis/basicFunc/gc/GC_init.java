package com.han_lang.compiler.analysis.basicFunc.gc;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class GC_init extends BasicFunc {
    public GC_init(Global global) {
        super(global, "__GC_init", Type.getAbstract(global, "null", "<null>"),
                new TypeSet());
    }
}
