package kr.hs.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // ���������� ����� ���� ������̼� or �� ���
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {

}
