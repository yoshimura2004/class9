package quiz.cafe; // 자식

public class Laptop extends Electronic {
	
	double weight;
	
	 Laptop(String brand, int price, double weight) {
		super(brand, price);
		this.weight = weight;
	}
	 
	 void info () {
		 System.out.println("brand명: " + brand + " 가격:" + price + " 무게: " + weight);
	 }
	 
}
