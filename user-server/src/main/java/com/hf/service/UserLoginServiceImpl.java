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
        if (!StringUtils.isEmpty(user) && user.getInputPassword() != null) {
            if (user.getInputPassword().equalsIgnoreCase(checkCode)) {
                User existUser = userMapper.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
                if (StringUtils.isEmpty(existUser)) {
                    result.setStatus(false);
                    result.setMsg("對不起！用户名或密码错误！");
                } else {
                    result.setStatus(true);
                    result.setMsg("恭喜你！登陸成功");
                    //result.setUser(existUser);
                }
            } else {
                result.setStatus(false);
                result.setMsg("對不起！验证码输入错误！");
            }
        }
        return result;
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.findUserById(id);
    }


}
