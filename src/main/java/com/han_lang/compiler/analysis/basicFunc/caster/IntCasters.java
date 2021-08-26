package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class IntCasters {
    public static class Int2Bool extends BasicFunc{
        public Int2Bool(Global global) {
            super(global,
                    "__cast_int_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2Byte extends BasicFunc{
        public Int2Byte(Global global) {
            super(global,
                    "__cast_int_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2String extends BasicFunc{
        public Int2String(Global global) {
            super(global,
                    "__cast_int_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2SInt extends BasicFunc{
        public Int2SInt(Global global) {
            super(global,
                    "__cast_int_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2LInt extends BasicFunc{
        public Int2LInt(Global global) {
            super(global,
                    "__cast_int_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2LLInt extends BasicFunc{
        public Int2LLInt(Global global) {
            super(global,
                    "__cast_int_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2SDec extends BasicFunc{
        public Int2SDec(Global global) {
            super(global,
                    "__cast_int_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2Dec extends BasicFunc{
        public Int2Dec(Global global) {
            super(global,
                    "__cast_int_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2LDec extends BasicFunc{
        public Int2LDec(Global global) {
            super(global,
                    "__cast_int_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

    public static class Int2LLDec extends BasicFunc{
        public Int2LLDec(Global global) {
            super(global,
                    "__cast_int_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("int")));
        }
    }

}
