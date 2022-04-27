package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.LoginTest;
import kr.hs.study.config.BeanConfigClass;
import kr.hs.study.dao.LoginDAO;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		// 1. dao ������ ����
		LoginDAO dao = ctx.getBean(LoginDAO.class);
		
		// 2. LoginTest ��ü t1 ���� 10, spring �ֱ�
		LoginTest t1 = ctx.getBean(LoginTest.class);
		t1.setUserid("kim");
		t1.setUserpass("1111");
		t1.setUsername("��ٸ�");
		
		
		// 3. dao�� insert_data ȣ��
		dao.insert_data(t1);
		
		System.out.println("inserted!!");
		
		ctx.close();
	}

}
