package kr.hs.study.config;

import org.springframework.context.annotation.Bean;



import org.springframework.stereotype.Component;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean3;


@Component
public class BeanConfigClass {


	@Bean
	public DataBean3 data3() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean4 data4() {
		return new DataBean4();
	}
	
	@Bean
	public TestBean3 javac1() {
		return new TestBean3(100, "spring", new DataBean3(), new DataBean4());
	}
	
	
}
