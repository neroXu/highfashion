package com.hf.controller;

import com.hf.Result;
import com.hf.User;
import com.hf.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Machenike-Pc on 2020/4/13.
 */
@RestController
@RequestMapping("/seller")
public class HFSellerController {

    @Autowired
    private UserFeign userFeign;


    @RequestMapping("/user/findUserById/{id}")
    public User findUserById(@PathVariable("id") Integer id){
        return userFeign.findUserById(id);
    }
}
