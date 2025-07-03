package sec04.exam03_return;

public class StudentExam {

	public static void main(String[] args) {
	

		// 학생 클래스를 만들고
	//이름과 나이 필드를 만든다.
	//학생 Exam클래스를 만들고
	//학생 2명을 각각 등록하고
	//두 학생의 정보를 각각 출력.
	
	//메소드
	// 메소드를 통해서 이름과 나이를 전달해서 저장하기
	// 메소드를 통해서 이름과 나이를 돌려받아서 출력하기.
	
		Student s1 = new Student();
		s1.name = "suz";
		s1.age = 21;
		
		System.out.println("학생 이름은?" + " " + s1.name);
		System.out.println("그 학생의 나이는?"+ " " + s1.age);

		
		
		Student s2 = new Student();
		s2.name = "lyuo";
		s2.age = 23;
		
		System.out.println("학생 이름은?" + " " + s2.name);
		System.out.println("그 학생의 나이는?"+ " " + s2.age);
		
	
		
		
	
		
		String name = s1.getName();
		System.out.println("이름:" + name);
		
		int age = s1.getAge();
		System.out.println("나이: " +  age);
	

		
		
		
		
		
		
	}

}
