package com.callray.example.utils;

/**
 * @author administrator
 * @date 2020/9/4 18:00
 *
 */
public class StringTools {

    public static boolean isNullOrEmpty(String requiredStr){
        return null == requiredStr || "".equals(requiredStr) || "null".equals(requiredStr);
    }
    public static boolean isNullOrEmpty(Object requiredObj){
        return null == requiredObj || "".equals(requiredObj);
    }

}
