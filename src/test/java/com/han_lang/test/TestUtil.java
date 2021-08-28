package com.han_lang.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TestUtil {
    public static String getCode(String name){
        URL cl = VerifyTest.class.getResource("/");
        System.out.println(cl.toString());
        InputStream stream = VerifyTest.class.getResourceAsStream("/" + name);
        try {
            byte[] content = new byte[stream.available()];
            stream.read(content);
            return new String(content, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
