package com.hf.service;

import com.hf.Result;
import com.hf.User;
import com.hf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result userLogin(User user, String checkCode) {
        Result result = new Result();

        return result;
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.findUserById(id);
    }


}
