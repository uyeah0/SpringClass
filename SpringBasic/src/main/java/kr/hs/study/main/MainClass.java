package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		// config.xml를 로딩시킨다 : 객체를 생성해서 컨테이너에 보관한다 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean t1 = (TestBean)ctx.getBean("t1"); // getBean의 return은 object
		System.out.println("t1 : " + t1); // 주소값
		
		TestBean t2 = ctx.getBean("t1", TestBean.class); // upcasting 안하고 testBean클래스로 바꿔줌
		//TestBean t2 = (TestBean)ctx.getBean("t2");
		System.out.println("t2 : " + t2);
		
		ctx.close();
	}
}
