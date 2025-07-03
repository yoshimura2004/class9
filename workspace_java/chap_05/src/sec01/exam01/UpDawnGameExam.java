package sec01.exam01;

import java.util.Scanner;

public class UpDawnGameExam {

	public static void main(String[] args) {
		
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
		// 가위바위보 게임 참조
		// 시도시 카운트 ex) 40보다 up! 시도 1 
		// 10 이상 시도 시 초기화
		
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random() * 100); // 실제로는 랜덤으로 설정하면 좋지만 지금은 고정
		int Qs;
		int count = 0;
		
		System.out.println("업다운 게임 시작! (0~100 사이 숫자 맞추기)");
		
		while (true) {
		    System.out.print("숫자를 입력하세요: ");
		    Qs = sc.nextInt();
		    count++;
		if (Qs == answer) {
		    System.out.println(count + "번 시도만에 " + "정답입니다");
		    break;
		} else if (Qs < answer) {
		    System.out.println(count+ "번 시도 " + Qs + "보다 UP!");
		} else {
		    System.out.println(count+ "번 시도 " +Qs + "보다 DOWN!");
		}
		if (count >= 10) {
            System.out.println("10회 초과! 정답을 다시 설정합니다. 게임이 초기화됩니다.\n");
		}
	}
		
           
		
		
		
		
		
		
		
  
		
	}

}
