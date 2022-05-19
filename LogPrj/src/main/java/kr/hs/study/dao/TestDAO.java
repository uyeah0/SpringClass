package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

// ���� ���� �ۼ�
@Component
public class TestDAO {
	
	// jdbc template �ڵ�����
	@Autowired
	private JdbcTemplate db;
	// db�� jdbctemplate �ּҰ��� �Ѿ
	// jdbcTemplate ���� ������ �����ִ� ��
	
	// 1. insert
	public void insert_data(TestBean bean) {
		// Container�� �ִ� TestBean��ü�� bean�� �ڵ����Ե�
		String sql = "insert into logprj values(?,?)";
		db.update(sql, bean.getId(), bean.getPassword());
	}
}
