package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class LLDecCasters {
    public static class LLDec2Bool extends BasicFunc{
        public LLDec2Bool(Global global) {
            super(global,
                    "__cast_lldec_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2Byte extends BasicFunc{
        public LLDec2Byte(Global global) {
            super(global,
                    "__cast_lldec_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2String extends BasicFunc{
        public LLDec2String(Global global) {
            super(global,
                    "__cast_lldec_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2SInt extends BasicFunc{
        public LLDec2SInt(Global global) {
            super(global,
                    "__cast_lldec_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2Int extends BasicFunc{
        public LLDec2Int(Global global) {
            super(global,
                    "__cast_lldec_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2LInt extends BasicFunc{
        public LLDec2LInt(Global global) {
            super(global,
                    "__cast_lldec_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2LLInt extends BasicFunc{
        public LLDec2LLInt(Global global) {
            super(global,
                    "__cast_lldec_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2SDec extends BasicFunc{
        public LLDec2SDec(Global global) {
            super(global,
                    "__cast_lldec_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2Dec extends BasicFunc {
        public LLDec2Dec(Global global) {
            super(global,
                    "__cast_lldec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

    public static class LLDec2LDec extends BasicFunc{
        public LLDec2LDec(Global global) {
            super(global,
                    "__cast_lldec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("lldec")));
        }
    }

}
