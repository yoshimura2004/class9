package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. 커피 2. 차 0. 종료
		
		System.out.println("메뉴를 고르세요");
		System.out.println("1.coffe, 2.tea, 0.close");
		Scanner scan = new Scanner(System.in);
		
		int menu = scan.nextInt();
		

		if(menu == 1 ) {
			System.out.println("커피가져가요");
		} else if(menu == 2) {
			System.out.println("차 가져가요");
		} else if(menu == 0) {
			System.out.println("주문 종료해요");
		} else {
			System.out.println("주문을 확인하세요");
		}
		

		
		
		menu = scan.nextInt();
		
		if(menu ==1 ) {
			System.out.println("커피가져가요");
		} else if(menu == 2) {
			System.out.println("차 가져가요");
		} else if(menu == 0) {
			System.out.println("주문 종료해요");
		} else {
			System.out.println("주문을 확인하세요");
		}
			
		
		
		
		
		
		
		
		
		
		
	}

}
