package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// db 테이블에 들어갈 값을 저장하거나,
// db 테이블에서 가져오는 값을 저장하는 곳 => dto 값이 임시로 저장되는 곳
@Component
@Scope("prototype") // 객체로 만들기
public class TestBean {
	private String id;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
