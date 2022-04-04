package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;

public class TestBean3 {
	private int data1;
	private String data2;
	
	private DataBean3 data3;
	private DataBean4 data4;
	
	
	public TestBean3() {
		
	}
	// ������ ����
	// Autowired �ڵ����� �����
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
	
	// �⺻���� ���� �ʱ�ȭ ��Ű�� annotation
	public TestBean3(int data1, @Value("�ȳ��ϼ���")String data2, DataBean3 data3, DataBean4 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	
}
