package kr.hs.study.config;

import org.springframework.context.annotation.Bean;

import org.springframework.stereotype.Component;

import kr.hs.study.beans.Person;
import kr.hs.study.beans.Test;


@Component
public class BeanConfigClass {


	@Bean
	public Test javac1() {
		return new Test(new Person("유예영", 19, "밥"), new Person("kim", 18, "과자"));
	}
	
}
