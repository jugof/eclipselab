package example.spring.aop;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeStamp {
	
	@Pointcut("execution (* example.spring.aop.*.changePrice(..))")
	private void myPointCut() {}

	@Before("myPointCut()")
	public void beforeTime() {
		System.out.println(LocalDateTime.now());
	}
	
	@AfterThrowing("myPointCut()")
	public void errorTime() {
		System.out.println("Enter the ammount in +ve Rupees. Error occured at time: -->" + LocalDateTime.now());
	}
	
	@AfterReturning("myPointCut()")
	public void afterTime() {
		System.out.println(LocalDateTime.now());
	}
	
}
