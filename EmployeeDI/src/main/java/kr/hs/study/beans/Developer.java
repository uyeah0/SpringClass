package kr.hs.study.beans;

public class Developer implements Employee{

	private int startTime;
	private int endTime;
	
	public void Checkin() {
		// TODO Auto-generated method stub
		System.out.println("개발자 " + startTime + "시 출근");
	}

	public void Checkout() {
		// TODO Auto-generated method stub
		System.out.println("개발자 " + endTime + "시 퇴근");
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
	
	public Developer() {
	}
	
	public Developer(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
}
