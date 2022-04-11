package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Test obj1 = ctx.getBean(Test.class);
		obj1.getP1().setAge(100);
		obj1.getP1().setName("±èÀ¯Áø");
		obj1.getP1().setFood("¶ó¸é");
		
		obj1.getP1().eat();

		obj1.getP2().setAge(100);
		obj1.getP2().setName("»ó¿©ÀÚ");
		obj1.getP2().setFood("¶±»Ç±â");
		
		obj1.getP2().eat();
		
		ctx.close();
	}

}
