package Quiz;

public class FrootExam {

	public static void main(String[] args) {
		
		//가게 이름설정//
	 FrootShop shop = new FrootShop("suz네 과일가게");
	//가게 재고 확인//
	shop.printAll();
	//주문//
	System.out.println("사과 3개 가격: " + shop.getPrice("사과", 3) + "원");
	// 계산 //
	int change = shop.buy("사과", 3 , 5000);
	// 거스름돈 //
	System.out.println("거스름돈: " + change + "원");
	// 딸배 //
	shop.delivery("천안시 동남구", "바나나", 15);
	
	shop.printAll(); // 변경된 재고 확인

	}
}	