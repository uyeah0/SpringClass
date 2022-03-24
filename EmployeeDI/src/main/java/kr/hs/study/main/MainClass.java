package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;
import kr.hs.study.config.BeanConfigClass;


public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Designer designer = ctx.getBean("designer", Designer.class);
		designer.Checkin();
		designer.Checkout();
		
		Developer developer = ctx.getBean("developer", Developer.class);
		developer.Checkin();
		developer.Checkout();
		
		Publisher publisher = ctx.getBean("publisher", Publisher.class);
		publisher.Checkin();
		publisher.Checkout();
		
		ctx.close();
	}

}
