package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//>
public class Greater2 {
    public static class OperatorGreater2ByteByte extends BasicFunc {
        public OperatorGreater2ByteByte(Global global) {
            super(global,
                    "__greater2_byte_byte",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorGreater2StringString extends BasicFunc {
        public OperatorGreater2StringString(Global global) {
            super(global,
                    "__greater2_string_string",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorGreater2SIntSInt extends BasicFunc {
        public OperatorGreater2SIntSInt(Global global) {
            super(global,
                    "__greater2_sint_sint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorGreater2IntInt extends BasicFunc {
        public OperatorGreater2IntInt(Global global) {
            super(global,
                    "__greater2_int_int",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorGreater2LIntLInt extends BasicFunc {
        public OperatorGreater2LIntLInt(Global global) {
            super(global,
                    "__greater2_lint_lint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorGreater2LLIntLLInt extends BasicFunc {
        public OperatorGreater2LLIntLLInt(Global global) {
            super(global,
                    "__greater2_llint_llint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorGreater2SDecSDec extends BasicFunc {
        public OperatorGreater2SDecSDec(Global global) {
            super(global,
                    "__greater2_sdec_sdec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorGreater2DecDec extends BasicFunc {
        public OperatorGreater2DecDec(Global global) {
            super(global,
                    "__greater2_dec_dec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorGreater2LDecLDec extends BasicFunc {
        public OperatorGreater2LDecLDec(Global global) {
            super(global,
                    "__greater2_ldec_ldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorGreater2LLDecLLDec extends BasicFunc {
        public OperatorGreater2LLDecLLDec(Global global) {
            super(global,
                    "__greater2_lldec_lldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
