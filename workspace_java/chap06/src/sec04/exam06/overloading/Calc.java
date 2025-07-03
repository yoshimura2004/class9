package sec04.exam06.overloading;

public class Calc {

//	int plus( int x, int y){
//		int result = x+y;
//		System.out.println("int int 실행");
//		return result;
//	}
//	// 전달인자가 int int 로 같기 때문에 overloading불가능;
//		int plus( int x, int y){
//			int result = x+y;
//			return result;
//	}
	
	double plus(double x, double y) {
		System.out.println("더블더블 실행 ");
		return x + y;
	}
//		
		double plus(int x, double y) {
			System.out.println("int double 실행 ");
			return x + y;
		}
//			int plus( int p, int x){
//				int result = x+y;		
//			}
//  		타입이 같으면 실행이 안된다.
			
			
			
			
	}
	
