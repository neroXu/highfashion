package com.hf.controller;

import com.hf.User;
import com.hf.service.SellerRemoteService;
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
    private SellerRemoteService sellerRemoteService;


    @RequestMapping("getUserById/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return sellerRemoteService.getUserById(id);
    }
}
