package com.han_lang.compiler.analysis.basicFunc.gc;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class GC_malloc extends BasicFunc {
    public GC_malloc(Global global) {
        super(global, "GC_malloc", global.getGlobalType("lint"),
                new TypeSet(global.getGlobalType("lint")));
    }
}
