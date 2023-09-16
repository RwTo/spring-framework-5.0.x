package com.rwto.beans.context.xml.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
/**
 * @author renmw
 * @create 2023/9/16 11:19
 **/
@Aspect
public class AspectJTest {

	/**execution(public User com.itheima.service.UserService.findById(int) Exception)*/
	@Pointcut("execution(* *.test(..))")
	public void test(){

	}
	@Before("test()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@After("test()")
	public void afterTest(){
		System.out.println("afterTest");
	}

	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint p){
		System.out.println("before");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after");
		return o;
	}
}
