package sec01.exam01;

import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {

		/*
		 * 배열 array
		 * 한번에 여러 변수를 만드는 방법입니다.
		 * 같은 타입만 선언할 수 있다.
		 * 생성할 때 전체 크기를 지정해 줘야 한다.
		 * int면 싹 다 int long이면 싹 다 long이다,
		 * 생성된 여러 변수들은 index로 관리한다. (index는 무조건 0부터 시작)
		 */
		
		// 선언
		int [] a1; // java 스타일
		
		int a2 []; // c 스타일
		//배열 변수는 참조 변수 라서 null을 넣을 수 있다.
		a1 = null;
		
		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 75;
		/*
		 *첫 번째 []: int[]
		 *		int로 이루어진 배열 변수 타입이다.
		 *	두번 째 [] : new int [3]
		 *		배열의 크기. 즉 한 번에 만들 변수의 개수
		 *	세번 째 [] : 만들어진 변수 중에서 몇번 째 인가.
		 *		맨 처음 변수의 INDEX가 0이다.
		 */
		int[] score = new int [30];
				score[0] = 90;
				score[1] = 80;
				score[2] = 75;
				System.out.println("score[1] :" + score[2]);
				System.out.println("score[3] :" + score[3]);
		
		String[] str = new String [3];
		System.out.println("str[1] ="+ str[1]);
		//
	
		// 배열 생성 후 기본 값은
		// 0, false, null로 초기화 됨.
		
		// 배열을 선언하는 2번 째 방법.
		// 넣을 값을 모두 정확히 알고 있는 경우
		int[] i1 = new int[] {90, 80, 75};
		int[] i2 = null;
		i2 = new int[] {90, 80, 75};
		
		// 배열에 선언하는 세번 째 방법
		// 선언과 동시에 초기화 하는 경우에만
		// new int []를 생략할 수 있다
		int [] i3 = {90, 80, 75};
		int [] i4 = null;
		//		i4 = {90, 80, 75};

		int [] sc = {90, 80, 75};
			
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum +=sc [i];
		}
		
		System.out.println("총합 :" + sum);
		
		int avg = sum / 3;
		System.out.println("평균 :" + avg);
		
		//배열의 길이
		System.out.println("sc.length :"+sc.length);
		

		int b0 = 5;
		int b1 = 15;
		int b2 = 25;
		
		int[] bs0 = new int[3];
		
		bs0[0] = b0;
		bs0[1] = b1;
		bs0[2] = b2;
		
		int [] bs1 = new int [3];
		
		bs1[0] = b0+1;
		bs1[1] = b1+1;
		bs1[2] = b2+1;
		

		
		
		int[][] bs = new int[2][3];
		bs[0] = bs0;
		bs[1] = bs1;
		
		System.out.println("bs.length:" + bs.length);
		System.out.println("bs[0].length:" + bs[1].length);
		
		
		//반복문 사용해서 1~10까지 저장
		// 다른 반복문에서 출력
		
		
		for(int i5= 1; i5<= 10; i5++) {
			System.out.println(i5);
		}
		
		
		int[] numbers = new int[10];

        // 1. for문으로 1~10 저장
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // 2. while문으로 출력
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
		
        // 문제 1번
        int [] num = new int[5];
        num[0] = 10;
		num[1] = 20;
		num[2] = 30;
        num[3] = 40;
        num[4] = 50;
        
        for(int i7 = 0; i7 < num.length; i7++) {
        	System.out.println("문제 1번:" +num[i7]);
        }
       //////////////////////////////////////////////
        ///////////////////////////////////////////
     
        int [] sc2 = {5,10,15,20,25,30};
		
		int sum2 = 0;
		for (int k = 0; k < sc2.length; k++) {
			sum2 +=sc2 [k];
		}
		
		int [] d1 = new int [] {1,2,3,4,5};
		int [] d2 = d1;
		int [] d3 =	{1,2,3,4,5};
		System.out.println("d1 == d2 :" + (d1 == d2));
		System.out.println("d2 == d3 :" + (d2 == d3));
		d2 [1] = 10;
		System.out.println("d1[1] :"+ d1[1]);
		
		int[] f = new int [] {1,5,9,7,3};
		int[] f2 = new int [f.length];
		
		
		for(int i5 = 0; i5< f.length; i5++) {
			System.out.println("f.length :" + f[i5]);
			f2[i5] = f[i5];
			
		}
		
		
		for(int i9 = 0; i9<f.length; i9++) {
			int data = f[i9];
			System.out.println("data :"+ data);
		}
		// 향상된 for문
		for(int data : f) {
			System.out.println("data2 :" + data);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
	}

}
