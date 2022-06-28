package main;

import kiosk.Kiosk;
import order.Order;

public class Main {

	public static void main(String[] args) {

		System.out.println("======어서오세요 원하는 메뉴의 번호를 입력해주세요======");
		
		Kiosk kiosk = new Kiosk();
		Order order = kiosk.useKiosk();
		kiosk.calc(order);
		
		System.out.println(order);
	
	}

}
