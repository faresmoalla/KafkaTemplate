package tn.examen.spring.config;

import org.apache.logging.log4j.LogManager;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class LoggingAspect {
	//private static final Logger logger = LogManager.getLogger(LoggingAspect.class);
	//@Before("execution(* tn.examen.spring.service.UserService.addUser(..))")
	//@Before("execution(* tn.examen.spring.service.UserService.*(..))")
	// @Before("execution(* tn.examen.spring.service.*.*(..))")
	//@After("execution(* tn.examen.spring.service.ExamenService.*(String))")
	/*
	
	@After("execution(public void tn.examen.spring.service.ExamenService.*(..))")
	public void logMethodExit(JoinPoint joinPoint) {
	String name = joinPoint.getSignature().getName();
	log.info("/////////////////////////After Execution " + name + " : ");
	

	}*/
	
	
	
	


	
	
	
	
	
	
}