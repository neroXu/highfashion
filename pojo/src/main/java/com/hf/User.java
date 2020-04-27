package com.hf;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by Machenike-Pc on 2019/7/4.
 */
@Setter
@Getter
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Integer age;
    private String sex;
    private boolean rememberUser;
    private String inputPassword;

}
