package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//<=
public class LowerEqual2 {
    public static class OperatorLowerEqual2ByteByte extends BasicFunc {
        public OperatorLowerEqual2ByteByte(Global global) {
            super(global,
                    "__lowerequal2_byte_byte",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorLowerEqual2StringString extends BasicFunc {
        public OperatorLowerEqual2StringString(Global global) {
            super(global,
                    "__lowerequal2_string_string",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("string"), global.getGlobalType("string")));
        }
    }

    public static class OperatorLowerEqual2SIntSInt extends BasicFunc {
        public OperatorLowerEqual2SIntSInt(Global global) {
            super(global,
                    "__lowerequal2_sint_sint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorLowerEqual2IntInt extends BasicFunc {
        public OperatorLowerEqual2IntInt(Global global) {
            super(global,
                    "__lowerequal2_int_int",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorLowerEqual2LIntLInt extends BasicFunc {
        public OperatorLowerEqual2LIntLInt(Global global) {
            super(global,
                    "__lowerequal2_lint_lint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorLowerEqual2LLIntLLInt extends BasicFunc {
        public OperatorLowerEqual2LLIntLLInt(Global global) {
            super(global,
                    "__lowerequal2_llint_llint",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorLowerEqual2SDecSDec extends BasicFunc {
        public OperatorLowerEqual2SDecSDec(Global global) {
            super(global,
                    "__lowerequal2_sdec_sdec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorLowerEqual2DecDec extends BasicFunc {
        public OperatorLowerEqual2DecDec(Global global) {
            super(global,
                    "__lowerequal2_dec_dec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorLowerEqual2LDecLDec extends BasicFunc {
        public OperatorLowerEqual2LDecLDec(Global global) {
            super(global,
                    "__lowerequal2_ldec_ldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorLowerEqual2LLDecLLDec extends BasicFunc {
        public OperatorLowerEqual2LLDecLLDec(Global global) {
            super(global,
                    "__lowerequal2_lldec_lldec",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
