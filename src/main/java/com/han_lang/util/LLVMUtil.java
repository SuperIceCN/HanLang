package com.han_lang.util;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

import java.nio.charset.StandardCharsets;

public class LLVMUtil {
    private static Object2IntOpenHashMap<String> varUsedTime = new Object2IntOpenHashMap<>();

    /**
     * 处理变量，如果有重复，就按照llvm风格加上一个自增的整数后缀
     * @param str 要处理的变量名
     * @return 处理过后的变量
     */
    private static String processVar(String str){
        if(varUsedTime.containsKey(str)){
            int t = varUsedTime.getInt(str);
            t++;
            varUsedTime.put(str, t);
            return str + t;
        }else {
            varUsedTime.put(str, 0);
            return str;
        }
    }

    public static String localVar(int i){
        return processVar("%"+i);
    }

    public static String localVar(String str){
        String transformed = llvmFormat(str);
        String out;
        if(str.equals(transformed)){
            out = "%"+str;
        }else {
            out = "%\""+str+"\"";
        }
        return processVar(out);
    }

    public static String globalVar(int i){
        return "@"+i;
    }

    public static String globalVar(String str){
        String transformed = llvmFormat(str);
        String out;
        if(str.equals(transformed)){
            out =  "@"+str;
        }else {
            out = "@\""+str+"\"";
        }
        return processVar(out);
    }

    /**
     * 将utf-8字符串转为llvm格式
     * @param str 要转换的字符串
     * @return 转换完的字符串，将会自动补充"\00"
     */
    public static String stringVal(String str){
        return llvmFormat(str) + "\\00";
    }

    public static String llvmFormat(String str){
        char[] chars = str.toCharArray();
        StringBuilder out = new StringBuilder();
        short b;
        String hex;
        for(char c : chars){
            if(c == 34){
                out.append("\\22");
            } else if(c >= 32 && c < 127){
                out.append(c);
            }else {
                byte[] bytes = (c + "").getBytes(StandardCharsets.UTF_8);
                for (byte aByte : bytes) {
                    out.append('\\');
                    b = (aByte < 0) ? (short) (256 + aByte) : (short) aByte;
                    hex = Integer.toString(b, 16).toUpperCase();
                    if (b < 16) out.append('0');
                    out.append(hex);
                }
            }
        }
        return out.toString();
    }

    /**
     * 计算llvm风格的i8数组长度，结束符"\00"将被计入
     * @param str 要计算长度的字符串
     * @return 长度
     */
    public static int llvmStringLength(String str){
        return str.getBytes(StandardCharsets.UTF_8).length + 1;
    }
}
