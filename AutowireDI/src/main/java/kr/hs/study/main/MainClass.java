package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean3;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*
		 * TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		 * System.out.println("data1 : " + t1.getData1());
		 * System.out.println("data2 : ");
		 * 
		 */	

		TestBean3 obj3 = ctx.getBean("obj3", TestBean3.class);
		System.out.println("data3 : " + obj3.getData3());
		System.out.println("data4 : " + obj3.getData4());
		
	}

}
