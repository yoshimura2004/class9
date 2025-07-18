package quiz.cafe; //활용클래스

public class Alba {
	
	void run(Cafe cafe) {
		System.out.println("== " + cafe.name + " 매장 오픈 ==");
		
		cafe.showMenu();
		cafe.hire("직원 고용");
		System.out.println("직원이 고용되었습니다.");
		cafe.takeOrder("주문한 커피");
		cafe.makeCoffee();
		cafe.serve();
		cafe.wash();
		
		int change = cafe.pay(4000, 5000);
		if (change != -1) {
			System.out.println("거스름돈: " + change + "원");
		}

		
	
	}
}
