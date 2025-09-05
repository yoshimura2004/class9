package sec03.exam02._abstact;

public abstract class Windows {

	void boot() {
		System.out.println("CMOS 실행");
		System.out.println("Window 실행");
		start();
		System.out.println("...Loading...");
	}

	abstract void start();
//	abstract void deskTop();
	void deskTop() {
		
	}
	
	
	
}
