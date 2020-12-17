package com.hf.service;

import com.hf.User;
import com.hf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User userLogin(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public void save(User user) {
        userMapper.insertUser(user);
    }


}
