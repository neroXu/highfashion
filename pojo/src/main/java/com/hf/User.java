package com.hf;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Machenike-Pc on 2019/7/4.
 */
@Setter
@Getter
public class User implements Serializable{
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Integer age;
    private String sex;
    private boolean rememberUser;
    private String inputPassword;

}
