package main;

public class GameLunch {
	//Math.random(); 이용한 점심메뉴 고르기
	public static void main(String[] args) {

			int lunch =(int)(Math.random()*4)+1;
		   	
			if (lunch == 1) 
				System.out.println("한식");
			else if (lunch == 2)
		   		System.out.println("양식");
			else if (lunch == 3)
		   		System.out.println("중식");
			else 
		   		System.out.println("일식");
				 
					   
				
		
 }
}