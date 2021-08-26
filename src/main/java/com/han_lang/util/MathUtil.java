package com.han_lang.util;

public class MathUtil {
    public static int autoParse(String number){
        if(number.startsWith("0x") || number.startsWith("0X")){
            return Integer.parseInt(number.substring(2), 16);
        }else if(number.startsWith("0b") || number.startsWith("0B")){
            return Integer.parseInt(number.substring(2), 16);
        }else if(number.startsWith("0") && number.length() > 1){
            return Integer.parseInt(number.substring(1), 8);
        }else {
            return Integer.parseInt(number);
        }
    }
}
