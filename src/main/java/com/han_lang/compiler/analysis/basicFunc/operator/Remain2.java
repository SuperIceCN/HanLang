package com.han_lang.compiler.analysis.basicFunc.operator;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.analysis.basicFunc.BasicFunc;
//%
public class Remain2 {
    public static class OperatorRemain2ByteByte extends BasicFunc {
        public OperatorRemain2ByteByte(Global global) {
            super(global,
                    "__remain2_byte_byte",
                    global.getGlobalType("byte"),
                    new TypeSet(global.getGlobalType("byte"), global.getGlobalType("byte")));
        }
    }

    public static class OperatorRemain2SIntSInt extends BasicFunc {
        public OperatorRemain2SIntSInt(Global global) {
            super(global,
                    "__remain2_sint_sint",
                    global.getGlobalType("sint"),
                    new TypeSet(global.getGlobalType("sint"), global.getGlobalType("sint")));
        }
    }

    public static class OperatorRemain2IntInt extends BasicFunc {
        public OperatorRemain2IntInt(Global global) {
            super(global,
                    "__remain2_int_int",
                    global.getGlobalType("int"),
                    new TypeSet(global.getGlobalType("int"), global.getGlobalType("int")));
        }
    }

    public static class OperatorRemain2LIntLInt extends BasicFunc {
        public OperatorRemain2LIntLInt(Global global) {
            super(global,
                    "__remain2_lint_lint",
                    global.getGlobalType("lint"),
                    new TypeSet(global.getGlobalType("lint"), global.getGlobalType("lint")));
        }
    }

    public static class OperatorRemain2LLIntLLInt extends BasicFunc {
        public OperatorRemain2LLIntLLInt(Global global) {
            super(global,
                    "__remain2_llint_llint",
                    global.getGlobalType("llint"),
                    new TypeSet(global.getGlobalType("llint"), global.getGlobalType("llint")));
        }
    }
}
