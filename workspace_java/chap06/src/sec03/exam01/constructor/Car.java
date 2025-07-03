package sec03.exam01.constructor;

public class Car {

	String model = "아반떼";
	String color;
	int maxSpeed;
//	
//	Car(){
//		color = "red";
//	}


	// 생성자를 생략한 경우
	// 기본생성자가 자동 완성된다.
	// 보통 생성자는 필드 값 초기화 하는데 많이 사용된다.
	
	//if
	//for
	//test

	// 생성자가 하나라도 선언되어 있으면
//기본 생성자는 만들어지지 않는다.

//	Car(String c){
//		color = c;
//	}
	
	Car(String c){
//		color = c;
//		model = "아반떼";
//		maxSpeed = 240;
		this("아반떼", c, 240);// 무조건 첫 번 째 줄에 있어야한다.
							
		
	}
	
	Car(String m, String c, int s){
		model = m;
		color = c;
		maxSpeed = s;
	}

	void test () {
		
	}
	
//	void setColor() {
//		String color;
//		color = "red"; //보다 구체적인 부분이 먼저 실행 된다.
//	}
	
	void setColor(String color) {
		this.color = color;
//		this.test();
	}
	
	
	
}
