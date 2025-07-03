package sec06.exam02.pack3;

import sec06.exam02.pack2.Access2;

public class AccessExam {

	public static void main(String[] args) {
		
//		public이 아니어서 생성 못함.
//		Access1 a1 = new Access2();
		// 기본 생성자는 public이 붙는다.	
		
		Access2 a2 = new Access2();
//		a2.test1(); public 아님
		a2.test2(); //public
	}

}
