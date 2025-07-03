package sec03.exam01;

public class practice {

	public static void main(String[] args) {
		
		
		//1. 배열에서 짝수 뽑기
		int[] numbers = new int [] {3, 6, 1, 8, 5, 10};
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println("짝수 뽑기 :"+numbers[i]);
			}
		} 
		//2. 5보다 큰 수의 개수
		
		int [] data = new int [] {2,5,7,3,9,1,6};
		
		for (int i = 0; i < data.length; i ++) {
			if(data[i] > 5) {
				int count = data[i];
				//   7.9.6이란 3개의 개수를 count에 담아준다.
				
				System.out.println("5보다 큰 수 :"+ count );
			}
		}
		
		// 배열에서 최댓값 구하기
		
		int [] scores = new int [] {90, 70, 85, 100, 65};
		
		int max = scores[0];
		
		for (int i= 0; i < scores.length; i++) {
			if (scores[i] > max) {
		        max = scores[i];
		    }	
		}
		System.out.println("최댓값 :" + max);
		
		
		// 문제 4번
		//int[] arr = {1, 2, 3, 4, 5}를 오른쪽으로 한 칸 밀고,
		// 맨 마지막 값은 처음으로 보내서 [5, 1, 2, 3, 4]로 만들고 출력하세요.
		
		int [] arr = new int [] {1, 2, 3, 4, 5};
		
		int last = arr [arr.length-1];
	
		for (int i = arr.length -1; i > 0; i-- ) {
			arr[i] = arr[i-1];
		}
		
		arr [0] = last;
		System.out.print("문제 4번의 정답 :");
		for (int a : arr) {
			System.out.print(a + "");
		}
		System.out.println();
		
		//문제 5번 두번 째 최댓값 구하기
		
		int [] score = new int [] {5, 1, 9};
				
		int Max = score[0];
		
		for (int i= 0; i < score.length; i++) {
		if (score[i] > Max) {
		    Max = score[i];
		}	
		}
		System.out.println("2번 째로 큰 최댓값 :" + max);

		// 한번에 하나만 본다.
		
		// 게임을 만들어보자.
		// 클래스를 사용.
		// up down 게임!
		// random으로 숫자를 선정 (15가 선정되었다 가정)
		// 예를 들어 15란 숫자를 맞춰야 돼
		// 숫자를 입력해. ex) 10
		// 낮게 나오면 up 높게 나오면 down
		// ex) 10보다 up! 10보다 down!
		// ex) 정답 입력시. 정답이야!
		// 대신 범위가 필요하다.  ex) 0~100
		
		
		
		//계산기
		// 두 수, 연산자를 골라서
		// 첫번째 입력 값 : 3 엔터
		// 두번 째 입력 값: + 엔터
		// 세번 째 입력 값: 5 엔터
		// 결과: 3+5 = 8;
		
		
		
		
		
		
				
	}

}
