package main;

import java.util.Scanner;

public class Game02 {
	//성향테스트
	public static void main(String[] args) {
		System.out.println("쉬는 날 당신은 무엇을 하십니까?");
		System.out.println("1.집콕 2.친구들과 만남 3.여행");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 선택은 ?");
		int num = scan.nextInt();
		
		System.out.println("=======결과=======");
		if (num == 1) {
			System.out.println("집에서 에너지를 받는타입이군요!");
		} else if (num == 2) {
			System.out.println("주변사람들을 기분좋게 해주는 해피바이러스~");
		} else if (num == 3) {
			System.out.println("엄청난 에너자이너시네요");
		} else {
			System.out.println("번호를 잘 못 입력하셨습니다.");
		}

	}

}
