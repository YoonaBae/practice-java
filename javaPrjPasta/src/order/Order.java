package order;

public class Order {
	
	public Order(boolean isTogo, int mainMenu, int side, int drink,int price,int cal) {
		
		this.isTogo = isTogo;
		this.mainMenu = mainMenu;
		this.side = side;
		this.drink = drink;
		this.price = price;
		this.cal = cal;
	}
	
	private boolean isTogo;
	private int mainMenu;
	private int side;
	private int drink;
	private int price;
	private int cal;
	
	public boolean isTogo() {
		return isTogo;
	}
	public void setTogo(boolean isTogo) {
		this.isTogo = isTogo;
	}

	public int getMainMenu() {
		return mainMenu;
	}
	public void setMainMenu(int mainMenu) {
		this.mainMenu = mainMenu;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getDrink() {
		return drink;
	}
	public void setDrink(int drink) {
		this.drink = drink;
	}
	
	public int getPrice() {
		return price;
	}
	public void addPrice(int price) {
		this.price += price;
	}
	public int getCal() {
		return cal;
	}
	public void addCal(int cal) {
		this.cal += cal;
	}
	@Override
	public String toString() {
		return "Order [isTogo=" + isTogo + ", mainMenu=" + mainMenu + ", side=" + side + ", drink=" + drink + ", price="
				+ price + ", cal=" + cal + "]";
	}
 
	
	

}
