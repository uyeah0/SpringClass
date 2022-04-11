package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Employee{

	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("개발자 10시 출근");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("개발자 7시 퇴근");
	}
	
	public Developer() {
		Checkin();
		Checkout();
	}
	
}
