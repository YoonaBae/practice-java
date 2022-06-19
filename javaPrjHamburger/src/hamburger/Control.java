package hamburger;

import java.util.Scanner;

public class Control {
	Scanner sc = new Scanner(System.in);
	// 사용자 입력 메소드
	public int choice () {
		int inputNum = sc.nextInt();
		return inputNum;
	}
	// 결제
	public void payment(int price) {
		while(true) {
			int inputPay = sc.nextInt();
			if(inputPay == price) {
				System.out.println("맛있게 드세요~");
					break;
			} else if(inputPay < price) {
				System.out.print("금액을 확인해주시고 다시 입력해주세요. > ");
					continue;
			} else {
				int change = inputPay - price;
				System.out.println("잔돈 "+change+"원 드리겠습니다.");
				System.out.println("맛있게 드세요~");
					break;
			}
		}
	}
	
}
