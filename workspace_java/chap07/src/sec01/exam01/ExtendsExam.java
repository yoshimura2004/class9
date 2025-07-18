package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		//Child 를 생성해서
		Child c	= new Child();
		System.out.println("---------------------------");
		// printName 실행	//메소드 재정의 아주 중요하다.
		// 더 강하게 재정의 할 수 없다.
		c.printName();
		
		System.out.println("c.name의 값" + c.name);
		
		System.out.println("child의 getName:"+ c.getName());
		c.setName ("바뀐 이름");
		System.out.println(c.getName());
		
}

		
}
