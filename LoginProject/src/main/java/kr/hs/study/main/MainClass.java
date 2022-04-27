package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.LoginTest;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.LoginDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 1. dao 가지고 오기
		LoginDAO dao = ctx.getBean(LoginDAO.class);
		
		// 2. LoginTest 객체 t1 만들어서 10, spring 넣기
		LoginTest t1 = ctx.getBean(LoginTest.class);
		t1.setUserid("kim");
		t1.setUserpass("1111");
		t1.setUsername("김다리");
		
		
		// 3. dao의 insert_data 호출
		dao.insert_data(t1);
		
		System.out.println("inserted!!");
		
		ctx.close();
	}

}
