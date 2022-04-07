package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	@Autowired
	private DataBean1 data1;
	// dataBean1Ÿ���� ���� ��ϵǾ��ִٸ�, data1�� �ֱ�
	
	// autowired�� �ڵ����� setter�� ȣ��?
	
	@Autowired
	private DataBean2 data2;

	// Bean�� �̸��� obj3���� �����ؼ� data1, data2, data3 ���
	@Autowired
	@Qualifier("obj3") //�̸��� obj3�� ��ü�� ������ �ͼ� �����ض�
	private DataBean3 data3;
	
	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}
	
	
}
