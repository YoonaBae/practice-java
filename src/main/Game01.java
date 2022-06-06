package main;
import java.util.Scanner;
public class Game01 {
		//기온별 옷차림
	public static void main(String[] args) {
		//1.사용자에게 입력받기
		System.out.println("현재 기온을 입력해주세요.");	
		Scanner scan = new Scanner(System.in);
		double input = scan.nextDouble();
		
		//2.출력 받을 변수선언
		String cloth;
		//3.조건식이 맞으면 변수에 넣어주기
		if (input >= 23) {
			cloth = "린넨,반바지,반팔";
		} else if (input >= 19 ) {
			cloth = "얇은셔츠,블라우스";
		} else if (input >= 12) {
			cloth = "자켓,후드,니트";
		} else if (input >= 8) {
			cloth = "코트,야상";
		} else if (input >= 4) {
			cloth = "울코트,가죽옷";
		} else {
			cloth = "패딩,롱패딩";
		}
			
		//4.출력
		System.out.println("현재 "+cloth+"종류의 옷을 입으면 됩니다~");
	}

}
