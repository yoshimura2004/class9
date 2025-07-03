package sec04.exam01.method;

public class Calculator {
	
	// 전원 켜기 메소드
	void powerOn() {
		System.out.println("전원 on");	
	}
	
	// 메소드 명 powerOff; powerOn과 동일하게
	// 선언하는 ()괄호!
	void powerOff() {
		System.out.println("전원 off");
	}

	/**
	 * 
	 * 	JAVADOC 주석
	 * 
	 *  더하기 기능을 만든다. 
	 *  두 수를 입력받아서, 더한 결과를 돌려준다.
	 *  
	 *  메소드명: plus 
	 *  전달인자: int x, int y
	 *  리턴타입: int (x+y의 결과)
	 *  
	 *  @param  int x, int y
	 *  @return int x+y
	 *  @author kksik@naver.com
	 *  
	 *  
	 */
	int plus(int x, int y) {
		System.out.println("x :"+ x);
		System.out.println("y :"+ y);
		
		int result = x + y;
		
		return result;
	}
	/** 	
	 * 	나누기 기능을 만든다. 
	 *  두 정수를 입력받아서, 나눈 결과를 돌려준다.
	 *  단 y가 0일때는 안된다.
	 *  메소드명: divide 
	 *  전달인자: int a, int b
	 *  리턴타입: double (x/y의 결과)
		*/
		
		double divide (int a, int b) {
			System.out.println("a :"+ a);
			System.out.println("b :"+ b);
			
			double result2 = (double)a/(double)b;
		if(b==0) {
			System.out.println("안된다");
			return 0;
		}
			return result2;
		}
			/** 뺄셈 만들기
			 * 두 정수를 입력받아서 뺀 값을 돌려준다.
			 메소드명: minus
			 전달인자: int i, int j
			  리턴타입: int (i-j의 값)
			*/
			int minus(int x1, int y1) {
				System.out.println("x :"+ x1);
				System.out.println("y :"+ y1);
				
				int result3 = x1 - y1;
				
				return result3;
		}
		//int 배열의 모든 값을 더하는 메소드
			int sum(int[] array) {
				int sum = 0;
				for(int i = 0; i<array.length; i++) {
					sum+= array[i];
				}
				return sum;
			}
			//가변 인자, 전개연산자 spread op
			//보내는 곳에서는 sum2(1,2,3,4)
			// 내부에선 배열로 취급한다.
			
			
			
	}
	
	


