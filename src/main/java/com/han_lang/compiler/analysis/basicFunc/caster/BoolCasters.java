package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class BoolCasters {
    public static class Bool2Byte extends BasicFunc{
        public Bool2Byte(Global global) {
            super(global,
                    "__cast_bool_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2String extends BasicFunc{
        public Bool2String(Global global) {
            super(global,
                    "__cast_bool_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2SInt extends BasicFunc{
        public Bool2SInt(Global global) {
            super(global,
                    "__cast_bool_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2Int extends BasicFunc{
        public Bool2Int(Global global) {
            super(global,
                    "__cast_bool_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2LInt extends BasicFunc{
        public Bool2LInt(Global global) {
            super(global,
                    "__cast_bool_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2LLInt extends BasicFunc{
        public Bool2LLInt(Global global) {
            super(global,
                    "__cast_bool_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2SDec extends BasicFunc{
        public Bool2SDec(Global global) {
            super(global,
                    "__cast_bool_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2Dec extends BasicFunc{
        public Bool2Dec(Global global) {
            super(global,
                    "__cast_bool_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2LDec extends BasicFunc{
        public Bool2LDec(Global global) {
            super(global,
                    "__cast_bool_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

    public static class Bool2LLDec extends BasicFunc{
        public Bool2LLDec(Global global) {
            super(global,
                    "__cast_bool_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("bool")));
        }
    }

}
