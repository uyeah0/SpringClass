package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Publisher implements Employee{

	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("퍼블리서 11시 출근");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("퍼블리서 6시 퇴근");
	}
	
	public Publisher() {
		Checkin();
		Checkout();
	}
}
