package kr.hs.study.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestBean1 {
	
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1의 method1");
	}
	
	public void method1(int a1) {
		System.out.println("int 매개변수 method1");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("int 매개변수 2개 method1");
	}
	
	public void method1(String s1) {
		System.out.println("spring 매개변수 method1");
	}
	
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1의 method2");
	}
	
}
