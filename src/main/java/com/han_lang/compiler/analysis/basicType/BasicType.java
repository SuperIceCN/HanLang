package com.han_lang.compiler.analysis.basicType;

import com.han_lang.compiler.analysis.Global;
import com.han_lang.compiler.analysis.Type;

public class BasicType extends Type {
    static Global _g;
    protected BasicType(String type) {
        super(_g, type.substring(1, type.length()-1), type);
        _g.declareGlobalType(this.name, this);
    }

    public static void init(Global global){
        _g = global;
        global.addGlobalType(new BoolType());
        global.addGlobalType(new ByteType());
        global.addGlobalType(new IntType());
        global.addGlobalType(new SIntType());
        global.addGlobalType(new LIntType());
        global.addGlobalType(new LLIntType());
        global.addGlobalType(new DecType());
        global.addGlobalType(new SDecType());
        global.addGlobalType(new LDecType());
        global.addGlobalType(new LLDecType());
        global.addGlobalType(new StringType());
    }
}
