package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.PrintMsg;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		PrintMsg obj1 = ctx.getBean("t1", PrintMsg.class);
		obj1.sayHello1();
		obj1.sayHello2();
		
		ctx.close();
	}

}
