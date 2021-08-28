package com.han_lang.compiler.analysis;

import com.google.gson.annotations.Expose;
import com.han_lang.util.DataUtil;

import java.util.Arrays;

public class TypeSet {
    @Expose
    public Type[] types;
    public TypeSet(Type... type){
        types = type;
    }

    public Type get(int i){
        if(i >= types.length){
            return null;
        }
        return types[i];
    }

    public int size(){
        return types.length;
    }

    public TypeSet merge(TypeSet another){
        return new TypeSet(DataUtil.concat(this.types, another.types));
    }

    @Override
    public String toString() {
        return Arrays.toString(types);
    }

    @Override
    public int hashCode() {
        int i = 0;
        for(Type type : types){
            i += type.type.hashCode();
        }
        return i;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof TypeSet){
            TypeSet another = (TypeSet) obj;
            if(another.size() == this.size()){
                for(int i=0;i<another.size();i++){
                    if(!another.get(i).equals(this.get(i))){
                        return false;
                    }
                }
            }
            return true;
        }else if(obj instanceof Type){
            if(this.size() == 1){
                return this.get(0).equals(obj);
            }
            return false;
        }
        return false;
    }
}
