package com.rwto;

import com.rwto.beans.MyTestBean;
import com.rwto.beans.User;
import com.rwto.config.SpringConfig;
import org.springframework.beans.factory.xml.BeanDefinitionParserDelegate;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author ：Rwto
 * @date ：Created in 2023/8/27 22:52
 * @description：
 */
@SuppressWarnings("deprecation")
public class SpringRwTo {

	public static void main(String[] args) {
		//xml开发
		xmlDevelopment();

		//注解开发
		//annotationDevelopment();


	}

	private static void xmlDevelopment() {
		//ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		XmlBeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());

	}

	private static void annotationDevelopment() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		User user = context.getBean(User.class);
		System.out.println(user);

	}
}
