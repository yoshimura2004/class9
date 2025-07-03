package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);

		System.out.print(3);
		System.out.print(4);
		
		System.out.println(5);
		System.out.println(6);
		
		System.out.printf("이름: %s", "suzuka");
		System.out.println();
		System.out.printf("이름: %s, 나이:%d", "suzuka", 21);
//		System.out.printf("이름: " + name + ", 나이: "+ age);
		System.out.println();
		
		System.out.printf("이름: %6s, 나이:%03d", "suzuka", 21);
		System.out.println();

		//////////////////////////////////////////////////
		////
		int keyCode;
		
		/*
		 * Scanner 연습하려고 주석 처리
		try {

			keyCode = System.in.read();
			System.out.println("keyCode :" + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode :" + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode :" + keyCode);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/ 
		//Ctrl + shift + o = 빨간줄 사라짐
		Scanner sca = new Scanner(System.in);
		
		// 엔터까지의 모든 글씨
		String inputData = sca.nextLine();
		System.out.println("inputData :" + inputData);
	
		// 엔터 쳤을 때 띄어쓰기까지의 모든 글씨
		String inputData2 = sca.next();
		System.out.println("inputData :" + inputData2);
	
		//엔터쳤을 때의 숫자
		int input = sca.nextInt(); //숫자만 받는다.
		System.out.println("input :" + (input*10));
		
	
		
		System.out.print("x값을 입력하시오 :");
		int input2 = sca.nextInt(); //숫자만 받는다.
		System.out.println("입력한 x값 :" + input2);
		
	
	
	
	
	
	}
	

}
