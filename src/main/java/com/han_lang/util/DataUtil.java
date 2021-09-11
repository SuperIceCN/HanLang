package com.han_lang.util;

import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;

import java.util.Arrays;

public class DataUtil {
    public static <T> T[] concat(T[] first, T[] second) {
        T[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    @SafeVarargs
    public static <T> T switchNotNull(T... args){
        for(T each : args){
            if(each != null){
                return each;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T> T switchIf(Object2BooleanFunction<T> condition, T... args){
        for(T each : args){
            if(condition.test(each)){
                return each;
            }
        }
        return null;
    }
}
