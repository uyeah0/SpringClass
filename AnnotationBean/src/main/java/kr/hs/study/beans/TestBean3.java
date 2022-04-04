package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean3 {
	private int data1;
	private String data2;
	
	private DataBean3 data3;
	private DataBean4 data4;
	
	
	public TestBean3() {
		
	}
	// 생성자 주입
	// Autowired 자동으로 실행됨
	public TestBean3(DataBean3 data3, DataBean4 data4) {
		this.data3 = data3;
		this.data4 = data4;
	}
	public DataBean3 getData3() {
		return data3;
	}
	public DataBean4 getData4() {
		return data4;
	}
	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	
	// 기본형인 값을 초기화 시키는 annotation
	public TestBean3(int data1, @Value("안녕하세요")String data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	
}
