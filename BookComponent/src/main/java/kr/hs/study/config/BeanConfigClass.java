package kr.hs.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정파일을 만들기 위한 어노테이션 or 빈 등록
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {

}
