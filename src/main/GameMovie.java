package main;

import java.util.Scanner;

public class GameMovie {

	public static void main(String[] args) {
		/*
		 * 간단한 영화관 키오스크
		 * 1.영화/매점선택 while
		 * 2.선택에 따라 출력주기 if 
		 *     
		 * 3.중첩 if : 콤보인지 단품인지 출력
		 * 
		 * 총 세번의 입력 받을 것  영화, 매점, 콤보업글 
		 * 	 
		 * */	
		Scanner sc = new Scanner(System.in); //스캐너 메서드 사용
		
		while(true)  {	//첫번째 while문
			System.out.println("================영화 선택=================");
			System.out.println("액션, 호러, 로맨스");
			System.out.print("관람 하실 영화의 이름을 정확히 입력해주세요. > ");
			String input = sc.nextLine();
			System.out.println();
			
			if (input.equals("액션")) {
					System.out.println("관람하실 영화는 1관입니다.");
					break;

			} else if (input.equals("호러")) {
					System.out.println("관람하실 영화는 2관입니다.");
					break;
				
			} else if (input.equals("로맨스")) {
					System.out.println("관람하실 영화는 3관입니다.");
					break;
				
			} else {
					System.out.println("정확히 입력해주세요."); 
					System.out.println();
					continue; 
					}//if
		}//while 
		System.out.println();
		
		//두번째 while
		while(true) {	 
			System.out.println("===============매점 메뉴=================");
			System.out.println("(1)팝콘 (2)나쵸 (3)핫도그 (4)선택안함");
			System.out.print("메뉴를 번호로 선택해주세요. > ");
			int input2 = sc.nextInt();
			
			//(4)번과 잘못된 번호 선택이있기때문에 중간에 if문을 또 넣어주었다
			if (input2 > 5) { 
		    	System.out.println("잘못된 번호입니다.");
		    	continue;	//잘못선택하면 두번 째 while문으로 이동
			
			} else if (input2 == 4) {  //선택안하면 종료
		    	System.out.println("안녕히가세요."); 
		    	break; //완전 종료
		    }
	 
			
			System.out.print("콤보세트로 하시겠습니까? 예(1) 아니오(2) > ");
			int input3 = sc.nextInt();
			
			//팝콘 선택한 사용자만 통과 할 수 있게 중첩 if문 사용
			if (input2 == 1) {   
				if (input3 == 1) 
					System.out.println("주문하신 팝콘 콤보 나왔습니다.");
				else if (input3 == 2)
					System.out.println("주문하신 팝콘 단품 나왔습니다.");	
				
				else {
					System.out.println("잘못된 선택입니다.");
					continue;}
				
			
			//나쵸 선택한 사용자만 통과 할 수 있게 중첩 if문 사용
			} else if (input2 == 2) { 
				if (input3 == 1)
					System.out.println("주문하신 나쵸 콤보 나왔습니다.");
				else if (input3 == 2)
					System.out.println("주문하신 나쵸 단품 나왔습니다.");	
	
				else {
					System.out.println("잘못된 선택입니다.");
					continue;}
				
			
			//핫도그 선택한 사용자만 통과 할 수 있게 중첩 if문 사용
			} else if (input2 == 3) {
				if (input3 == 1)
					System.out.println("주문하신 핫도그 콤보 나왔습니다.");
				else if (input3 == 2)
					System.out.println("주문하신 핫도그 단품 나왔습니다.");	
				
				else {
					System.out.println("잘못된 선택입니다.");
					continue;}
		    	break;	
			} 
	}  		
		
 }//main
}//class