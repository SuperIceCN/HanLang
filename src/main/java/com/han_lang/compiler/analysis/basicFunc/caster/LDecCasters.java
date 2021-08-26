package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class LDecCasters {
    public static class LDec2Bool extends BasicFunc{
        public LDec2Bool(Global global) {
            super(global,
                    "__cast_ldec_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2Byte extends BasicFunc{
        public LDec2Byte(Global global) {
            super(global,
                    "__cast_ldec_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2String extends BasicFunc{
        public LDec2String(Global global) {
            super(global,
                    "__cast_ldec_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2SInt extends BasicFunc{
        public LDec2SInt(Global global) {
            super(global,
                    "__cast_ldec_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2Int extends BasicFunc{
        public LDec2Int(Global global) {
            super(global,
                    "__cast_ldec_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2LInt extends BasicFunc{
        public LDec2LInt(Global global) {
            super(global,
                    "__cast_ldec_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2LLInt extends BasicFunc{
        public LDec2LLInt(Global global) {
            super(global,
                    "__cast_ldec_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2SDec extends BasicFunc{
        public LDec2SDec(Global global) {
            super(global,
                    "__cast_ldec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2Dec extends BasicFunc{
        public LDec2Dec(Global global) {
            super(global,
                    "__cast_ldec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

    public static class LDec2LLDec extends BasicFunc {
        public LDec2LLDec(Global global) {
            super(global,
                    "__cast_ldec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("ldec")));
        }
    }

}
