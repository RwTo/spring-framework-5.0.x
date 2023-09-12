package com.rwto;

import com.rwto.beans.MyTestBean;
import com.rwto.beans.context.xml.SimpleBean;
import com.rwto.beans.context.xml.XmlBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renmw
 * @create 2023/9/11 18:53
 **/
public class SpringContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext bf = new ClassPathXmlApplicationContext("xmlContextTest.xml");
		XmlBean bean = (XmlBean) bf.getBean("xmlBean");
		System.out.println(bean);
		SimpleBean simpleBean = (SimpleBean) bf.getBean("simpleBean");
		System.out.println(simpleBean);
	}
}
