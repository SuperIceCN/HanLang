package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
///
public class Divide2 {
    public static class OperatorDivide2ByteByte extends BasicFunc {
        public OperatorDivide2ByteByte(Global global) {
            super(global,
                    "__divide2_byte_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorDivide2SIntSInt extends BasicFunc {
        public OperatorDivide2SIntSInt(Global global) {
            super(global,
                    "__divide2_sint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorDivide2IntInt extends BasicFunc {
        public OperatorDivide2IntInt(Global global) {
            super(global,
                    "__divide2_int_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorDivide2LIntLInt extends BasicFunc {
        public OperatorDivide2LIntLInt(Global global) {
            super(global,
                    "__divide2_lint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorDivide2LLIntLLInt extends BasicFunc {
        public OperatorDivide2LLIntLLInt(Global global) {
            super(global,
                    "__divide2_llint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }

    public static class OperatorDivide2SDecSDec extends BasicFunc {
        public OperatorDivide2SDecSDec(Global global) {
            super(global,
                    "__divide2_sdec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec"), global.getGlobalType("sdec")));
        }
    }

    public static class OperatorDivide2DecDec extends BasicFunc {
        public OperatorDivide2DecDec(Global global) {
            super(global,
                    "__divide2_dec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec"), global.getGlobalType("dec")));
        }
    }

    public static class OperatorDivide2LDecLDec extends BasicFunc {
        public OperatorDivide2LDecLDec(Global global) {
            super(global,
                    "__divide2_ldec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec"), global.getGlobalType("ldec")));
        }
    }

    public static class OperatorDivide2LLDecLLDec extends BasicFunc {
        public OperatorDivide2LLDecLLDec(Global global) {
            super(global,
                    "__divide2_lldec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec"), global.getGlobalType("lldec")));
        }
    }

}
