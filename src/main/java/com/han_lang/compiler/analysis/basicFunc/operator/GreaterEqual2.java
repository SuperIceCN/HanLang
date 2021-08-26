package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//>=
public class GreaterEqual2 {
    public static class OperatorGreaterEqual2ByteByte extends BasicFunc {
        public OperatorGreaterEqual2ByteByte(Global global) {
            super(global,
                    "__greaterequal2_byte_byte",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorGreaterEqual2StringString extends BasicFunc {
        public OperatorGreaterEqual2StringString(Global global) {
            super(global,
                    "__greaterequal2_string_string",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorGreaterEqual2SIntSInt extends BasicFunc {
        public OperatorGreaterEqual2SIntSInt(Global global) {
            super(global,
                    "__greaterequal2_sint_sint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorGreaterEqual2IntInt extends BasicFunc {
        public OperatorGreaterEqual2IntInt(Global global) {
            super(global,
                    "__greaterequal2_int_int",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorGreaterEqual2LIntLInt extends BasicFunc {
        public OperatorGreaterEqual2LIntLInt(Global global) {
            super(global,
                    "__greaterequal2_lint_lint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorGreaterEqual2LLIntLLInt extends BasicFunc {
        public OperatorGreaterEqual2LLIntLLInt(Global global) {
            super(global,
                    "__greaterequal2_llint_llint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorGreaterEqual2SDecSDec extends BasicFunc {
        public OperatorGreaterEqual2SDecSDec(Global global) {
            super(global,
                    "__greaterequal2_sdec_sdec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorGreaterEqual2DecDec extends BasicFunc {
        public OperatorGreaterEqual2DecDec(Global global) {
            super(global,
                    "__greaterequal2_dec_dec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorGreaterEqual2LDecLDec extends BasicFunc {
        public OperatorGreaterEqual2LDecLDec(Global global) {
            super(global,
                    "__greaterequal2_ldec_ldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorGreaterEqual2LLDecLLDec extends BasicFunc {
        public OperatorGreaterEqual2LLDecLLDec(Global global) {
            super(global,
                    "__greaterequal2_lldec_lldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
