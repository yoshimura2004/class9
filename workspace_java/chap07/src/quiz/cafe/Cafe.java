package quiz.cafe; //부모클래스

import java.util.ArrayList;
import java.util.Random;

public class Cafe {
	
	String name; 
	String building; 
	ArrayList menu = new ArrayList();
	ArrayList item = new ArrayList(); 
	ArrayList staff = new ArrayList();

	//카페 이름
	public Cafe(String name, String building) {
		this.name = name;
		this.building = building;
	}

	//메뉴 추가
	void addMenu(String menuName, int price) {
		menu.add(menuName + ":" + price); 
	}

	// 직원 고용
	void hire(String staffName) {
		staff.add(staffName);
		System.out.println("직원이 고용되었습니다");
	}

	// 주문 받기
	void takeOrder(String menuName) {
		System.out.println(menuName + " 주문을 받았습니다.");
	}
	
	// 메뉴 이름이 있는지 확인
	boolean hasMenu(String name) {
		for (int i = 0; i < menu.size(); i++) {
			String data = (String) menu.get(i);
			String menuName = data.split(":")[0];
			if (menuName.equals(name)) {
				return true;
			}
		}
		return false;
	}

	// 메뉴 가격 얻기
	int getPrice(String name) {
		for (int i = 0; i < menu.size(); i++) {
			String data = (String) menu.get(i);
			String[] parts = data.split(":");
			if (parts[0].equals(name)) {
				return Integer.parseInt(parts[1]);
			}
		}
		return 0;
	}
	
	// 결제 
	int pay(int price, int money) {
		if (money < price) {
			System.out.println("돈이 부족합니다!");
			return -1;
		}
		System.out.println("결제가 완료되었습니다.");
		return money - price;
	}
	
	// 커피 만들기
	void makeCoffee() {
		Random r = new Random();
		int result = r.nextInt(101); 
		if (result == 100) {
			System.out.println("굉장한 커피가 나왔습니다!");
		}  if (result > 50) {
			System.out.println("맛있는커피가 나왔습니다!");
		}  if (result <= 50) {
			System.out.println("커피가 평소보다 잘 안나왔습니다");
		}
		else if(result == 0) {
			System.out.println("커피가 조금 타버렸어요 죄송합니다.");
		}
	}
	
	// 서빙
	void serve() {
		System.out.println("커피를 서빙했습니다!");
	}
	// 설거지
	void wash() {
		System.out.println("설거지 완료!");
	}

	// 마감
	void close() {
		System.out.println(name + " 카페 마감합니다.");
	}
	
	// 메뉴 출력
	void showMenu() {
		System.out.println("="+ name + "메뉴판=");
		for (int i = 0; i < menu.size(); i++) {
			System.out.println(menu.get(i));
		
		}
	}
}
