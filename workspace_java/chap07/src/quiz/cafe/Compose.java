package quiz.cafe; //자식1

public class Compose extends Cafe {
	
	Compose (String building) {
		super("컴포즈", building);
	}
	
	void discountEvent() {
		System.out.println("컴포즈 할인 이벤트");
	}
}
