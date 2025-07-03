package sec05.ecam02_static;

import java.util.Scanner;

public class Calc {
	
	String color;
	//  static이긴 하지만 필드에 불과하다.
	static double pi = 3.14; //임마가 선발대에용

	int a= 10;
	
	static int price;
//	price = 100; 
	static {
		System.out.println("값을 입력하세요");
//		Scanner s = new Scanner(System.in);
//		price = s.nextInt();
	}
	// 생성자에서는 생성자 블록을 쓸 수 있는 것이 따로 있다.
	Calc(){
		price = 10000;
	}
	
	
}
