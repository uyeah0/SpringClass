package kr.hs.study.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 1. dao 가지고 오기
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		// 2. TestBean 객체 t1 만들어서 10, spring 넣기
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setData1(10);
		t1.setData2("spring");

		// 3. dao의 insert_data 호출
		dao.insert_data(t1);
		
		System.out.println("inserted!!");
		
		ctx.close();

	}

}
