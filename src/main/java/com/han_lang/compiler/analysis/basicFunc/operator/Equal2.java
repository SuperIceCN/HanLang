package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//==
public class Equal2 {
    public static class OperatorEqual2BoolBool extends BasicFunc {
        public OperatorEqual2BoolBool(Global global) {
            super(global,
                    "__equal2_bool_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool"), global.getGlobalType("bool")));
        }
    }

    public static class OperatorEqual2ByteByte extends BasicFunc {
        public OperatorEqual2ByteByte(Global global) {
            super(global,
                    "__equal2_byte_byte",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorEqual2StringString extends BasicFunc {
        public OperatorEqual2StringString(Global global) {
            super(global,
                    "__equal2_string_string",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorEqual2SIntSInt extends BasicFunc {
        public OperatorEqual2SIntSInt(Global global) {
            super(global,
                    "__equal2_sint_sint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorEqual2IntInt extends BasicFunc {
        public OperatorEqual2IntInt(Global global) {
            super(global,
                    "__equal2_int_int",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorEqual2LIntLInt extends BasicFunc {
        public OperatorEqual2LIntLInt(Global global) {
            super(global,
                    "__equal2_lint_lint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorEqual2LLIntLLInt extends BasicFunc {
        public OperatorEqual2LLIntLLInt(Global global) {
            super(global,
                    "__equal2_llint_llint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorEqual2SDecSDec extends BasicFunc {
        public OperatorEqual2SDecSDec(Global global) {
            super(global,
                    "__equal2_sdec_sdec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorEqual2DecDec extends BasicFunc {
        public OperatorEqual2DecDec(Global global) {
            super(global,
                    "__equal2_dec_dec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorEqual2LDecLDec extends BasicFunc {
        public OperatorEqual2LDecLDec(Global global) {
            super(global,
                    "__equal2_ldec_ldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorEqual2LLDecLLDec extends BasicFunc {
        public OperatorEqual2LLDecLLDec(Global global) {
            super(global,
                    "__equal2_lldec_lldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
