package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.TestBean;

@Component // 빈 만들기 위해
public class MapperClass implements RowMapper<TestBean>{

	@Override
	public TestBean mapRow(ResultSet rs, int rowNum) throws SQLException{
		TestBean bean = new TestBean();
		bean.setData1(rs.getInt("data1"));
		bean.setData2(rs.getString("data2"));
		
		return bean;
	}
}
