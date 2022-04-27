package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// db ���̺��� �� �� ����
// db ���̺��� �������� �� ����
@Component
@Scope("prototype") // ��ü�� �����
public class LoginTest {
	private String userid;
	private String userpass;
	private String username;
	public String getUserid() {
		return userid;
	}
	public String getUserpass() {
		return userpass;
	}
	public String getUsername() {
		return username;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
	
}
