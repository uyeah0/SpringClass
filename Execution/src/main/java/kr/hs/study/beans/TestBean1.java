package kr.hs.study.beans;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestBean1 {
	
	public void method1() {
		System.out.println("kr.hs.study.beans.TestBean1ÀÇ method1");
	}
	
	public void method1(int a1) {
		System.out.println("int method1");
	}
	
	public void method1(int a1, int a2) {
		System.out.println("int int method1");
	}
	
	public void method1(String s1) {
		System.out.println("string method1");
	}
	
	public void method1(int a1, String s1) {
		System.out.println("int,string method1");
	}

	public void method1(String s1, String s2) {
		System.out.println("string string method1");
	}
	
	public void method2() {
		System.out.println("kr.hs.study.beans.TestBean1ÀÇ method2");
	}
	
}
