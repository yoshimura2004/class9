package sec04.exam03_return;

public class Calc {
	// 메소드 안에서 메소드 호출하기
	// 두 수를 입력받아 더한 결과를 돌려주는 메소드 plus
	
	//계산기
	//첫번째 수 입력 : 3엔터
	//연산자 입력 값 : +엔터
	//두번째 수 입력 : 5엔터
	//결과 : 3+5=8
	
	
	int plus( int x, int y){
		int result = x+y;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 나누기는 소수점이 나와야 한다.
	double avg( int x, int y){
		//값만 존재할 수 없는데 plus(x,y);
		double sum = plus(x,y);
		double result = (double)sum/2;
		return result;
	}
	
	void excute(int x1, int x2) {
		double result = avg(x1,x2);
		System.out.println(x1+"과"+x2+"의 평균은"+result);
	}
	

	
	
	
}
