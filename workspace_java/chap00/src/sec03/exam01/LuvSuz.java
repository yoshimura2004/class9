package sec03.exam01;

import java.util.Scanner;

public class LuvSuz {

	public static void main(String[] args) {


//		문제 1.,
//		int 변수에 임의의 수를 넣고
//		그 수가 "양수", "0", "음수" 구분하여 출력
			
		 int num = -10; // 임의의 수 (원하는 값으로 바꿔보세요)

	     if (num > 0) {
	         System.out.println("양수입니다.");
	     } else if (num == 0) {
	         System.out.println("0입니다.");
	     } else {
	         System.out.println("음수입니다.");
	     }
	     
//	     문제 2.,
//	 	a와 b 두 수 중에서 큰 값을 출력
	     
	     int a = 130;
	     int b = 120;
	     
	     
	     if (a > b) {
	         System.out.println("더 큰 값: " + a);
	     } else if (a < b) {
	         System.out.println("더 큰 값: " + b);
	     } else {
	         System.out.println("두 수는 같습니다.");
	         }
	     
//	     문제 3.,
//	 	시간 과 분이 있을 때
//	 	35분이 지난 시간을 출력
	     
	     int hours = 5;
	     int minutes = 50;
	     
	     minutes = minutes + 35; //지난 시간
	     
	     if (minutes >= 60) {
	    	 hours = hours + minutes/60; //1시간이 되었을 때 시/분 변환
	    	minutes = minutes%60; 
	     }
	     
	    if (hours >= 24) {
	    	hours = hours % 24;  //24시간 기준
	    }
	    System.out.println("35분후 시간은" + hours + "시" + minutes + "분");
	     
//	    문제 4.,
//		어떤 수가
//		15와 20 사이(포함)에 있는가?
	    int num2 = 15; //어떤 수
	    if (num2 >= 15 && num2 <= 20  ) {
	    	System.out.println(num2 + "는" + "포함이야");
	    } else {
	    	System.out.println(num2 + "는" + "아니야");
	    }
	    
//	    문제 5.,
//		통장 잔액이 10000원 있을 때
//		출금액에 따라
//		"잔액이 부족합니다", "얼마 출금 했고 얼마 남았습니다", "정확히 입력 해주세요"
	    
	    int money = 10000;    
	    int outmoney = 3000; 
	    
	    if (outmoney <= 0 || outmoney > 10000) {
	        System.out.println("정확히 입력 해주세요.");
	    } else if (outmoney > money) {
	        System.out.println("잔액이 부족합니다.");
	    } else {
	        int remaining = money - outmoney;
	        System.out.println(money + "원 출금 했고, " + remaining + "원 남았습니다.");
	    }
	    
//	    값에 따라(예를 들어 125)(단, 0은 양수+짝수)
//		"100 보다 큰 수이며, 양수이고, 홀수입니다"
//		예를들어 -6
//		"100 보다 작은 수이며, 음수이고, 짝수입니다"
	 // 확인할 값 (예: 125, -6, 0 등)
	    
	    int num3 = 125;  

	    String size;
	    
	    if (num3 > 100) {
	        size = "100보다 큰 수이며, ";
	    } else if (num3 < 100) {
	        size = "100보다 작은 수이며, ";
	    } else {
	        size = "100과 같은 수이며, ";
	    }

	    String sign;
	    if (num3 >= 0) {
	        sign = "양수이고, ";
	    } else {
	        sign = "음수이고, ";
	    }

	    String sign2;
	    if (num3 % 2 == 0) {
	        sign2 = "짝수입니다.";
	    } else {
	        sign2 = "홀수입니다.";
	    }

	    System.out.println(size + sign + sign2);
	     
	    
//	    어제 온도, 오늘 온도 변수 두개
//		2, -3
//		"오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다" 
	  
	    
	    int yesterday = 2;   // 어제 온도
	    int today =15;      // 오늘 온도

	    // 오늘 온도 출력 (영하/영상 판단)
	    if (today < 0) {
	        System.out.print("오늘 온도는 영하 " + today + "도 입니다. ");
	    } else {
	        System.out.print("오늘 온도는 영상 " + today + "도 입니다. ");
	    }

	    // 온도 차이 계산
	    
	    int diff = today - yesterday;

	    if (today > yesterday) {
	        System.out.println("어제보다 " + diff + "도 높습니다.");
	    } else if (today < yesterday) {
	        System.out.println("어제보다 " + diff + "도 낮습니다.");
	    } else {
	        System.out.println("어제와 온도가 같습니다.");
	    }
	        
	        int sum = 0;
	        
	        for (int m =1; m <= 100; m++) {
	        	sum = sum + m;
	        } 
	        System.out.println("1~100의 합" + sum);
		
//	        문제 8번.,
//	        변수에 두자리 숫자(10~99)가 있을 때
//	        10의 자리와 1의 자리가 같은 수인지 판단
	        
	  int TL= 5;
	  
	  String mark = "+";
	  String point = ".";
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("몇 줄?");
	  int max = scan.nextInt();
	  
	  
	  for(int i = 1; i<=max; i++) {
		  for(int j =1; j<=max-i; j++) {
			  System.out.print(point);
		  }
		  for(int j = 1; j<= i; j++) {
			  System.out.print(mark);
		  }
		  for(int j = 1; j <= i-1; j++) {
			  System.out.print(mark);
		  }
		  for(int j = 1; j<=max-i; j++) {
			  System.out.print(point);
		  }
		  
		  System.out.println();
	  }
	        
	  





	        
	        
	        
	        
	        
		
		
	}

}
