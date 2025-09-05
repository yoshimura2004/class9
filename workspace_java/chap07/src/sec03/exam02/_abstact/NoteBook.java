package sec03.exam02._abstact;

public class NoteBook extends Windows {

	@Override
	void start() {
		System.out.println("카톡 고!");
		System.out.println("디코 고!");
	}

	// 자바스크립트는 콜백함수가 있어서, 추상이 필요가 없다
	// 유지보수를 편하게 할 수 있다.
	// 자바는 콜백이 없으니까 override한 
}
