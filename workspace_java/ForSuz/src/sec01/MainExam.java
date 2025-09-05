package sec01;

import java.util.Scanner;

public class MainExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CafeOrderSystem system = new CafeOrderSystem();
		
		while (true) {
			system.showMenu();
			System.out.println("주문하실 메뉴를 입력하세요");
			String input = scan.nextLine();
			
			system.order(input);
			
			System.out.println("다시 주문하실래요?");
			String again = scan.nextLine();
			if(again.equals("아니요")) {
				System.out.println("시스템종료");
				break;
			}

		}
		scan.close();
	}

}
