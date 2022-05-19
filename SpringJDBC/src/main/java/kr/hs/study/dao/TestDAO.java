package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

// ���� ���� �ۼ��ϴ� ��
@Component
public class TestDAO {

	// jdbc template �ڵ�����
	@Autowired
	private JdbcTemplate db;
	// db�� jdbctemplate �ּҰ��� ��
	// jdbcTemplate ���� ������ �����ִ� ��
	
	// 1. insert
	public void insert_data(TestBean bean) {// testbean�� bean�� �ڵ����� �ּҰ����� ��
		// Container�� �ִ� TestBean�� ��ü�� bean�� �ڵ����Եȴ�.
		String sql = "insert into test values(?,?)";
		db.update(sql, bean.getData1(), bean.getData2());
	}
	
	// 2. update
	public void update_data(TestBean bean) {
		// TestBean bean = new TestBean(); => @Component �ڵ����� ����
		String sql = "update test set data2 = ? where data1 = ?";
		db.update(sql, bean.getData2(), bean.getData1());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
