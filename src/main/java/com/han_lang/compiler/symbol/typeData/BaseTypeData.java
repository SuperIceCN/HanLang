package com.han_lang.compiler.symbol.typeData;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTypeData {
    public List<BaseTypeData> subTypes = new ArrayList<>();
    public String type;

    public boolean isSingle(){
        return subTypes.isEmpty();
    }

    public abstract boolean match(BaseTypeData another);
}
