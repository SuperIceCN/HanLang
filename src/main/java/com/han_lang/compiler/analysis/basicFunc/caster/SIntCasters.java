package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class SIntCasters {
    public static class SInt2Bool extends BasicFunc{
        public SInt2Bool(Global global) {
            super(global,
                    "__cast_sint_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2Byte extends BasicFunc{
        public SInt2Byte(Global global) {
            super(global,
                    "__cast_sint_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2String extends BasicFunc{
        public SInt2String(Global global) {
            super(global,
                    "__cast_sint_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2Int extends BasicFunc{
        public SInt2Int(Global global) {
            super(global,
                    "__cast_sint_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2LInt extends BasicFunc{
        public SInt2LInt(Global global) {
            super(global,
                    "__cast_sint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2LLInt extends BasicFunc{
        public SInt2LLInt(Global global) {
            super(global,
                    "__cast_sint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2SDec extends BasicFunc{
        public SInt2SDec(Global global) {
            super(global,
                    "__cast_sint_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2Dec extends BasicFunc{
        public SInt2Dec(Global global) {
            super(global,
                    "__cast_sint_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2LDec extends BasicFunc{
        public SInt2LDec(Global global) {
            super(global,
                    "__cast_sint_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

    public static class SInt2LLDec extends BasicFunc{
        public SInt2LLDec(Global global) {
            super(global,
                    "__cast_sint_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("sint")));
        }
    }

}
