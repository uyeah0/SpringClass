package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.model.DataBean;

@Repository
public class daoImpl implements daoInterface {

	@Autowired
	private SqlSessionTemplate sqlsession;
	//�갡 ������ ��� �����ؼ� mapper.xml�� �ִ� ���� ������ ��
	public void insert(DataBean dto) {
		// TODO Auto-generated method stub
		sqlsession.insert("test.insert_data", dto);
	}
	@Override
	public List<DataBean> select() {
		// TODO Auto-generated method stub
		return sqlsession.selectList("test.select_data");
	}
	@Override
	public void update(DataBean dto) {
		// TODO Auto-generated method stub
		sqlsession.update("test.update_data", dto);
	}

}
