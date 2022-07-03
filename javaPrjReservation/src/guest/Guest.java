package guest;

import java.util.Map;

public class Guest {

	public Guest(int month, int day, String name, int phone) {
		this.month = month;
		this.day = day;
		this.name = name;
		this.phone = phone;
		
	}
	

	//필드
	private int month;
	private int day;
	private String name;
	private int phone;
	
	//게터세터
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	//toString
	@Override
	public String toString() {
		return name+" [예약 날짜 = "+month+"월 "+ day + "일 / 연락처 = " + phone + "]";
	}



	
	
	

	
}
