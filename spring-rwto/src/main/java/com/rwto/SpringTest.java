package com.rwto;

import com.rwto.beans.MyTestBean;
import com.rwto.beans.circular.TestA;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author renmw
 * @create 2023/9/6 18:14
 **/

public class SpringTest {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circularTest.xml");
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("circularTest.xml"));
		TestA bean = (TestA)bf.getBean("testA");
		System.out.println(bean);
		System.out.println(bean.getTestB());
		System.out.println(bean.getTestB().getTestC());
	}
}
