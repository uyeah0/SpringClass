package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class poet implements Book{
	
	
	@Value("park")
	private String writer;
	
	@Value("poet")
	private String bookName;
	
	@Value("2000000")
	private int price;
	
	public String getWriter() {
		return writer;
	}
	public String getBookName() {
		return bookName;
	}
	public int getPrice() {
		return price;
	}
	
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println(writer + "의 시 '" + bookName + "'을 " + price + "원에 산다");
	}
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	public void print() {
		// TODO Auto-generated method stub
		buy();
	}
	public void create() {
		// TODO Auto-generated method stub
	}
	
	public poet() {
		
	}
	
	public poet(String writer, String bookName, int price) {
		this.writer = writer;
		this.bookName = bookName;
		this.price = price;
	}

}
