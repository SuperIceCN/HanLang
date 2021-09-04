package com.han_lang.compiler.llvm.generaotr;

import com.han_lang.compiler.analysis.Type;
import com.han_lang.compiler.analysis.TypeSet;
import com.han_lang.compiler.llvm.Codegen;
import com.han_lang.compiler.llvm.LLVMUtil;

public class TypeUseGen extends Codegen {
    Type type;
    boolean asRef;

    public TypeUseGen(Type type) {
        this.type = type;
        this.asRef = false;
    }

    public TypeUseGen asRef(boolean ref){
        this.asRef = ref;
        return this;
    }

    public TypeUseGen asRef(){
        return asRef(true);
    }

    public TypeUseGen asRefIfNotBasic(){
        return asRef(!this.type.isBasic());
    }

    @Override
    public String gen() {
        //尝试拓展指定类型（如果类型在此文件中实现的话那么将可以成功扩展）
        return processRef(_gen(type.expand()));
    }

    private String _gen(Type t){
        switch (t.type){
            case "<bool>":
            case "<byte>":
                return "i8";
            case "<sint>":
                return "i16";
            case "<int>":
                return "i32";
            case "<lint>":
                return "i64";
            case "<llint>":
                return "i128";
            case "<sdec>":
                return "half";
            case "<dec>":
                return "float";
            case "<ldec>":
                return "double";
            case "<lldec>":
                return "fp128";
            case "<string>":
                return "i8*"; //字符串底层为字节数组
            case "<null>":
                return "void";
        }
        if(t.isAlias()){
            return _gen(t.expandIfAlias());
        }else if(t.isArray()){
            return "[" + t.toArrayLength() + " x " + _gen(t.toSingleType());
        }else if(t.isStruct()){
            return LLVMUtil.localVar(t.type.substring(1, t.type.length() -1));
        }else if(t.isFunc()){
            StringBuilder tmp = new StringBuilder();
            TypeSet typeSet = t.toArgTypes();
            tmp.append(_gen(t.toReturnType())).append(" (");
            for(int i=0;i<typeSet.size();i++){
                if(i != 0){
                    tmp.append(", ");
                }
                tmp.append(_gen(typeSet.get(i)));
            }
            tmp.append(")");
            return tmp.toString();
        }
        return "";
    }

    private String processRef(String output){
        return output + (asRef ? "*" : "");
    }
}
