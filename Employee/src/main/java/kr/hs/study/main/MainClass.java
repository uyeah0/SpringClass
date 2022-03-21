package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Designer designer = ctx.getBean("designer", Designer.class);
		designer.Checkin();
		designer.Checkout();

		Developer developer = ctx.getBean("developer", Developer.class);
		developer.Checkin();
		developer.Checkout();
		
		Publisher publisher = ctx.getBean("publisher", Publisher.class);
		publisher.Checkin();
		publisher.Checkout();
		
	}

}
