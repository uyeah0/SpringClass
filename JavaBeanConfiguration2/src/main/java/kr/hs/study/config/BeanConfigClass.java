package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.TestBean1;

@Configuration
// 이 파일은 bean을 만들라고 명령하는 설정파일이다. =config.xml과 동일
public class BeanConfigClass {
	
	
	@Bean  //나는 아래 메서드를 실행한 예를 bean으로 만들어 컨테이너에 등록
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
