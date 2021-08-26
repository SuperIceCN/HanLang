package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//&&
public class And2 {
    public static class OperatorAnd2BoolBool extends BasicFunc {
        public OperatorAnd2BoolBool(Global global) {
            super(global,
                    "__and2_bool_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool"), global.getGlobalType("bool")));
        }
    }
}
