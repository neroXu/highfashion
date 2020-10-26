package com.hf.controller;

import com.hf.Result;
import com.hf.User;
import com.hf.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Machenike-Pc on 2019/7/11.
 */
@RestController
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = {"/userLogin"}, method = RequestMethod.POST)
    public Result userLogin(@RequestBody User user, HttpServletRequest request, HttpServletResponse response) {
        /*if (!StringUtils.isEmpty(user) && user.isRememberUser()) {
            Cookie cookie = new Cookie("username", user.getUsername());
            cookie.setPath("/");
            cookie.setMaxAge(60 * 60 * 24);
            response.addCookie(cookie);
        }
        String checkCode = (String) request.getSession().getAttribute("checkcode");
        request.getSession().removeAttribute("checkcode");
        return userLoginService.userLogin(user, checkCode);*/
        return null;
    }
    @RequestMapping(value = {"getUserById/{id}"})
    public User getUserByID(@PathVariable("id") Integer id){
        return userLoginService.getUserById(id);
    }
}
