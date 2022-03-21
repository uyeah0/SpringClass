package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 林家 免仿 obj1栏肺
		TestBean1 java1 = ctx.getBean("java1", TestBean1.class);
		System.out.println("java1狼 林家 : " + java1);
		
		TestBean1 obj2 = ctx.getBean("obj2", TestBean1.class);
		System.out.println("obj2狼 林家 : " + obj2);
		
		TestBean1 obj3 = ctx.getBean("obj2", TestBean1.class);
		System.out.println("obj3狼 林家 : " + obj3);
		
		ctx.close();
	}

}
