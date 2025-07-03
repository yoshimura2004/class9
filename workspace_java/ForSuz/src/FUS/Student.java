package FUS;

public class Student {
	
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("이름: " + name + ", 나이: "+ age);
	}

	
	
	
}
