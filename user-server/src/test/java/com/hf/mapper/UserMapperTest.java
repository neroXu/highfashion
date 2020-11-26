package com.hf.mapper;

import com.hf.User;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

/**
 * Created by Machenike-Pc on 2020/4/10.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUserById() throws Exception {
        User userById = userMapper.findUserById(1);
        System.out.println(userById);
    }

    @Test
    public void findUserByUsernameAndPassword() throws Exception {
        User user = userMapper.findUserByUsernameAndPassword("aaa", "123");
        System.out.println(user);
    }


}