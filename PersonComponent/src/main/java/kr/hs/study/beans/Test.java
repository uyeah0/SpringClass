package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	@Autowired
	private Person p1;
	
	@Autowired
	private Person p2;
	
	public Person getP1() {
		return p1;
	}
	public Person getP2() {
		return p2;
	}
	
	public Test() {
		
	}
	
	@Autowired
	public Test(Person p1, Person p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	
}
