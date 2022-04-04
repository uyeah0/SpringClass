package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/*
		 * TestBean1 obj = ctx.getBean("obj", TestBean1.class);
		 * System.out.println("data1 : " + obj.getData1());
		 * System.out.println("data2 : " + obj.getData2());
		 */
		

		TestBean2 obj3 = ctx.getBean("obj2", TestBean2.class);
		System.out.println("data1 : " + obj3.getData1());
		System.out.println("data2 : " + obj3.getData2());
		
		TestBean3 obj4 = ctx.getBean("obj3", TestBean3.class);
		System.out.println("data1 : " + obj4.getData1());
		System.out.println("data2 : " + obj4.getData2());
		System.out.println("data3 : " + obj4.getData3());
		System.out.println("data4 : " + obj4.getData4());
		
		System.out.println("=======================java===========================");
		
		AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		TestBean1 obj2 = acx.getBean("javac1", TestBean1.class);
		System.out.println("data1 : " + obj2.getData1());
		System.out.println("data2 : " + obj2.getData2());
		
		

		//양정원과 오붓한 시간을 보내세요 히
		ctx.close();
	}

}
