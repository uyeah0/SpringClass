package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee{

	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("������ 10�� ���");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("������ 7�� ���");
	}
	
	public Developer() {
		Checkin();
		Checkout();
	}
	
}
