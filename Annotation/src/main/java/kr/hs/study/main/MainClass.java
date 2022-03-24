package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
//		TestBean1 obj1 = ctx.getBean("xml1", TestBean1.class);
//		System.out.println("data1 : " + obj1.getData1());
		
		TestBean2 obj2 = ctx.getBean("xml2", TestBean2.class);
		System.out.println("data1: " + obj2.getData1());
		System.out.println("data2: " + obj2.getData2());
		
		ctx.close();
		
		System.out.println("------------------------------------------------------------------");
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean2 java1 = ctx2.getBean("java1", TestBean2.class);
		System.out.println("java1 : " + java1);
		

		
	}

}
