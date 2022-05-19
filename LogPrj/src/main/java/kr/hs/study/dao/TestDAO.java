package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

// 실제 쿼리 작성
@Component
public class TestDAO {
	
	// jdbc template 자동주입
	@Autowired
	private JdbcTemplate db;
	// db에 jdbctemplate 주소값이 듥어감
	// jdbcTemplate 실제 쿼리르 날려주는 애
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// Container에 있는 TestBean객체가 bean에 자동주입됨
		String sql = "insert into logprj values(?,?)";
		db.update(sql, bean.getId(), bean.getPassword());
	}
}
