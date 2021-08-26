package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//+
public class Add2 {
    public static class OperatorAdd2ByteByte extends BasicFunc {
        public OperatorAdd2ByteByte(Global global) {
            super(global,
                    "__add2_byte_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorAdd2StringString extends BasicFunc {
        public OperatorAdd2StringString(Global global) {
            super(global,
                    "__add2_string_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorAdd2SIntSInt extends BasicFunc {
        public OperatorAdd2SIntSInt(Global global) {
            super(global,
                    "__add2_sint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorAdd2IntInt extends BasicFunc {
        public OperatorAdd2IntInt(Global global) {
            super(global,
                    "__add2_int_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorAdd2LIntLInt extends BasicFunc {
        public OperatorAdd2LIntLInt(Global global) {
            super(global,
                    "__add2_lint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorAdd2LLIntLLInt extends BasicFunc {
        public OperatorAdd2LLIntLLInt(Global global) {
            super(global,
                    "__add2_llint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorAdd2SDecSDec extends BasicFunc {
        public OperatorAdd2SDecSDec(Global global) {
            super(global,
                    "__add2_sdec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorAdd2DecDec extends BasicFunc {
        public OperatorAdd2DecDec(Global global) {
            super(global,
                    "__add2_dec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorAdd2LDecLDec extends BasicFunc {
        public OperatorAdd2LDecLDec(Global global) {
            super(global,
                    "__add2_ldec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorAdd2LLDecLLDec extends BasicFunc {
        public OperatorAdd2LLDecLLDec(Global global) {
            super(global,
                    "__add2_lldec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
