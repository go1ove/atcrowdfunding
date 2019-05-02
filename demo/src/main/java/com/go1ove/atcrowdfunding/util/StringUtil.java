package com.go1ove.atcrowdfunding.util;

/**
 * @author go1ove
 * @create 2019-04-30-16:56
 */
public class StringUtil {
    public static boolean isEmpty(String s){
        return s == null || "".equals(s);
    }

    public static boolean isNotEmpty(String s){
        return !isEmpty(s);
    }
}
