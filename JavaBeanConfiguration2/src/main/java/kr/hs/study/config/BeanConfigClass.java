package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration
// �� ������ bean�� ������ ����ϴ� ���������̴�. =config.xml�� ����
public class BeanConfigClass {
	
	
	@Bean  //���� �Ʒ� �޼��带 ������ ���� bean���� ����� �����̳ʿ� ���
	@Lazy
	//@Scope("prototype")
	public TestBean1 java1() {
		TestBean1 java1 = new TestBean1(); 
		return java1;
	}
	
	@Bean
	@Lazy
	//@Scope("prototype")
	public TestBean1 obj2() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy
	//@Scope("prototype")
	public TestBean1 obj3() {
		return new TestBean1();
	}
}
