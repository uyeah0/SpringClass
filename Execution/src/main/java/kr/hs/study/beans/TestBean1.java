package kr.hs.study.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestBean1 {
	
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1�� method1");
	}
	
	public void method1(int a1) {
		System.out.println("int �Ű����� method1");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("int �Ű����� 2�� method1");
	}
	
	public void method1(String s1) {
		System.out.println("spring �Ű����� method1");
	}
	
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1�� method2");
	}
	
}
