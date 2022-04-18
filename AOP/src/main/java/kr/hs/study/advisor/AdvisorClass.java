package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	public void beforeMethod() {
		System.out.println("Advice�� Before Method");
	}
	public void afterMethod() {
		System.out.println("Advice�� After Method");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around�޼��� ȣ��1");
		pjp.proceed(); // ���� �ٽ� �޼��� ����
		System.out.println("around�޼��� ȣ��2");
			
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod ȣ��");
	}
	
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod ȣ��");
		System.out.println("e:" + e);
	}
}
