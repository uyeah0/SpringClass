package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class magazine implements Book{
	
	@Value("yu")
	private String writer;
	
	@Value("magazine")
	private String bookName;
	
	@Value("100202")
	private int price;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}

	public void buy() {
		// TODO Auto-generated method stub
		System.out.println(writer + "의 잡지 '" + bookName + "'을 " + price + "원에 산다");
	}
	public void sell() {
		// TODO Auto-generated method stub
		
	}
	public void create() {
		// TODO Auto-generated method stub
	}
	public void print() {
		// TODO Auto-generated method stub
		buy();
	}
	
	public magazine() {
		
	}
	
	public magazine(String writer, String bookName, int price) {
		this.writer = writer;
		this.bookName = bookName;
		this.price = price;
	}

}
