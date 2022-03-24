package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.novel;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		
		Book novel = ctx.getBean("novel", Book.class);
		novel.print();
		
		Book poet = ctx.getBean("poet", Book.class);
		poet.print();
		
		Book magazine = ctx.getBean("magazine", Book.class);
		magazine.print();
		

	
	}

}
