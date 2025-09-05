package sec01;

public class MenuItem {
	String name;
	int price;
	
	public MenuItem(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	void info () {
		System.out.println(name + ":" + price + "won");
	}
}
