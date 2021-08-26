package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//!
public class Not1 {
    public static class OperatorNot1Bool extends BasicFunc {
        public OperatorNot1Bool(Global global) {
            super(global, "__not1_bool", global.getGlobalType("bool")
                    , new TypeSet(global.getGlobalType("bool")));
        }
    }
}
