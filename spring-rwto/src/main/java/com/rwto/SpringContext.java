package com.rwto;

import com.rwto.beans.MyTestBean;
import com.rwto.beans.context.xml.SimpleBean;
import com.rwto.beans.context.xml.TestEvent;
import com.rwto.beans.context.xml.XmlBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

import java.text.MessageFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

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

		/*国际化信息*/
		internationalizationInformation();
		internationalizationInformationBySpring(bf);

		/*事件监听--观察者模式*/
		eventListener(bf);

		/*Converter*/
		converter(bf);
	}

	private static void converter(ClassPathXmlApplicationContext context) {
		System.out.println("======================converter===========================");
		ConversionService conversionService = (ConversionService) context.getBean("conversionService");
		Date convert = conversionService.convert("2023-09-14", Date.class);
		System.out.println(convert);
		System.out.println("======================converter===========================");
	}

	private static void eventListener(ClassPathXmlApplicationContext context) {
		System.out.println("======================eventListener===========================");
		TestEvent event = new TestEvent("hello", "world");
		context.publishEvent(event);
		System.out.println("======================eventListener===========================");
	}

	private static void internationalizationInformationBySpring(ClassPathXmlApplicationContext ctx) {
		System.out.println("======================internationalizationInformationBySpring===========================");
		Object[] params = {"John",new GregorianCalendar().getTime(),10};
		String str1 = ctx.getMessage("test", params, Locale.US);
		String str2 = ctx.getMessage("test", params, Locale.CHINA);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("======================internationalizationInformationBySpring===========================");

	}

	private static void internationalizationInformation() {

		System.out.println("======================internationalizationInformation===========================");
		String pattern1 = "{0}，你好！你于{1}在工商银行存入{2}元";
		String pattern2 = "At {1,time,short} on {1,date,long} {0}  paid {2,number,currency}";
		Object[] params = {"John",new GregorianCalendar().getTime(),10};

		String msg1 = MessageFormat.format(pattern1, params);

		MessageFormat mf = new MessageFormat(pattern2, Locale.US);
		String msg2 = mf.format(params);

		System.out.println(msg1);
		System.out.println(msg2);
		System.out.println("======================internationalizationInformation===========================");
	}
}
