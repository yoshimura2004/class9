package sec01.exam03.override;

public class Computer extends Calc {
	
	
	@Override // 부모에 해당 매소드가 똑같이 선언되었는지 검사 해준다.
	// 다운로드를 받아서 내가 편하게 쓸 수 있게함. 대신 부모가 아닌 자식 것만
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return r*r*Math.PI;
	}
	
	@Override
	public int plus(int x, int y) {
		int result = super.plus(x, y);
		
		System.out.println("Computer의 plus 실행");
		System.out.println("정답은 바로바로" + result +"입니다");
	
		return result;
	}
}
