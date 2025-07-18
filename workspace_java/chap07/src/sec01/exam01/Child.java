package sec01.exam01;

public class Child extends Parent { //클래스는 하나만 상속 받을 수 있다.
		
	void printName() {
		System.out.println("Child의 printName실행");
		
		System.out.println("name :" + name);
		System.out.println("this.name :" + this.name);
		
		String pName = getName();
		System.out.println("pName :" + pName);
		
		System.out.println("super.name :" + super.name);
		
	}
//	 전달 인자가 필드를 가리는 형상
//	 shadow 
	void setName(String name) {
		this.name = name;
	}
	
//	 부모의 필드를 가리는 현상이다.
//	 overshadow
	String name = "Child의 name";
	
//	Child(){
//		super();
//	}										//  부모의 생성자 호출(생략 가능)
											// 첫 줄에 적어야 한다.
											// 전달인자를 맞춰줘야 한다.
	Child(){
//		this(1)                               // super() 와 this() 모두
											  // 첫 줄에 적어야 해서 같이 사용할 수 없다.
		super(1);  	
		System.out.println("Child 생성자");
	}
	Child(int a){
		super(1);
	}
	
	String getName(){
		System.out.println("Child의 getName실행");
		return this.name;
	}
	
}
