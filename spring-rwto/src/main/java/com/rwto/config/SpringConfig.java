package com.rwto.config;

import com.rwto.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：Rwto
 * @date ：Created in 2023/8/27 22:53
 * @description：
 */
@Configuration
public class SpringConfig {

	@Bean
	public User getUser(){
		User user = new User();
		user.setId("1");
		user.setName("rwto");
		return user;
	}

}
