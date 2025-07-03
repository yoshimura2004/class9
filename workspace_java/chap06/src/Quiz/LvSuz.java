package Quiz;

import java.util.Scanner;

public class LvSuz {

	public static void main(String[] args) {
		
//		int [] numbers = {13, 22, 5, 64,9,1};
//		int max = numbers [0];
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i] > max ) {
//				max = numbers[i];
//			}
//		}
//		System.out.println("문제 4번======");
//		System.out.println("최댓값은 :"+ max );
//		System.out.println("=========================");
//		
//		Scanner scan = new Scanner(System.in);
//		int count = 0;
//		int answer = (int)(Math.random()* 50);
//		int Qs;
//		
//		System.out.println("업다운 게임 시작");
//		
//		while(true) {
//			System.out.println("숫자를 입력하세요");
//			Qs = scan.nextInt();
//			count++;
//			if(Qs == answer) {
//				System.out.println(count+"회 시도만에 정답입니다");
//				break;
//			}	else if(Qs < answer) {
//				System.out.println(count+"회 시도: "+Qs+"보다 UP!");
//			}	else {
//				System.out.println(count+"회 시도: "+Qs+ "보다 Down!");
//			}
//			
//		}
		
		String word = "banana";
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 글자를 입력해주세요");
		char target = scan.next().charAt(0);
		
		int count = 0;
		
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == target) {
				count++;
			}
		}
		
		System.out.println(target + "는" + count + "번 나왔습니다.");
		
		
		
		
	}
	
}
