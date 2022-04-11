package kr.hs.study.beans;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Employee{
	
	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("디자이너 7시 출근");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("디자이너 10시 출근");
	}
	
	public Designer() {
		Checkin();
		Checkout();
	}
	
}
