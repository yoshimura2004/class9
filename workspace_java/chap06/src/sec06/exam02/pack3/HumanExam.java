package sec06.exam02.pack3;

import sec06.exam02.pack2.Human;
//import sec06.exam02.pack1.Human; 동일한 클래스명이어서 안됨.

import sec06.exam02.pack1.*;


public class HumanExam {

	public static void main(String[] args) {
		
//		new Human(); // pack2 에 있는 Human 
		
//		new sec06.exam02.pack1.Human();
//		new sec06.exam02.pack1.Human();
		
		
//		import sec06.exam02.pack1.*;
		new Human(); // pack1.Human은 됨
//		
//		new Sub1(); //이건 안됨 //pack1.Sub1.Sub1 // 하위 패키지의 클래스라서 못 가져옴
		// 위 코드가 실행될려면 Sub1 을 부쳐야한다
		
		String a = "1";				
		System.out.println();	// 이 삼형제는 import java.lang 출신으로 자동 선언 된다.
		Math.random();				// 즉 import 생략이 가능하다.
		
		
		
	}

}
