package com.cdp.utils;

import org.springframework.util.DigestUtils;

public class MD5Utils {

    private static final String salt = "People##**";

    public static String getMD5(String string){
        String val = string+salt;
        return DigestUtils.md5DigestAsHex(val.getBytes());
    }

    public static void main(String[] args) {
        System.out.println(getMD5("123456"));
    }
}
