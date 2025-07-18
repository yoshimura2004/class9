package sec01.exam03.override;

public class Calc {
	
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return r*r*Math.PI;
	}
	
	public int plus (int x, int y) {
		System.out.println("Calc, plus실행");
		return x + y;
	}
	
}
