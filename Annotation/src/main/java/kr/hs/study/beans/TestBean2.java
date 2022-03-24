package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean2 {
	
	@Autowired // d1 지정 안해줘도 데이터 들어감
	@Qualifier("d1")
	private DataBean2 data1;
	
	@Autowired
	@Qualifier("d2")
	private DataBean2 data2;

	
	public DataBean2 getData1() {
		return data1;
	}


	public DataBean2 getData2() {
		return data2;
	}


	public void setData1(DataBean2 data1) {
		this.data1 = data1;
	}


	public void setData2(DataBean2 data2) {
		this.data2 = data2;
	}

	public TestBean2() {
		
	}

	public TestBean2(DataBean2 data1, DataBean2 data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	
}
