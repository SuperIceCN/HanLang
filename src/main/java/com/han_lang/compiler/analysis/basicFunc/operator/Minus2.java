package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//-
public class Minus2 {
    public static class OperatorMinus2ByteByte extends BasicFunc {
        public OperatorMinus2ByteByte(Global global) {
            super(global,
                    "__minus2_byte_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorMinus2SIntSInt extends BasicFunc {
        public OperatorMinus2SIntSInt(Global global) {
            super(global,
                    "__minus2_sint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorMinus2IntInt extends BasicFunc {
        public OperatorMinus2IntInt(Global global) {
            super(global,
                    "__minus2_int_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorMinus2LIntLInt extends BasicFunc {
        public OperatorMinus2LIntLInt(Global global) {
            super(global,
                    "__minus2_lint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorMinus2LLIntLLInt extends BasicFunc {
        public OperatorMinus2LLIntLLInt(Global global) {
            super(global,
                    "__minus2_llint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorMinus2SDecSDec extends BasicFunc {
        public OperatorMinus2SDecSDec(Global global) {
            super(global,
                    "__minus2_sdec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorMinus2DecDec extends BasicFunc {
        public OperatorMinus2DecDec(Global global) {
            super(global,
                    "__minus2_dec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorMinus2LDecLDec extends BasicFunc {
        public OperatorMinus2LDecLDec(Global global) {
            super(global,
                    "__minus2_ldec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorMinus2LLDecLLDec extends BasicFunc {
        public OperatorMinus2LLDecLLDec(Global global) {
            super(global,
                    "__minus2_lldec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
