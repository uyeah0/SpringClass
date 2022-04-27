package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.LoginTest;

// ���� ���� �ۼ�
@Component // �����ڰ� ���� �ۼ��� bean ���
public class LoginDAO {
	
	// jdbc template �ڵ�����
	@Autowired
	private JdbcTemplate db;
	// db�� jdbctemplate �ּҰ��� ��
	// jdbcTemplate ���� ������ �����ִ� ��
	
	// insert
	public void insert_data(LoginTest bean) {
		// Container�� �ִ� LoginTest�� ��ü�� bean�� �ڵ�����
		String sql = "insert into userTBL values(?, ?, ?)";
		db.update(sql, bean.getUserid(), bean.getUserpass(), bean.getUsername());
	}
	
	// ���� db�� ����Ǿ ���� ����
}
