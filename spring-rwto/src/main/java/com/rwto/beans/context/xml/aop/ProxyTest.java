package com.rwto.beans.context.xml.aop;

import java.lang.reflect.Proxy;

/**
 * @author renmw
 * @create 2023/9/19 18:36
 **/
public class ProxyTest {
	public static void main(String[] args) {
		/*JDK 动态代理*/
		JDKServiceImpl jdkService = new JDKServiceImpl();

		MyInvocationHandler handler = new MyInvocationHandler(jdkService);

		JDKService proxy = (JDKService) handler.getProxy();
		proxy.add();

//		JDKService p = (JDKService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), jdkService.getClass().getInterfaces(), (pro, method, arg) -> {
//			System.out.println("--------------jdk--before----------------");
//			Object res = method.invoke(jdkService, arg);
//			System.out.println("--------------jdk--after----------------");
//			return res;
//		});
//		p.add();
	}
}
