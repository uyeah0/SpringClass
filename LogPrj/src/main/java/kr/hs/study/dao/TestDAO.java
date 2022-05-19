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
	
	public void update_data(TestBean bean) {
		// Container�� �ִ� TestBean��ü�� bean�� �ڵ����Ե�
		String sql = "update logprj set password = ? where id = ?";
		db.update(sql, bean.getPassword(), bean.getId());
	}
	
	// 3. delete
		public void delete_data(TestBean bean) {
			// Container�� �ִ� TestBean��ü�� bean�� �ڵ����Ե�
			String sql = "delete from logprj where id= ?";
			db.update(sql, bean.getId());
		}
}
