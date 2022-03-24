package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.magazine;
import kr.hs.study.beans.novel;
import kr.hs.study.beans.poet;

@Component
public class BeanConfigClass {
	@Bean
	public magazine magazine() {
		return new magazine("lee", "magazine 이름", 20000);
	}
	
	@Bean
	public novel novel() {
		return new novel("park", "novel 이름", 10000);
	}
	
	@Bean
	public poet poet() {
		return new poet("yu", "poet 이름", 5000);
	}
}
