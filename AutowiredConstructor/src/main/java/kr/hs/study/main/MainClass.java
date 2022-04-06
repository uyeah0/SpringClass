package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import kr.hs.study.beans.TestBean3;
import kr.hs.study.config.BeanConfigClass;


public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean3 t1 = context.getBean("javac1", TestBean3.class);
		
		System.out.println( "data1 " + t1.getData1());
		System.out.println( "data2 " + t1.getData2());
		System.out.println( "data3 " + t1.getData3());
		System.out.println( "data4 " + t1.getData4());
		
	}

}
