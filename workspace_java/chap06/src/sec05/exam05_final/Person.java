package sec05.exam05_final;

public class Person {

	final String nation = "Korea";
	final String ssn;
	String name;
	
	//fianl
	// 값이 할당된 경우 변경할 수 없게 막아줌.
	Person(){
		// final의 값이 없던 경우
		// 생성자에서 딱 한 번 할당할 수 있다.
		// 생성자 전달인자로 받아서 할당하고 딱 한 번만 선언 가능하다.
		this.ssn = "주민번호"; 
		this.name = "이름";
//		this.nation = "japan"; final은 값을 바꿀 수 없다
		
//		this.ssn = "주민번호2"; << 그래서 안되는거임
		this.name = "이름2";
	}
	
	void test() {
//		this.ssn ="주민번호";
	}
	
}
