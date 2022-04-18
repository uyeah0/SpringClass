package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("Advice의 Before Method");
	}
	public void afterMethod() {
		System.out.println("Advice의 After Method");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around메서드 호출1");
		pjp.proceed(); // 실제 핵심 메서드 실행
		System.out.println("around메서드 호출2");
			
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 호출");
	}
	
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod 호출");
		System.out.println("e:" + e);
	}
}
