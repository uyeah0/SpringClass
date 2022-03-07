package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKr;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloWorldEn HE = ctx.getBean("HE", HelloWorldEn.class);
		System.out.println("HE : " + HE);
		
		HelloWorldKr HK = ctx.getBean("HK", HelloWorldKr.class);
		System.out.println("HK : " + HK);
	}

	
}
