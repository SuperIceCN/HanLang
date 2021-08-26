package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class DecCasters {
    public static class Dec2Bool extends BasicFunc{
        public Dec2Bool(Global global) {
            super(global,
                    "__cast_dec_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2Byte extends BasicFunc{
        public Dec2Byte(Global global) {
            super(global,
                    "__cast_dec_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2String extends BasicFunc{
        public Dec2String(Global global) {
            super(global,
                    "__cast_dec_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2SInt extends BasicFunc{
        public Dec2SInt(Global global) {
            super(global,
                    "__cast_dec_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2Int extends BasicFunc{
        public Dec2Int(Global global) {
            super(global,
                    "__cast_dec_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2LInt extends BasicFunc{
        public Dec2LInt(Global global) {
            super(global,
                    "__cast_dec_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2LLInt extends BasicFunc{
        public Dec2LLInt(Global global) {
            super(global,
                    "__cast_dec_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2SDec extends BasicFunc{
        public Dec2SDec(Global global) {
            super(global,
                    "__cast_dec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2LDec extends BasicFunc {
        public Dec2LDec(Global global) {
            super(global,
                    "__cast_dec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

    public static class Dec2LLDec extends BasicFunc{
        public Dec2LLDec(Global global) {
            super(global,
                    "__cast_dec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("dec")));
        }
    }

}
