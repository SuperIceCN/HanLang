package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//+
public class Add1 {
    public static class OperatorAdd1Bool extends BasicFunc {
        public OperatorAdd1Bool(Global global) {
            super(global,
                    "__add1_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class OperatorAdd1Byte extends BasicFunc {
        public OperatorAdd1Byte(Global global) {
            super(global,
                    "__add1_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class OperatorAdd1SInt extends BasicFunc {
        public OperatorAdd1SInt(Global global) {
            super(global,
                    "__add1_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class OperatorAdd1Int extends BasicFunc {
        public OperatorAdd1Int(Global global) {
            super(global,
                    "__add1_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class OperatorAdd1LInt extends BasicFunc {
        public OperatorAdd1LInt(Global global) {
            super(global,
                    "__add1_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class OperatorAdd1LLInt extends BasicFunc {
        public OperatorAdd1LLInt(Global global) {
            super(global,
                    "__add1_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class OperatorAdd1SDec extends BasicFunc {
        public OperatorAdd1SDec(Global global) {
            super(global,
                    "__add1_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class OperatorAdd1Dec extends BasicFunc {
        public OperatorAdd1Dec(Global global) {
            super(global,
                    "__add1_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class OperatorAdd1LDec extends BasicFunc {
        public OperatorAdd1LDec(Global global) {
            super(global,
                    "__add1_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class OperatorAdd1LLDec extends BasicFunc {
        public OperatorAdd1LLDec(Global global) {
            super(global,
                    "__add1_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

}
