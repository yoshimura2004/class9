package sec04.exam03_return;

public class Student {

	// 학생 클래스를 만들고
		//이름과 나이 필드를 만든다.
		//학생 Exam클래스를 만들고
		//학생 2명을 각각 등록하고
		//두 학생의 정보를 각각 출력.
		
		//메소드
		// 메소드를 통해서 이름과 나이를 전달해서 저장하기
		// 메소드를 통해서 이름과 나이를 돌려받아서 출력하기.
	
	String name;
	int age;
	
	void setName(String n) {
		name = n;
	}
	
	String getName() {
			return name;
	}
	
	int getAge() {
		return age;
	}
	
	
	
	// 이름과 나이를 받아서 저장하는 메소드
	// 메소드명:setInfo
	// 전달인자: String n, int a
	// 리턴타입: void
	
	
	
}
