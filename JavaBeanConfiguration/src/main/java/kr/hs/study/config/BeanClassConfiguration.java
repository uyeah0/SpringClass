package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml�� ���Ұ� ����(bean ����)

@Configuration // (�� ������ spring ��ü ���� ���� �����̴�)
public class BeanClassConfiguration {

	// <bean id = "t1" class = "kr.hs.study.beans.TestBean1"/>
	@Bean // bean����
	public TestBean1 method1() {
		TestBean1 t1 = new TestBean1(); // t1��ü ����
		return t1; 
	}
	
	@Bean 
	public TestBean1 method2() {
		return new TestBean1();
	}
}
