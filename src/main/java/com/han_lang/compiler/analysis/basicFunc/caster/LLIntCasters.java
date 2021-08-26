package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class LLIntCasters {
    public static class LLInt2Bool extends BasicFunc {
        public LLInt2Bool(Global global) {
            super(global,
                    "__cast_llint_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2Byte extends BasicFunc{
        public LLInt2Byte(Global global) {
            super(global,
                    "__cast_llint_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2String extends BasicFunc{
        public LLInt2String(Global global) {
            super(global,
                    "__cast_llint_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2SInt extends BasicFunc{
        public LLInt2SInt(Global global) {
            super(global,
                    "__cast_llint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2Int extends BasicFunc{
        public LLInt2Int(Global global) {
            super(global,
                    "__cast_llint_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2LInt extends BasicFunc{
        public LLInt2LInt(Global global) {
            super(global,
                    "__cast_llint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2SDec extends BasicFunc{
        public LLInt2SDec(Global global) {
            super(global,
                    "__cast_llint_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2Dec extends BasicFunc{
        public LLInt2Dec(Global global) {
            super(global,
                    "__cast_llint_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2LDec extends BasicFunc{
        public LLInt2LDec(Global global) {
            super(global,
                    "__cast_llint_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

    public static class LLInt2LLDec extends BasicFunc{
        public LLInt2LLDec(Global global) {
            super(global,
                    "__cast_llint_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("llint")));
        }
    }

}
