package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//!=
public class NotEqual2 {
    public static class OperatorNotEqual2BoolBool extends BasicFunc {
        public OperatorNotEqual2BoolBool(Global global) {
            super(global,
                    "__notequal2_bool_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool"), global.getGlobalType("bool")));
        }
    }

    public static class OperatorNotEqual2ByteByte extends BasicFunc {
        public OperatorNotEqual2ByteByte(Global global) {
            super(global,
                    "__notequal2_byte_byte",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorNotEqual2StringString extends BasicFunc {
        public OperatorNotEqual2StringString(Global global) {
            super(global,
                    "__notequal2_string_string",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorNotEqual2SIntSInt extends BasicFunc {
        public OperatorNotEqual2SIntSInt(Global global) {
            super(global,
                    "__notequal2_sint_sint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorNotEqual2IntInt extends BasicFunc {
        public OperatorNotEqual2IntInt(Global global) {
            super(global,
                    "__notequal2_int_int",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorNotEqual2LIntLInt extends BasicFunc {
        public OperatorNotEqual2LIntLInt(Global global) {
            super(global,
                    "__notequal2_lint_lint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorNotEqual2LLIntLLInt extends BasicFunc {
        public OperatorNotEqual2LLIntLLInt(Global global) {
            super(global,
                    "__notequal2_llint_llint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorNotEqual2SDecSDec extends BasicFunc {
        public OperatorNotEqual2SDecSDec(Global global) {
            super(global,
                    "__notequal2_sdec_sdec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorNotEqual2DecDec extends BasicFunc {
        public OperatorNotEqual2DecDec(Global global) {
            super(global,
                    "__notequal2_dec_dec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorNotEqual2LDecLDec extends BasicFunc {
        public OperatorNotEqual2LDecLDec(Global global) {
            super(global,
                    "__notequal2_ldec_ldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorNotEqual2LLDecLLDec extends BasicFunc {
        public OperatorNotEqual2LLDecLLDec(Global global) {
            super(global,
                    "__notequal2_lldec_lldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
