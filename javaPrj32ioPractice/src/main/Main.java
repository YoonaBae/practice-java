package main;

import java.util.Scanner;

public class Main {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("======= 홈페이지 =======");
		
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		String input = sc.nextLine();
		
		if("1".equals(input)) {
			//1 선택 시 회원가입
			new MemberJoin().join();
		} else if("2".equals(input)) {
			//2 선택 시 로그인
			new MemberLogin().login();
			
		}
		
		
	}
}
