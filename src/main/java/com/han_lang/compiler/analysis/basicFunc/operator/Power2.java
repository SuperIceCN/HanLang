package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//**
public class Power2 {
    public static class OperatorPower2BoolBool extends BasicFunc {
        public OperatorPower2BoolBool(Global global) {
            super(global,
                    "__power2_bool_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool"), global.getGlobalType("bool")));
        }
    }

    public static class OperatorPower2ByteByte extends BasicFunc {
        public OperatorPower2ByteByte(Global global) {
            super(global,
                    "__power2_byte_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorPower2SIntSInt extends BasicFunc {
        public OperatorPower2SIntSInt(Global global) {
            super(global,
                    "__power2_sint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorPower2IntInt extends BasicFunc {
        public OperatorPower2IntInt(Global global) {
            super(global,
                    "__power2_int_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorPower2LIntLInt extends BasicFunc {
        public OperatorPower2LIntLInt(Global global) {
            super(global,
                    "__power2_lint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorPower2LLIntLLInt extends BasicFunc {
        public OperatorPower2LLIntLLInt(Global global) {
            super(global,
                    "__power2_llint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorPower2SDecSDec extends BasicFunc {
        public OperatorPower2SDecSDec(Global global) {
            super(global,
                    "__power2_sdec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorPower2DecDec extends BasicFunc {
        public OperatorPower2DecDec(Global global) {
            super(global,
                    "__power2_dec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorPower2LDecLDec extends BasicFunc {
        public OperatorPower2LDecLDec(Global global) {
            super(global,
                    "__power2_ldec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorPower2LLDecLLDec extends BasicFunc {
        public OperatorPower2LLDecLLDec(Global global) {
            super(global,
                    "__power2_lldec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
