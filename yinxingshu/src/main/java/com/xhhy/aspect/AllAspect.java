package com.xhhy.aspect;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AllAspect {

	private Logger log = Logger.getLogger(AllAspect.class);
	
	@Pointcut("execution(* com.xhhy.dao.*.*(..))")
	public void expre(){}
	
	@Before("expre()")
	public void beforeMethod(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		String className = jp.getTarget().getClass().getName();
		log.warn("=============="+className+"���"+methodName+"������ʼִ��============");
	}
	
	@After("expre()")
	public void afterMethod(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		String className = jp.getTarget().getClass().getName();
		log.warn("=============="+className+"���"+methodName+"ִ�����============");
	}
}
