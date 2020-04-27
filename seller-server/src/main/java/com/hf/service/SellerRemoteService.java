package com.hf.service;

import com.hf.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Machenike-Pc on 2020/4/13.
 */
@FeignClient(name = "user-server")
public interface SellerRemoteService {

    @RequestMapping("getUserById/{id}")
    public User getUserById(@PathVariable("id") Integer id);
}
