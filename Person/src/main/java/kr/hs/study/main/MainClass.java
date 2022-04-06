package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Test;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Test obj1 = context.getBean("javac1", Test.class);
		
		context.close();
	}

}
