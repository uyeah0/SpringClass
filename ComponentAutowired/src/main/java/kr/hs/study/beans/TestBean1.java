package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	@Autowired
	private DataBean1 data1;
	// dataBean1타입의 빈이 등록되어있다면, data1에 넣기
	
	// autowired는 자동으로 setter를 호출?
	
	@Autowired
	private DataBean2 data2;

	// Bean의 이름을 obj3으로 지정해서 data1, data2, data3 출력
	@Autowired
	@Qualifier("obj3") //이름이 obj3인 객체를 가지고 와서 주입해라
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
