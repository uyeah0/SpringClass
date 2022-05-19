package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// db ���̺� �� ���� �����ϰų�,
// db ���̺��� �������� ���� �����ϴ� �� => dto ���� �ӽ÷� ����Ǵ� ��
@Component
@Scope("prototype") // ��ü�� �����
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
