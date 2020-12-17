package com.hf.mapper;


import com.hf.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    @Results(id = "userMap", value = {@Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "email", column = "email"),
            @Result(property = "created", column = "created"),
            @Result(property = "updated", column = "updated"),
            @Result(property = "sourceType", column = "source_type"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "name", column = "name"),
            @Result(property = "status", column = "status"),
            @Result(property = "headPic", column = "head_pic"),
            @Result(property = "qq", column = "qq"),
            @Result(property = "accountBalance", column = "account_balance"),
            @Result(property = "isMobileCheck", column = "is_mobile_check"),
            @Result(property = "isEmailCheck", column = "is_email_check"),
            @Result(property = "qq", column = "sex"),
            @Result(property = "userLevel", column = "user_level"),
            @Result(property = "points", column = "points"),
            @Result(property = "experienceValue", column = "experience_value"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "lastLoginTime", column = "last_login_time")})
    User findUserById(Integer id);

    @Select("select * from user where username = #{username} and password = #{password}")
    @ResultMap("userMap")
    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username}")
    @ResultMap("userMap")
    User findUserByUsername(@Param("username") String username);

    @Insert("insert into user (username, password, created, updated) values (#{username}, #{password}, #{created}, #{updated})")
    @ResultMap("userMap")
    void insertUser(User user);
}
