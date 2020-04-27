package com.hf.utils;


import javax.servlet.http.Cookie;

/**
 * Created by Machenike-Pc on 2019/7/11.
 */
public class CookieUtils {

    public static Cookie findCookie(Cookie[] cookies, String name){
        if (cookies==null){
            return null;
        }else {
            for (Cookie cookie:cookies
                 ) {
                if(name.equals(cookie.getName())){
                    return cookie;
                }
            }
            return null;
        }
    }

}
