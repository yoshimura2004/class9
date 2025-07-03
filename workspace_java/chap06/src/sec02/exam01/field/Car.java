package sec02.exam01.field;

public class Car {
	
	//필드
	
	
	//필드의 선언과 동시에 초기화
	String company = "현대자동차";
	String model = "그렌져";
	String color = "검정";
	int maxSpeed = 350;
	
	//필드 선언
	//초기화 하지 않은 경우
	// 생성할 때 0, false, null로 초기화 된다.
	int speed; 
	//필드에서 값을 선정하는 것은 안된다.
	// 필드 영역에는 실행(행동)하면 에러다
	// speed = 50; //speed의 값을 50으로 바꾸는 행동
	
}
