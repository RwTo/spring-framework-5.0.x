package com.rwto;


import com.rwto.beans.context.xml.aop.AopTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renmw
 * @create 2023/9/16 11:34
 **/
public class SpringAop {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("aspectTest.xml");
		AopTest bean = (AopTest) bf.getBean("aop");

		bean.test();
	}
}
