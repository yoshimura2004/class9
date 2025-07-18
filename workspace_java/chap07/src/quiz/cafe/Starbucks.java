package quiz.cafe; //자식2

public class Starbucks extends Cafe {
		
	Starbucks(String building) {
		super("스타벅스", building);
	}

	void discountEvent() {
		System.out.println("스타벅스 할인 이벤트");
	}
}
