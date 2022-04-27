package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.LoginTest;

// 실제 쿼리 작성
@Component // 개발자가 직접 작성한 bean 등록
public class LoginDAO {
	
	// jdbc template 자동주입
	@Autowired
	private JdbcTemplate db;
	// db에 jdbctemplate 주소값이 들어감
	// jdbcTemplate 실제 쿼리를 날려주는 애
	
	// insert
	public void insert_data(LoginTest bean) {
		// Container에 있는 LoginTest의 객체가 bean에 자동주입
		String sql = "insert into userTBL values(?, ?, ?)";
		db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername());
	}
	
	// 실제 db와 연결되어서 쿼리 실행
}
