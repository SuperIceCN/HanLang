package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//||
public class Or2 {
    public static class OperatorOr2BoolBool extends BasicFunc {
        public OperatorOr2BoolBool(Global global) {
            super(global,
                    "__or2_bool_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool"), global.getGlobalType("bool")));
        }
    }
}
