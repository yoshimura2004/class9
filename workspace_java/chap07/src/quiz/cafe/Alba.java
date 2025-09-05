package quiz.cafe;

import java.util.Scanner;

public class Alba {
	
	void run(Cafe cafe) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("== " + cafe.name + " 매장 오픈 ==");
		cafe.showMenu();
		
		cafe.hire("suz");
		System.out.println("직원이 고용되었습니다.");
		
		System.out.print("주문할 메뉴를 입력하세요: ");
		String menuInput = scan.nextLine();

		if (!cafe.hasMenu(menuInput)) {
			System.out.println("없는 메뉴입니다. 다시 골라주세요");
			return;
		}

		cafe.takeOrder(menuInput);
		cafe.makeCoffee();
		
		int price = cafe.getPrice(menuInput);
		int change = cafe.pay(price, 10000);
		if (change != -1) {
			System.out.println("거스름돈: " + change + "원");
		}

		if (cafe instanceof Starbucks) {
			((Starbucks) cafe).discountEvent();
		} else if (cafe instanceof Compose) {
			((Compose) cafe).discountEvent();
		}
		
		cafe.serve();
		cafe.wash();
		cafe.close();
	}
	
	}

