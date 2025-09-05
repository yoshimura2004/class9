package quiz.cafe; // 부모

public class Electronic {
	
	String brand;
	 int price;
	 
	 public Electronic(String brand, int price) {
		 this.brand = brand;
		 this.price = price;
	 }
	 
	 void info (){
		 System.out.println("brand : "+ brand + " price : " + price);
	 }
}
