package kr.hs.study.beans;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 기본 생성자");
	}
	
	public void initMethod() {
		System.out.println("생성자호출한 다음에 자동으로 실행되는 init method");
	}
	
	public void destroyMethod() {
		System.out.println("생성자소멸전에 자동으로 실행되는 destroy method");
	}
}
