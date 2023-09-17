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
	public void pointcut(){

	}
	@Before("pointcut()")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@After("pointcut()")
	public void afterTest(){
		System.out.println("afterTest");
	}

	@Around("pointcut()")
	public Object aroundTest(ProceedingJoinPoint p){
		System.out.println("beforeAround");
		Object o = null;
		try {
			o = p.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("afterAround");
		return o;
	}
}
