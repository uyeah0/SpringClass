package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.daoInterface;
import kr.hs.study.model.DataBean;

@Service
public class serviceImpl implements serviceInterface {
	@Autowired
	private daoInterface dao;
	@Override
	public void insert(DataBean dto) {
		dao.insert(dto);

	}
	@Override
	public List<DataBean> select() {
		// TODO Auto-generated method stub
		return dao.select();
	}
	@Override
	public void update(DataBean dto) {
		// TODO Auto-generated method stub
		dao.update(dto);
	}


}
