package com.hf.controller;

import com.alibaba.fastjson.JSON;
import com.hf.Result;
import com.hf.User;
import com.hf.service.UserService;
import com.hf.util.JwtUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Machenike-Pc on 2019/7/11.
 */
@RestController
@Api(value = "for user")
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    @ApiOperation(value = "用户登录")
    public Result userLogin(@RequestBody @Valid User user) {
        if(user!=null&&!user.getUsername().isEmpty()){
            User userFromDB = userService.userLogin(user.getUsername());
            if(userFromDB!=null&&BCrypt.checkpw(user.getPassword(),userFromDB.getPassword())){
                //设置令牌信息
                Map<String,Object> info = new HashMap<String,Object>();
                info.put("role","USER");
                info.put("success","SUCCESS");
                info.put("username",user.getUsername());
                //生成令牌
                String jwt = JwtUtil.createJWT(UUID.randomUUID().toString(), JSON.toJSONString(info),null);
                return new Result(true,"用户登录成功！",jwt);
            }else {
                return new Result(false,"用户名或密码不正确！");
            }
        }else {
            return new Result(false,"用户名不能为空！");
        }
    }
    @GetMapping(value = {"findUserById/{id}"})
    @ApiOperation(value = "根据id获取用户")
    public User findUserByID(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }

    @GetMapping(value = {"findUserByUsername/{username}"})
    @ApiOperation(value = "根据username获取用户")
    public User findUserByUsername(@PathVariable("username") String username){
        return userService.findByUsername(username);
    }

    @RequestMapping(value = {"/regist"},method = RequestMethod.POST)
    @ApiOperation(value = "用户注册")
    public Result userRegist(@RequestBody @Valid User user) {
        if (!user.getUsername().isEmpty()&&!user.getPassword().isEmpty()){
            User userFromDB = userService.findByUsername(user.getUsername());
            if (userFromDB==null){
                //username未被使用，可以注册
                String hashpw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
                user.setPassword(hashpw);
                user.setCreated(new Date());
                user.setUpdated(new Date());
                userService.save(user);
                return new Result(true,"注册成功！");
            }else {
                return new Result(false,"username已经存在，注册失败！");
            }
        }else {
            return new Result(false,"用户名或密码不能为空！");
        }


    }

}
