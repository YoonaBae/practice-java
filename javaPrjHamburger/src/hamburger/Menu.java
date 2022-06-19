package hamburger;
//햄버거 메뉴 정보
public class Menu {
	//필드
	private String[] name = {"" ,"불고기 버거","치즈 버거","치킨 버거","시그니처 버거"};
	private String[] set = {"","세트(콜라+감자튀김)","+콜라","+감자튀김","단품"};
	private int [] price = {0,4500,4500,5000,6000};
	
	//배열 인덱스 = 사용자 입력
	public String getName(int inputName) {
		return this.name[inputName];
	}
	public String[] getName() {
		return name;
	}
	//배열 인덱스 = 사용자 입력
	public String getSet(int inputSet) {
		return this.set[inputSet];
	}
	
	public String[] getSet() {
		return set;
	}
	//세트 여부에 따라 가격 달라짐
	public int getPrice(int inputName, int inputSet) {
		
		if(inputSet == 1) {
			int result = this.price[inputName] += 2000;
			return result; 
	
		} else if (inputSet == 2) {
			int result = this.price[inputName] += 1000;
			return result;
		
		} else if (inputSet == 3) {
			int result = this.price[inputName] += 1500;
			return result;
		
		} else {
			int result =this.price[inputName] += 0;
			return result;
		}
	
	}


}// class
