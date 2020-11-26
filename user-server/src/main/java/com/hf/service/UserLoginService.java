package com.hf.service;

import com.hf.Result;
import com.hf.User;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */
public interface UserLoginService {

    Result userLogin(User user, String checkCode);

    User getUserById( Integer id);
}
