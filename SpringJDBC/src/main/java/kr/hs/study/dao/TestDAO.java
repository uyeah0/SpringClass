package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

// 실제 쿼리 작성하는 곳
@Component
public class TestDAO {

	// jdbc template 자동주입
	@Autowired
	private JdbcTemplate db;
	// db에 jdbctemplate 주소값이 들어감
	// jdbcTemplate 실제 쿼리를 날려주는 애
	
	// 1. insert
	public void insert_data(TestBean bean) {// testbean의 bean이 자동으로 주소값으로 됨
		// Container에 있는 TestBean의 객체가 bean에 자동주입된다.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	// 2. update
	public void update_data(TestBean bean) {
		// TestBean bean = new TestBean(); => @Component 자동으로 주입
		String sql = "update test set data2 = ? where data1 = ?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
