package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration // ���������� ����� ���� annotation or bean ���
@ComponentScan(basePackages= {"kr.hs.study.beans", "kr.hs.study.dao"})
public class BeanConfigClass {
	// �����ͺ��̽� ���� ����(BasicDataSource ���)
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		
		return source;
	}
	
	// db�� �����ؼ� ���� ������ �����ϴ� ���� bean���� ���
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}
