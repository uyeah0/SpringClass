package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Publisher implements Employee{

	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("�ۺ��� 11�� ���");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("�ۺ��� 6�� ���");
	}
	
	public Publisher() {
		Checkin();
		Checkout();
	}
}
