package FUS;

public class Animal {

	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("안녕하세요! 저는 " +name+ "이고 " +age+ "살이에요");
	}
	
	
}
