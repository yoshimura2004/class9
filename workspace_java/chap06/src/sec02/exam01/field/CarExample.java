package sec02.exam01.field;

public class CarExample {
	static int a = 100;
	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car();
		
		//필드값 읽기
		System.out.println("제작회사:" +" "+ myCar.company);
		myCar.company = "포르쉐";
		System.out.println("새로운 차회사:"+ " " +myCar.company);
		System.out.println("모델명:"+" "+ myCar.model);
		System.out.println("칼라:" +" "+ myCar.color );
		System.out.println("최대속도:" +" " + myCar.maxSpeed);
		System.out.println("현재속도:" +" "+ myCar.speed);
		myCar.speed = 150;
		System.out.println(myCar.speed);
		
		Car myCar2 = new Car();
		System.out.println("제작회사:" +" "+ myCar2.company);
		
		
		
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도:"+" "+ myCar.speed);
		System.out.println(a);
		

	}

}
