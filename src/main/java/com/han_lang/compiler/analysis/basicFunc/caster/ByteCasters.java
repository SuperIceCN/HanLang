package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class ByteCasters{
    public static class Byte2Bool extends BasicFunc{
        public Byte2Bool(Global global) {
            super(global,
                    "__cast_byte_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2String extends BasicFunc{
        public Byte2String(Global global) {
            super(global,
                    "__cast_byte_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2SInt extends BasicFunc{
        public Byte2SInt(Global global) {
            super(global,
                    "__cast_byte_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2Int extends BasicFunc{
        public Byte2Int(Global global) {
            super(global,
                    "__cast_byte_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2LInt extends BasicFunc{
        public Byte2LInt(Global global) {
            super(global,
                    "__cast_byte_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2LLInt extends BasicFunc{
        public Byte2LLInt(Global global) {
            super(global,
                    "__cast_byte_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2SDec extends BasicFunc{
        public Byte2SDec(Global global) {
            super(global,
                    "__cast_byte_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2Dec extends BasicFunc{
        public Byte2Dec(Global global) {
            super(global,
                    "__cast_byte_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2LDec extends BasicFunc{
        public Byte2LDec(Global global) {
            super(global,
                    "__cast_byte_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

    public static class Byte2LLDec extends BasicFunc{
        public Byte2LLDec(Global global) {
            super(global,
                    "__cast_byte_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("byte")));
        }
    }

}
