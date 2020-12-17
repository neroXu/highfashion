package com.hf;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.Test;

import java.util.Date;

public class JWTTest {

    @Test
    public void testToken(){
        JwtBuilder builder= Jwts.builder()
                .setId("888")             //设置唯一编号
                .setSubject("小白")       //设置主题  可以是JSON数据
                .setIssuedAt(new Date())  //设置签发日期
                .signWith(SignatureAlgorithm.HS256,"nero");//设置签名 使用HS256算法，并设置SecretKey(字符串)
        //构建 并返回一个字符串
        System.out.println( builder.compact() );
    }

    @Test
    public void parseToken(){
        String compactJwt="eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODgiLCJzdWIiOiLlsI_nmb0iLCJpYXQiOjE2MDY3NDk5Njl9.WdF2Wwo6wJiujUUuHjRzcQ2MM8e4qWNLcNZTB4Z7uSQ";
        Claims claims = Jwts.parser().
                setSigningKey("nero").
                parseClaimsJws(compactJwt).
                getBody();
        System.out.println(claims);
    }
}
