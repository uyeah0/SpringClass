package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

@Configuration
public class BeanConfiguration {
	
	@Bean(name="test") // name-> 객체 이름 바꾸기 t1 -> test
	@Lazy
	@Scope("prototype")
	public TestBean3 t1() {
		return new TestBean3(); 
	}
	
	@Bean
	public TestBean3 t2() {
		return new TestBean3();
	}
	
	@Bean
	public TestBean4 t3() {
		return new TestBean4(100, "spring4", new DataBean4());
	}
	
	@Bean
	public TestBean4 t4() {
		TestBean4 obj4 = new TestBean4();
		obj4.setData1(200);
		obj4.setData2("spring5");
		obj4.setData4(new DataBean4());
		return obj4; 
	}
}
