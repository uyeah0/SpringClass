package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.TestDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 1. dao 가져오기
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		// 2. TestBean 객체 t1 만들어서 10, spring 넣기
		/*
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setId("kim");
		t1.setPassword("1111");
		
		TestBean t2 = ctx.getBean(TestBean.class);
		t2.setId("Min");
		t2.setPassword("2222");
		
		TestBean t3 = ctx.getBean(TestBean.class);
		t3.setId("Park");
		t3.setPassword("3333");
		
		// 3. dao의 inser_data 호출
		dao.insert_data(t1);
		dao.insert_data(t2);
		dao.insert_data(t3);
		System.out.println("inserted!!");
		
		// update
		TestBean t4 = ctx.getBean(TestBean.class);
		t4.setId("kim");
		t4.setPassword("1234");
		
		dao.update_data(t4);
		System.out.println("updated!!");
		
				*/
		
		// delete
		TestBean t5 = ctx.getBean(TestBean.class);
		t5.setId("kim");
		
		dao.delete_data(t5);
		System.out.println("deleted!!");
		
		ctx.close();

	}

}
