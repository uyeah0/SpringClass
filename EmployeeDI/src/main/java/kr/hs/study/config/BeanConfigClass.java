package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.Designer;
import kr.hs.study.beans.Developer;
import kr.hs.study.beans.Publisher;

@Component
public class BeanConfigClass {
	
	@Bean
	public Designer designer() {
		return new Designer(7,10);
	}
	
	@Bean
	public Developer developer() {
		return new Developer(9,6);
	}
	
	@Bean
	public Publisher publisher() {
		return new Publisher(10,5);
	}
}
