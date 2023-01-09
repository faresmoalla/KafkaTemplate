package tn.examen.spring.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;


@Component
@Aspect
@Slf4j
public class PerformanceAspect {
	
	
	@Around("execution(public void tn.examen.spring.service.ExamenService.*(..))")
public Object profile(ProceedingJoinPoint pjp) throws Throwable {
long start = System.currentTimeMillis();
Object obj = pjp.proceed();
long elapsedTime = System.currentTimeMillis() - start;
log.info("////////////"+"Method execution time: " + elapsedTime + " milliseconds.");
return obj;
}

}
