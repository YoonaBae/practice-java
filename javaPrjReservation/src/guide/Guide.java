package guide;

import java.util.Scanner;

import guest.Guest;

public class Guide {
	Scanner sc = new Scanner(System.in);

	
	public Guest delivery() {
		int month = InputMonth();
		int day = InputDay();
		String name = InputName();
		int phone = InputPhone();
		
		return new Guest(month,day,name,phone);
		
	}
	
	private int InputMonth() {
		System.out.println("월을 입력해주세요.");
		
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	
	private int InputDay() {
		System.out.println("일을 입력해주세요.");
		
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	
	private String InputName() {
		System.out.println("성함을 입력해주세요.");
		
		return sc.nextLine();
	}
	
	private int InputPhone() {
		System.out.println("전화번호를 입력해주세요.(-빼고)");
		
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	
	public int cheak() {
		System.out.println("예약할 때 받은 번호 입력해주세요.");
		
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	

}
