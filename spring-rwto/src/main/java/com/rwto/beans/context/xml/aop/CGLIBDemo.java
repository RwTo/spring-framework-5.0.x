package com.rwto.beans.context.xml.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author renmw
 * @create 2023/9/19 19:10
 **/
public class CGLIBDemo {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CGLIBDemo.class);
		enhancer.setCallback(new MethodInterceptorImpl());

		CGLIBDemo demo = (CGLIBDemo) enhancer.create();
		demo.test();
		System.out.println(demo);
	}

	public void test(){
		System.out.println("================cglib===================");
	}

	private static class MethodInterceptorImpl implements MethodInterceptor {

		@Override
		public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
			System.out.println("before invoke "+ method);
			Object res = methodProxy.invokeSuper(o, args);
			System.out.println("After invoke "+ method);
			return res;
		}
	}
}
