package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.model.DataBean;

public interface daoInterface {
	public void insert(DataBean dto);
	public List<DataBean> select();
	public void update(DataBean dto);
}
