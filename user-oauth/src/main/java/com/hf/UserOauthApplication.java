package com.hf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.hf.mapper")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserOauthApplication.class, args);
	}

}
