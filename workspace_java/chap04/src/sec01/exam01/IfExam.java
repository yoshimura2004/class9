package sec01.exam01;

public class IfExam {

	public static void main(String[] args) {
	
		int score = 54;
		
	
		if(score >= 9) {
			System.out.println("90 이상입니다.");
			System.out.println("A 등급");
		} else {
			System.out.println("90 미만입니다");
			System.out.println("B등급");
		}
		//else가 있으면 무조건 답이 하나는 나온다.
			if(score >= 90) {
				System.out.println("A 등급");
			}else if (score >=80) {
				System.out.println("B 등급");
			}else if (score >=70) {
				System.out.println("C 등급");
			}else{
				System.out.println("D 등급");
			}	
	
			score = 98;
			if(score >= 95)  {
				System.out.println("90점 이상");
				System.out.println("96점 이상");
			} else if (score >=90) {
				System.out.println("90점 이상");	
			}
			if(score >= 90) {
				System.out.println("90점 이상");
				
				if(score >=95) {
					System.out.println("95점 이상");
				}
			}
			score = 98;
			if(score >= 95)  {
				System.out.println("90점 이상");
				System.out.println("96점 이상");
			} 
//	위의 if와 관계 없이 무조건 판단한다.
			if (score >=90) {
				System.out.println("90점 이상");	
			}
			
			int x =86998;
			if(x%2 == 0){
				System.out.println("짝수");
			}
			else
			{			
				System.out.println("홀수");
		}
		////////////////////////////////////
			////random
			double random1 = Math.random();
			System.out.println(random1);
			
			// Math.random()
			// 0 <= Math.random() < 1
			// 주사위 : 1~6
			// 0~5로 구해놓고, +1을 해서, 1~6까지로 만들겠다.
			// 나머지를 쓰는 방식( 대충 나머지로 구하는 법)
			//1234.56789
			//(int) 1234.56789 >>>>1234
			//1234 % 6 : 0~5
			//0 ~ 5 + 1 >>> 1~6
			double random2 = Math.random()*10000;
			int dice = ((int) random2) %6 + 1; 
			System.out.println("주사위" + dice);
			
			// 0 <= Math.random() < 1
			// 3 + 2 = 5
			// 0 < 5 < 10
			//  0 < 50 < 100
			// 0 <= Math.random()*6 < 6 //
			int dice0= (int)(Math.random()*6);
			dice = dice0 + 1;
			System.out.println("주사위" + dice);
			
			// 로또 번호 : 1~45
			int lotto1 = (int)(Math.random()*45);
			System.out.println("로또번호:"+ lotto1);
			
			int num = 1;
			if( num == 1) {
				System.out.println("num은 1이야");
			}	else if(num ==2) {
				System.out.println("num은 2이야");
			}	else {
				System.out.println("num은 1과 2가 아닙니다.");
			}
			
			// int 혹은 String 만 쓸 수 있다.
			// 사용못함 : boolean, long, float, double
			switch(num) {
				case 1:
					System.out.println("switch num은 1입니당");
//					break;
				case 2:
					System.out.println("switch num은 2입니당");
					break;
				default:
					System.out.println("num은 1과 2가 아닙니당");
					break;
			}
			
			int month = 5;

			
				
			switch(month)
			
			{
			case 3:
			case 4:
			case 5:
				System.out.println("spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("fall");
			case 12:
			case 1:
			case 2:
				System.out.println("winter");
			}
			
			int i = 10;
			if(i > 5) {
				System.out.println("5보다 크다");
			}			
			
//			//문제 1. 
//			//int 변수에 임의의 수를 넣고
//			// 그 수가 "양수", "0", "음수" 구분하여 출력
//			
//			문제 2.
//			a와 b 두 수 중에서 큰 값을 출력
//			
//			문제 3.
//			시간과 분이 있을 때 
//			35분이 지난 시간을 출력해주세요
//			
//			문제 4.
//			어떤 수가 15와 20(포함) 사이에 있는가?
//					
//			문제 5.
//			통장 잔액이 만원 있을 때 출금액에 따라
//			"잔액이 부족합니다, " "얼마 출금 했고 ",
//			"얼마 남았습니다.", "정확히 입력 해주세요"
//			
//			문제 6.
//			입력한 수에 따라(예를 들어 125) 
//			"100 보다 큰 수이며, 양수이고, 홀수 입니다."
//			ex) -6
//			"100 보다 작은 수이며, 음수이고, 짝수 입니다."
//			
//			문제 7.
//			
//			어제 온도, 오늘 온도 변수 두 개
//				2				-3
//			오늘 온도는 영하 3도 입니다. 어제보다 5도 낮습니다
//			
//			문제 8.
//			
//			사각형의 한 쪽 모서리가 x1 = 10,y1 = 20 
//			대각선 모서리  			x2 = 90, y2 = 100
//			이럴 때 새로운 점 x3 , y3 는 사각형에 포함되는가?
//			
//			문제 9.
//			
//			변수에 두 자리 숫자가(10~99) 있을 때 
//			10의 자리와 1의 자리가 같은 수인지 판단.
			
					
					
					
					
					
			
			
			
	}	
}	
	
	
	
		
		

		
		
		
		

		
		
		
		
		
		
	

