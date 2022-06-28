package kiosk;

import java.util.Scanner;

import menu.Menu;
import menu.drink.Ade;
import menu.drink.Beer;
import menu.drink.Coke;
import menu.main.Cream;
import menu.main.Rose;
import menu.main.Tomato;
import menu.main.Vongole;
import menu.side.Caesar;
import menu.side.Pizza;
import menu.side.Potato;
import order.Order;

public class Kiosk {
	private Scanner sc = new Scanner(System.in);
	
	public Order useKiosk() {
		boolean isTogo = cheakTogo();
		int mainMenu = selectMain();
		int side = selectSide();
		int drink = selectDrink();
		int price = 0;
		int cal = 0;
		Order order = new Order(isTogo,mainMenu,side,drink,price,cal);
		return order;
		
	}
	
	public void calc(Order o) {
		calcMain(o);
		calcSide(o);
		calcDrink(o);
	}
	
	
	
	private void calcDrink(Order o) {
		int n = o.getDrink();
		if(n == 1) {
			Menu m = new Coke();
			o.addPrice(m.getPrice());
			o.addCal(m.getCal());	
		}else if (n == 2) {
			Menu m = new Ade();
			o.addPrice(m.getPrice());
			o.addCal(m.getCal());
		}else if (n == 3) {
			Menu m = new Beer();
			o.addPrice(m.getPrice());
			o.addCal(m.getCal());
		}
		
	}

	private void calcSide(Order o) {
		int n = o.getSide();
		if(n==1) {
			Menu m = new Caesar();
			o.addCal(m.getCal());
			o.addPrice(m.getPrice());	
		}else if (n==2) {
			Menu m = new Pizza();
			o.addCal(m.getCal());
			o.addPrice(m.getPrice());
		}else if (n==3) {
			Menu m = new Potato();
			o.addCal(m.getCal());
			o.addPrice(m.getPrice());
		}
		
	}

	private void calcMain(Order o) {
		int n = o.getMainMenu();
		if(n==1) {
			Menu m = new Vongole();
			o.addCal(m.getCal());
			o.addPrice(m.getPrice());
		} else if (n==2) {
			Menu m = new Cream();
			o.addCal(m.getCal());
			o.addPrice(o.getPrice());
		} else if (n==3) {
			Menu m = new Tomato();
			o.addCal(m.getCal());
			o.addPrice(m.getPrice());
		} else if (n==4) {
			Menu m = new Rose();
			o.addCal(m.getCal());
			o.addPrice(m.getPrice());
		}
		
	}

	//포장 여부
	public boolean cheakTogo() {
		System.out.println("[Y]포장 / [N]매장");
		String result = sc.nextLine();
		
		if(result.equalsIgnoreCase("Y")) {
			return true;
		}else {
			return false;
		}
		
	}
	//메인 메뉴 선택
	public int selectMain() {
		 System.out.println("========= 메인 ========");
		 System.out.println("(1) 봉골레");
		 System.out.println("(2) 크림");
		 System.out.println("(3) 토마토");
		 System.out.println("(4) 로제");
		 
		 String result = sc.nextLine();
		 return Integer.parseInt(result);
	}
	//사이드 메뉴 선택
	public int selectSide() {
		System.out.println("========= 사이드 =========");
		System.out.println("(1) 시저샐러드");
		System.out.println("(2) 미니피자");
		System.out.println("(3) 버터감자구이");
		System.out.println("(4) 선택 안함");
		
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	//음료 선택
	public int selectDrink() {
		System.out.println("========= 음료 =========");
		System.out.println("(1) 콜라");
		System.out.println("(2) 에이드");
		System.out.println("(3) 맥주");
		System.out.println("(4) 선택 안함");
		
		String result = sc.nextLine();
		return Integer.parseInt(result);
	}
	
	
	
	
	
	
	
	
	
	
}
