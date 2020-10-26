package com.hf.mapper;


import com.hf.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findUserById(Integer id);

    @Select("select * from user where username = #{username} and password = #{password}")
    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
