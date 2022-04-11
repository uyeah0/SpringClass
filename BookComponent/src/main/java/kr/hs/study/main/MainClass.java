package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.hs.study.beans.Book;
import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;
import kr.hs.study.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Book novel = ctx.getBean(novel.class);
		novel.print();
		
		
		Book poet = ctx.getBean(poet.class);
		poet.print();
		
		Book magazine = ctx.getBean(magazine.class);
		magazine.print();
		

	
	}

}
