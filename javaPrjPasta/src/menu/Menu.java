package menu;

public class Menu {
	public Menu (int price,int cal) {
		this.cal = cal;
		this.price = price;
				
	}
	
	private int price;
	private int cal;
	
	public int getPrice() {
		return price;
	}

	public int getCal() {
		return cal;
	}

}
