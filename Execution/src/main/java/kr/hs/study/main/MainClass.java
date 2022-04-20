package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;


public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 obj1 = ctx.getBean("t1", TestBean1.class);
		
		obj1.method1();
		obj1.method2();
		obj1.method1(100);
		obj1.method1("spring");
		System.out.println("----------------");
		obj1.method1(1,100);
		obj1.method1(1,"spring300");
		System.out.println("----------------");
		obj1.method1();
		//obj1.method1("spring", "spring");
		
		
		ctx.close();
	}

}
