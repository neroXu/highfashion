package com.hf.controller;

import com.hf.User;
import com.hf.utils.CookieUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Machenike-Pc on 2019/7/4.
 */
@RestController
public class UserRegistController {

    @RequestMapping(value = {"/userRegist"})
    public String userRegist(User user, HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        Cookie cookie = CookieUtils.findCookie(cookies, "lastVisit");
        String result;
        if (cookie == null) {
            result = "你好！欢迎您第一次访问。。。";
        } else {
            String value = cookie.getValue();
            result = "您好！您的上次访问时间为：" + value;
        }
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(d);
        Cookie c = new Cookie("lastVisit", str);
        response.addCookie(c);
        return result;
    }
}
