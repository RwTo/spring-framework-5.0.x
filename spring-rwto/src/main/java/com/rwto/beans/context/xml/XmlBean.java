package com.rwto.beans.context.xml;

import com.rwto.beans.circular.TestA;
import org.springframework.beans.factory.BeanFactory;

import java.util.Date;


/**
 * @author renmw
 * @create 2023/9/12 11:00
 **/
public class XmlBean {

	private TestA testA;

	private String str;

	private Date date;

	private BeanFactory beanFactory;

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) {
		this.beanFactory = beanFactory;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "XmlBean{" +
				"testA=" + testA +
				", str='" + str + '\'' +
				", date=" + date +

				", msg='" + msg + '\'' +

				", beanFactory=" + beanFactory +
				'}';
	}
}
