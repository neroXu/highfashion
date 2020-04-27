package com.hf.service;

import com.hf.Result;
import com.hf.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Machenike-Pc on 2019/7/12.
 */
public interface UserLoginService {

    Result userLogin(User user, String checkCode);

    User getUserById( Integer id);
}
