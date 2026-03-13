package com.example.springboot_aop_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

	@Before("execution(* com.example.springboot_aop_demo.service.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint )
	{
		System.out.println("Before Execution Method");
	}
	
	@After("execution(* com.example.springboot_aop_demo.service.*.*(..))")
	public void afterMethod(JoinPoint joinPoint)
	{
		System.out.println("After Execution Method");
	}
}
