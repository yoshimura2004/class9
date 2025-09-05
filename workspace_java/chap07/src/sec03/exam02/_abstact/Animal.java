package sec03.exam02._abstact;

public abstract class Animal {

	String kind;
	
	void breath() {
		System.out.println("숨수ㅕ");
	}
	
	// 추상 메소드
	// abstract 키워드가 붙은 메소드이다.
	// 실행블럭이 있으면 안된다 {} <-- 이색
	// 나는 구현하지 않고 자식한테 짬때림.
	abstract void sound();
	
	void love() {
		
	}
}
