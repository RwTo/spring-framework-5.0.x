package com.rwto;

import com.rwto.beans.User;
import com.rwto.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：Rwto
 * @date ：Created in 2023/8/27 22:52
 * @description：
 */
public class SpringTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		User user = context.getBean(User.class);
		System.out.println(user);
	}
}
