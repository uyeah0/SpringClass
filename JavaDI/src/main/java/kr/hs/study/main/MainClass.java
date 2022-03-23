package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.BeanConfiguration;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		TestBean3 obj1 = ctx.getBean("test", TestBean3.class);
		System.out.println("obj1 : " + obj1);
		
		TestBean3 obj2 = ctx.getBean("t2", TestBean3.class);
		System.out.println("obj2 : " + obj2);
		
		TestBean4 obj3 = ctx.getBean("t3", TestBean4.class);
		System.out.println( "Data1 : " + obj3.getData1());
		System.out.println( "Data2 : " + obj3.getData2());
		System.out.println( "Data4 : " + obj3.getData4());
		
		
		System.out.println( "===================================================");
		TestBean4 obj4 = ctx.getBean("t4", TestBean4.class);
		System.out.println( "Data1 : " + obj4.getData1());
		System.out.println( "Data2 : " + obj4.getData2());
		System.out.println( "Data4 : " + obj4.getData4());
	}
}
