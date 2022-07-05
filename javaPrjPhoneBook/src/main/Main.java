package main;

import java.util.Scanner;

public class Main {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("======== 전화번호부 ========");
		
		
		System.out.println("1. 새로운 연락처 저장");
		System.out.println("2. 저장된 연락처 가져오기");
		String input = sc.nextLine();
		
		if("1".equals(input)) {
			//전화번호 저장
			new SaveInfo().inputNameNum();
		} else if ("2".equals(input)) {
			//저장된 번호 가져오기
			new CheakInfo().inputName();
		}
	}

}
