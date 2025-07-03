package sec02.exam;

public class OpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		x++;
		System.out.println("x:" +x);
		++x;
		System.out.println("x:" +x);
		x = 10;
		x = x + 1; //11
		x += 1; //위와 같은 코드이다.
		x++;	//위와 같은 코드이며, 단 1을 증가할 때만.
		
		int y = 10;
		y--;
		--y;
		System.out.println("y : " + y);
		
		x = 10;
		int z = ++x;
		System.out.println("z :" + z);
		
		x = 10;
		z = x++;
		System.out.println("z :" +z );
		System.out.println("x :" +x );
		
		x = 10;
		System.out.println("++x :" + ++x);
		
		x = 10;
		System.out.println("x++ :" + x++);

		
		x = 1;
		z = x++ + ++x;
		System.out.println("z:" + z);
		System.out.println("x:" + x);
		
		x =1;
		z = x++ - --x * x++ - x--;
		System.out.println("x :" + x);
		System.out.printf("x: %d, z: %d", x,z);
		System.out.println();
		
		boolean a = false;
		a = !a;
		System.out.println("a :" + a);
	
		//나누기 할 때 0으로 나누지 않도록 조심.
//		int b =10;
//		int c = b/0;
		
//		double d =5.4;
//		System.out.println(d/0);

		System.out.println(0.1 == 0.1f);
		//소수점을 비교할 때는 같은 타입으로 변환해서 비교하자
		
		String s1 = "s1";
		String s2 = "s1";
		System.out.println(!s1.equals(s2));
		// 글씨는 무조건 equals로 비교한다.
		
		// Q1.
		// 난 돈이 만원 있습니다.
		// 1. 4500원짜리 프라프치노를 최대 몇 잔 살 수 있나요?
		// 2. 그리고 남은 돈
		
		int money = 10000;
		int prf = 4500;
		
		System.out.println("프최몇 :" + (money/prf));
		System.out.println("거스름돈:" + (money%prf));
		
		// 올리브영에 꿀홍차가 8000원 15%  slae 중이야
		
		int tea = 8000;
		double t = tea*0.85;
		System.out.println(t);
		
		int score = 87;
		System.out.println("내 점수는? 80과 90사이다 참? 거짓?");
		System.out.println(score > 80 && score < 90);
		
		// 957를 900으로 바꾸는 법
		// 어떤 숫자를 10의 자리 이하 '버림'
		// 957 - 57 // 957 % 100 a-(a%100)
		
		// v1/ v2를 소수점 3자리까지 출력하시오
		double v1 = 1000;
		double v2 = 794;
		System.out.println(v1/v2);
		
		double v3 = v1/v2;
		v3 = ((int) (v3*1000)) / 1000.0;
		System.out.println(v3);
		
		double v4 = (v1/v2) * 1000;
		int v5 = (int) v4;
		double v6 = (double)v5 / 1000;
		
		int s = 95;
		String grade = (s > 90) ? "A" : "B";
		System.out.println("grade :"+ grade);

		
		
	
		
	

		
		

	
		
		
		
				
		
		
		
		
		
		
	}

}
