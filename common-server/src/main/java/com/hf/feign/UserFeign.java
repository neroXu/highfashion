package com.hf.feign;

import com.hf.Result;
import com.hf.User;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-server")
@RequestMapping("/user")
public interface UserFeign {

    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable(name="id") Integer id);

    @GetMapping("/findUserByUsername/{username}")
    public User findUserByUsername(@PathVariable(name = "username") String username);
}
