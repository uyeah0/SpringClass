package kr.hs.study.beans;

public class Publisher implements Employee{

	private int startTime;
	private int endTime;
	
	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("�ۺ��� " + startTime + "�� ���");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("�ۺ��� " + endTime + "�� ���");
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
	public Publisher() {
		
	}
	
	public Publisher(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

}
