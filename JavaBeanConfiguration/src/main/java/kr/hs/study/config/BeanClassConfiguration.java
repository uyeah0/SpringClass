package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.TestBean1;

// config.xml狼 开且苞 悼老(bean 积己)

@Configuration // (捞 颇老篮 spring 按眉 积己 汲沥 颇老捞促)
public class BeanClassConfiguration {

	// <bean id = "t1" class = "kr.hs.study.beans.TestBean1"/>
	@Bean // bean积己
	public TestBean1 method1() {
		TestBean1 t1 = new TestBean1(); // t1按眉 积己
		return t1; 
	}
	
	@Bean 
	public TestBean1 method2() {
		return new TestBean1();
	}
}
