package com.han_lang.compiler.analysis.basicFunc.caster;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;

public class LIntCasters {
    public static class LInt2Bool extends BasicFunc{
        public LInt2Bool(Global global) {
            super(global,
                    "__cast_lint_bool",
                    global.getGlobalType("bool"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2Byte extends BasicFunc{
        public LInt2Byte(Global global) {
            super(global,
                    "__cast_lint_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2String extends BasicFunc{
        public LInt2String(Global global) {
            super(global,
                    "__cast_lint_string",
                    global.getGlobalType("string"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2SInt extends BasicFunc{
        public LInt2SInt(Global global) {
            super(global,
                    "__cast_lint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2Int extends BasicFunc{
        public LInt2Int(Global global) {
            super(global,
                    "__cast_lint_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2LLInt extends BasicFunc{
        public LInt2LLInt(Global global) {
            super(global,
                    "__cast_lint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2SDec extends BasicFunc{
        public LInt2SDec(Global global) {
            super(global,
                    "__cast_lint_sdec",
                    global.getGlobalType("sdec"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2Dec extends BasicFunc{
        public LInt2Dec(Global global) {
            super(global,
                    "__cast_lint_dec",
                    global.getGlobalType("dec"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2LDec extends BasicFunc{
        public LInt2LDec(Global global) {
            super(global,
                    "__cast_lint_ldec",
                    global.getGlobalType("ldec"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

    public static class LInt2LLDec extends BasicFunc{
        public LInt2LLDec(Global global) {
            super(global,
                    "__cast_lint_lldec",
                    global.getGlobalType("lldec"),
                    new TypeSet(global.getGlobalType("lint")));
        }
    }

}
