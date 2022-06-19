package hamburger;

public class Manager {
	//안내
	public void choice () {
		System.out.print("번호로 입력해주세요. > ");
	}
	
	public void manager (String[] name) {
		System.out.println("===================== 메인 메뉴 =====================");
		System.out.println("(1)"+name[1]+" / (2)"+name[2]+" / (3)"+name[3]+" / (4)"+name[4]);
		choice();
	}
	public void manager (String menu,String[] side) {
		System.out.println();
		System.out.println(menu+"를 고르셨습니다.");
		System.out.println();
		System.out.println("==================== 사이드 메뉴 ====================");
		System.out.println("(1)"+side[1]+" / (2)"+side[2]+" / (3)"+side[3]+" / (4)"+side[4]);
		choice();
	}
	
	public void manager (String menu, String set, int price) {
		System.out.println();
		System.out.println("================== 주문 확인 ==================");
		System.out.println(menu+" "+set+" 하셔서 총 "+price+"원 입니다~");
	}
	public void done () {
		System.out.println("----------------------------------------------");
		System.out.println("선택하신 메뉴로 하시겠습니까?");
		System.out.println("(1)예 / (2)다시 선택");
		choice();
	}
}
