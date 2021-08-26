package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//-
public class Minus1 {
    public static class OperatorMinus1Bool extends BasicFunc {
        public OperatorMinus1Bool(Global global) {
            super(global,
                    "__minus1_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class OperatorMinus1Byte extends BasicFunc {
        public OperatorMinus1Byte(Global global) {
            super(global,
                    "__minus1_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class OperatorMinus1SInt extends BasicFunc {
        public OperatorMinus1SInt(Global global) {
            super(global,
                    "__minus1_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class OperatorMinus1Int extends BasicFunc {
        public OperatorMinus1Int(Global global) {
            super(global,
                    "__minus1_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class OperatorMinus1LInt extends BasicFunc {
        public OperatorMinus1LInt(Global global) {
            super(global,
                    "__minus1_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class OperatorMinus1LLInt extends BasicFunc {
        public OperatorMinus1LLInt(Global global) {
            super(global,
                    "__minus1_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class OperatorMinus1SDec extends BasicFunc {
        public OperatorMinus1SDec(Global global) {
            super(global,
                    "__minus1_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class OperatorMinus1Dec extends BasicFunc {
        public OperatorMinus1Dec(Global global) {
            super(global,
                    "__minus1_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class OperatorMinus1LDec extends BasicFunc {
        public OperatorMinus1LDec(Global global) {
            super(global,
                    "__minus1_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class OperatorMinus1LLDec extends BasicFunc {
        public OperatorMinus1LLDec(Global global) {
            super(global,
                    "__minus1_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

}
