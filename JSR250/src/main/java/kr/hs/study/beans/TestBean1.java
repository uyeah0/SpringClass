package kr.hs.study.beans;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1�� �⺻ ������");
	}
	
	public void initMethod() {
		System.out.println("������ȣ���� ������ �ڵ����� ����Ǵ� init method");
	}
	
	public void destroyMethod() {
		System.out.println("�����ڼҸ����� �ڵ����� ����Ǵ� destroy method");
	}
}
