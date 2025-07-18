package sec02.exam01.driver;

public class Tico extends Car {

	@Override
	void run() {
		System.out.println("아이스크림 꺼내~");
	}
	
	void autoRun() {
		System.out.println("아이스크림 녹아욧");
	}
}
