package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class StringCasters {
    public static class String2Bool extends BasicFunc{
        public String2Bool(Global global) {
            super(global,
                    "__cast_string_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2Byte extends BasicFunc{
        public String2Byte(Global global) {
            super(global,
                    "__cast_string_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2SInt extends BasicFunc{
        public String2SInt(Global global) {
            super(global,
                    "__cast_string_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2Int extends BasicFunc{
        public String2Int(Global global) {
            super(global,
                    "__cast_string_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2LInt extends BasicFunc{
        public String2LInt(Global global) {
            super(global,
                    "__cast_string_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2LLInt extends BasicFunc{
        public String2LLInt(Global global) {
            super(global,
                    "__cast_string_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2SDec extends BasicFunc{
        public String2SDec(Global global) {
            super(global,
                    "__cast_string_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2Dec extends BasicFunc{
        public String2Dec(Global global) {
            super(global,
                    "__cast_string_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2LDec extends BasicFunc{
        public String2LDec(Global global) {
            super(global,
                    "__cast_string_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

    public static class String2LLDec extends BasicFunc {
        public String2LLDec(Global global) {
            super(global,
                    "__cast_string_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("string")));
        }
    }

}
