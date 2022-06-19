package hamburger;

public class Main {

	public static void main(String[] args) {
		//객체 생성
		Manager m = new Manager();
		Menu menu = new Menu();
		Control c = new Control();
		
		int resultPrice;   // 최종 가격 담을 변수
		int isDone;        // while문 조건식
		
		do {
			//메뉴 안내
			m.manager(menu.getName());
			
			//메인메뉴 고르기
			int inputMain = c.choice();
			String name = menu.getName(inputMain);
			m.manager(name,menu.getSet());
			
			//사이드 여부
			int inputSet = c.choice();
			String setName = menu.getSet(inputSet);
			
			
			//주문 확인
			resultPrice = menu.getPrice(inputMain, inputSet);
			
			m.manager(name,setName,resultPrice);
			
			//다시 선택
			m.done();
			isDone = c.choice(); 
		
		} while (isDone == 2); 
		//최종 결제
		System.out.println();
		System.out.print("결제 금액을 입력해주세요. > ");
		c.payment(resultPrice);
	}//main
}//class
