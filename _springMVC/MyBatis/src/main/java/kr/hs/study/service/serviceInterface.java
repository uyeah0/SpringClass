package kr.hs.study.service;

import java.util.List;

import kr.hs.study.model.DataBean;

public interface serviceInterface {
	public void insert(DataBean dto);
	public List<DataBean> select();
	public void update(DataBean dao);
}
