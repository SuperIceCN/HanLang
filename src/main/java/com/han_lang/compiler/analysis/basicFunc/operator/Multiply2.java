package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//*
public class Multiply2 {
    public static class OperatorMultiply2ByteByte extends BasicFunc {
        public OperatorMultiply2ByteByte(Global global) {
            super(global,
                    "__multiply2_byte_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorMultiply2StringString extends BasicFunc {
        public OperatorMultiply2StringString(Global global) {
            super(global,
                    "__multiply2_string_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorMultiply2StringByte extends BasicFunc {
        public OperatorMultiply2StringByte(Global global) {
            super(global,
                    "__multiply2_string_byte",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorMultiply2StringSInt extends BasicFunc {
        public OperatorMultiply2StringSInt(Global global) {
            super(global,
                    "__multiply2_string_sint",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorMultiply2StringInt extends BasicFunc {
        public OperatorMultiply2StringInt(Global global) {
            super(global,
                    "__multiply2_string_int",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("int")));
        }
    }

    public static class OperatorMultiply2StringLInt extends BasicFunc {
        public OperatorMultiply2StringLInt(Global global) {
            super(global,
                    "__multiply2_string_lint",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorMultiply2StringLLInt extends BasicFunc {
        public OperatorMultiply2StringLLInt(Global global) {
            super(global,
                    "__multiply2_string_llint",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorMultiply2SIntSInt extends BasicFunc {
        public OperatorMultiply2SIntSInt(Global global) {
            super(global,
                    "__multiply2_sint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorMultiply2IntInt extends BasicFunc {
        public OperatorMultiply2IntInt(Global global) {
            super(global,
                    "__multiply2_int_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorMultiply2LIntLInt extends BasicFunc {
        public OperatorMultiply2LIntLInt(Global global) {
            super(global,
                    "__multiply2_lint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorMultiply2LLIntLLInt extends BasicFunc {
        public OperatorMultiply2LLIntLLInt(Global global) {
            super(global,
                    "__multiply2_llint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorMultiply2SDecSDec extends BasicFunc {
        public OperatorMultiply2SDecSDec(Global global) {
            super(global,
                    "__multiply2_sdec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorMultiply2DecDec extends BasicFunc {
        public OperatorMultiply2DecDec(Global global) {
            super(global,
                    "__multiply2_dec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorMultiply2LDecLDec extends BasicFunc {
        public OperatorMultiply2LDecLDec(Global global) {
            super(global,
                    "__multiply2_ldec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorMultiply2LLDecLLDec extends BasicFunc {
        public OperatorMultiply2LLDecLLDec(Global global) {
            super(global,
                    "__multiply2_lldec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
