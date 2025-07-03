package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
//			}
//		System.out.println("1~100의합 :" + sum);
//		
//		
//		
//		// 1씩 증가 하는걸 10번 하고 싶다.
////		int sum = 0;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
////		sum = sum +1;
//		
//		int sum2 = 0;
//		for (int i =1; i<=10; i++) {
//			sum2 = sum2 + 1;
//		}
//		System.out.println("1을 10번 더한 값 :" + sum2);
//		// for무느로 변경
		// 구구단 2단을 출력하시오
		
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기.
		 * 	ctrl + c, v 했을 때 바뀌지 않는 것
		 * 
		 * 2. 반복 되지 않는 것에서
		 * 	규칙(패턴)을 찾는다.
		 * 	변수를 활용해서 더 이상 바뀌지 않게 만들기.
		 * 
		 * 3. 시작 조건
		 * 
		 * 4. 종료 조건
		 * 
		 * for: 반복 횟수를 아는 경우
		 * while: 반복 횟수를 모르는 경우
		 * 
		 */
		// 1. 2부터 10 까지 중 짝 수만 출력
		
		
		for (int as = 2; as <= 10; as= as+2) {
			
			System.out.println("as의 값 :" + as);
			}
		
		// 2. 10부터 1까지 거꾸로 출력
		
		for (int gg = 10; gg >=1;  gg--) {
			System.out.println("gg의 값:"+ gg);
		}
		
		// 3. 1~10까지의 다음과 같이 출력
			//짝수
			//홀수
		
		for (int as1 = 1; as1 <= 10; as1++) 

		    if (as1 % 2 == 0) {
		        System.out.println(as1+ ": 짝수입니다");
		    } else {
		    	 System.out.println(as1 + ": 홀수입니다");
		    }	
		// 1부터 10까지 3개 씩 옆으로 찍기
				//  1 2 3
				//  4 5 6
				//  7 8 9
				// 10
		
		System.out.printf("1, 2, 3");
		System.out.println();
		System.out.printf("4, 5, 6");
		System.out.println();
		System.out.printf("7, 8, 9");
		System.out.println();
		System.out.println("10");		
		
		// 1부터 100까지 홀수의 개 수
		
	   
		int count = 0;

        for (int as1 = 1; as1 <= 100; as1++) {
            if (as1 % 2 != 0) {
                count++;
            }
        }

        System.out.println("홀수 개수: " + count);
   
		
		// 99단
    	

		// 9번 9단씩 옆으로 출력
				
		System.out.println("문제 9");
		
		for (int j=1; j<= 10; j++) {
			System.out.print(j+ " ");
			if(j % 3 == 0)
			{
				System.out.println();
			}
		}
		
		
		for (int m = 2; m <= 9; m++ ) {
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "x" + n + "=" + (m*n));	
			}
		}
		////////////////////////////////////////////////////////
		
		// 0단계
		/*
		+
		+
		+
		+
		+
		*/
		// 
		
		
		String mark = "+";
		String space = ".";	
	
	int Tp= 3;
	
	for (int i =1; i<= Tp; i++) {
		for (int j = 0; j < Tp -i; j ++) {
			System.out.print(space);
		}
		
		for (int j = 0; j<2*i-1; j++) {
		System.out.print(mark);	
		}
		
		for (int j = 0; j < Tp -i; j ++) {
			System.out.print(space);
		}
	System.out.println();
	}
		//question 1.
		// 주사위 2개를 굴려서 나올 수 있는 모든 조합 출력
		// ex) [1.1] [1,2] 경우의 수 36

		int dice = 6;
		
		for(int i = 1; i <=6; i++) {
			for (int j= 1; j<=6; j++) {
				System.out.println(i+"and"+j);
			}
		}
		

	
// 2부터 12까지의 주사위 합
		for (int sum = 2; sum <= 12; sum++) {
			System.out.print("합 " + sum + ": ");
// 1번 복사
			for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
            if (i + j == sum) {
            	System.out.print("[" + i + "," + j + "] ");
            	}
            }
		}
			System.out.println();
}
		
	
	
		// 문제 2 주사위 2개의 합 별로 나올 수 있는 조합
		//  ex) 합2: [1,1]
		//  ex) 합3: [1, 2] [2,1]
	//	만약 합의 값이 중복이 될 경우 묶어준다.
		
		for (int sum = 2; sum <= 12; sum++) {
			System.out.print("합 " + sum + ": ");
// 1번 복사
			for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
            if (i + j == sum) {
            	System.out.print("[" + i + "," + j + "] ");
            	}
            }
		}
			System.out.println();
}		

		// 문제 3
		// 합 별로 조합의 수를 같이 출력
	
	
	
	
		
		
		
		// 문제 4. 
		// 순서에 관계 없이 중복 제거.
		// [합이 중복인 건 제거.]
	
	
	
	
	
	
	
	
	
	}
		


}

		
		
	
		
		
		
		
		
		