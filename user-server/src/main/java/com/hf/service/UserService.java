package com.hf.service;

import com.hf.User;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */
public interface UserService {

    User userLogin(String username);

    User getUserById( Integer id);

    User findByUsername(String username);

    void save(User user);
}
