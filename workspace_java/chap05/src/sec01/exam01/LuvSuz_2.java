package sec01.exam01;

import java.util.Scanner;

public class LuvSuz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 // 입력받은 정수에 따라 다음과 같이 출력
        /* 3
         * 00 01 02
         * 10 11 12
         * 20 21 22
         */
        /* 4
         * 00 01 02 03
         * 10 11 12 13 
         * 20 21 22 23
         * 30 31 32 33
         */

		System.out.println("정수를 입력하세요");
		Scanner sc = new Scanner(System.in);

        // 정수 입력 받기
        int n = sc.nextInt();
     

        // 이중 for문으로 출력
        for (int i = 0; i < n; i++) {           // 행
            for (int j = 0; j < n; j++) {       // 열
                System.out.print(i + "" + j + " ");
            }
            System.out.println(); // 줄 
        }
    
		
     // 문제 6
        // 입력받은 정수에 따라 다음과 같이 출력
        // (정사각형)
        
		System.out.println("수를 입력하세요");
    Scanner scan = new Scanner(System.in);

    int m = scan.nextInt();  

    for (int i = 0; i < m; i++) {          // 행
        for (int j = 0; j < m; j++) {      // 열
            // 가장 바깥쪽(테두리)이면 +
            if (i == 0 || i == m - 1 || j == 0 || j == m - 1) {
                System.out.print("+");
            } else {
                // 안쪽은 .
                System.out.print(".");
            }
        }
        System.out.println();  // 줄 바꿈
    }


			  /* question 1.
			   * 
			   * 특정 수가 오기 전까지 반복 특정 수
			   * 오기 전까지 반복
			   * 
			   * 수를 입력하세요 
			   *-3
			   *"음수
			   *나머지 "양수"
		*/
			 
	
		  
		  Scanner scan2 = new Scanner(System.in);
	       // 
		  int num2;

	        System.out.println("수를 입력하세요 (0 입력 시 종료)");

	        while (true) {
	            num2 = scan2.nextInt();
// 0일 때 종료 
	            if (num2 == 0) {
	                System.out.println("종료합니다.");
	                break;
	            }
//음 양 판독
	            if (num2 < 0) {
	                System.out.println("음수");
	            } else {
	                System.out.println("양수");
	            }
	        }
	       
			   
			  /* question 2.
			   * 
			   * 월을 입력하면 계절이 나오고
			   * 0을 입력하면 종료
			   * 
			   */
			     
	        Scanner scan3 = new Scanner(System.in);
		       // 
			  int num3;
			 
		        System.out.println("월을 입력해주세요(0을 입력하면 종료)");
	
		        while (true) {
		            num3 = scan3.nextInt();
	 
		            if (num3 == 0) {
		                System.out.println("종료합니다.");
		                break;
		            }
		            
		            switch(num3) {
					case 3: 
					case 4: 
					case 5: 
						System.out.println("봄");
						break;

					case 6: 
					case 7: 
					case 8:
						System.out.println("여름");
						break;
					
					case 9: 
					case 10: 
					case 11:
						System.out.println("가을");
						break;	
						
					case 12: 
					case 1: 
					case 2:
						System.out.println("겨울");
						break;	
						
            	}     
	        }

	  
			  /* 문제 3.
			   * 
			   * 가위바위보게임
			   * 
			   * 패배 승리 비김
			   * 
			   * 0이 입력될 때 까지 반복
			   * 
			   */
        
		        
		        //// 가위 바위 보
			    // 랜덤 입력. 
			// ex ) 출력: 가위! 이쪽에서 바위! 답: 패배!
	            //3 개가 출력되어야 함
		// 경우의 수 9가지
		// 포지션 하나당 경우의 수 3개
	// ex 가위 - win lose draw
			    			    
        Scanner sc2 = new Scanner(System.in);

        System.out.println("가위(1), 바위(2), 보(3), 종료(0)");

        while (true) {
            System.out.print("당신의 선택은? ");
            int me = sc2.nextInt();  // 사용자 입력

            if (me == 0) {
                System.out.println("게임 종료!");
                break;
            }

            if (me < 1 || me > 3) {
                System.out.println("1~3 숫자만 입력하세요!");
                continue;
            }

            int com = (int)(Math.random() * 3) + 1;  // 1~3

            
            System.out.println("상대: " + com);

            // 결과 판정
            if (me == com) {
                System.out.println("비겼어요!");
            } else if ((me == 1 && com == 3) || 
            		(me == 2 && com == 1) || (me == 3 && com == 2)) {
                System.out.println("이겼어요!");
            } else {
                System.out.println("졌어요!");
            }
        }

		        
			   /*	문제4. 
			    * 
			    * 	은행
			    *  1. 예금
			    *  2. 출금
			    *  3. 잔고확인
			    *  4. 종료
			    *  조건
			    *  예금할 때 음수 불가
			    *  출금할 때 음수 불가. 잔고보다 큰 금액 불가
			    *  
			    *      		
			    */
			        
   	 Scanner sc4 = new Scanner(System.in);
     long b = 0;  // 잔고 초기값 0

     while (true) {
         System.out.println("1.예금  2.출금  3.잔고확인  4.종료");
         System.out.print("선택: ");
         long choice = sc4.nextInt();

         if (choice == 1) {  // 예금
             System.out.print("예금할 금액: ");
             long deposit = sc4.nextInt();

             if (deposit <= 0) {
                 System.out.println("음수나 0은 예금할 수 없습니다!");
             } else {
                 b += deposit;
                 System.out.println(deposit + "원이 예금되었습니다.");
             }

         } else if (choice == 2) {  // 출금
             System.out.print("출금할 금액: ");
             int watch = sc4.nextInt();

             if (watch <= 0) {
                 System.out.println("음수나 0은 출금할 수 없습니다!");
             } else if (watch > b) {
                 System.out.println("잔고보다 큰 금액은 출금할 수 없습니다!");
             } else {
                 b -= watch;
                 System.out.println(watch + "원이 출금되었습니다.");
             }

         } else if (choice == 3) {  // 잔고확인
             System.out.println("잔고: " + b + "원");

         } else if (choice == 4) {  // 종료
             System.out.println("프로그램을 종료합니다.");
             break;

         } else {
             System.out.println("1~4 사이 숫자를 입력하세요!");
         }
	
     }
	
		   
		  
			        
			        
			        
			        
			
			
			
			
	}

}
