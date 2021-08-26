package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class SDecCasters {
    public static class SDec2Bool extends BasicFunc{
        public SDec2Bool(Global global) {
            super(global,
                    "__cast_sdec_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2Byte extends BasicFunc{
        public SDec2Byte(Global global) {
            super(global,
                    "__cast_sdec_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2String extends BasicFunc{
        public SDec2String(Global global) {
            super(global,
                    "__cast_sdec_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2SInt extends BasicFunc{
        public SDec2SInt(Global global) {
            super(global,
                    "__cast_sdec_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2Int extends BasicFunc{
        public SDec2Int(Global global) {
            super(global,
                    "__cast_sdec_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2LInt extends BasicFunc{
        public SDec2LInt(Global global) {
            super(global,
                    "__cast_sdec_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2LLInt extends BasicFunc{
        public SDec2LLInt(Global global) {
            super(global,
                    "__cast_sdec_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2Dec extends BasicFunc{
        public SDec2Dec(Global global) {
            super(global,
                    "__cast_sdec_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2LDec extends BasicFunc {
        public SDec2LDec(Global global) {
            super(global,
                    "__cast_sdec_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

    public static class SDec2LLDec extends BasicFunc{
        public SDec2LLDec(Global global) {
            super(global,
                    "__cast_sdec_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("sdec")));
        }
    }

}
