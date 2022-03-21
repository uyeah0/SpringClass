package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Book;
import kr.hs.study.beans.novel;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
		Book novel = ctx.getBean("novel1", Book.class);
		novel.print();
		
		Book poet = ctx.getBean("poet1", Book.class);
		poet.print();
		
		Book magazine = ctx.getBean("magazine1", Book.class);
		magazine.print();
		

	
	}

}
