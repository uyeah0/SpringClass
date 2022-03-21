package kr.hs.study.beans;

public class poet implements Book{
	private String writer;
	private String bookName;
	private int price; 
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
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
	

}
