package sec05.ecam02_static;


import sec04.exam01.method.Calculator;


public class CalcExam {
	int a = 10;
	public static void main(String[] args) {
	
		
		/*
		 * 
		 */
//			Calc c1 = new Calc();
		System.out.println("c1.pi은? " + Calc.pi);
		
		Calc c1 = new Calc();
		c1.color = "Black";
		c1.pi =3.141592;
		System.out.println("c1.pi은? " + c1.pi );

		Calc c2 = new Calc();
		c2.color = "White";
		System.out.println("c2.pi은? " + c2.pi);
	
		System.out.println(Math.PI);
		
		//2. test 메소드 사용하기
//		test(); // static이 아니라서 사용 못함
	
		test(); // 스택틱은 스택틱에서만.
	
	}
	
	// 1.메소드 명 test 만들기
		//전달인자 / 리턴타입 없음
	// 그냥 아무 말이나 출력
	static void test() {
		System.out.println("아무말");
		
		
		
		

		

	}
}
