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
		
		// 1. dao ������ ����
		TestDAO dao = ctx.getBean(TestDAO.class);
		
		// 2. TestBean ��ü t1 ���� 10, spring �ֱ�
		TestBean t1 = ctx.getBean(TestBean.class);
		t1.setData1(10);
		t1.setData2("spring");

		// 3. dao�� insert_data ȣ��
		dao.insert_data(t1);
		
		System.out.println("inserted!!");
		
		ctx.close();

	}

}
