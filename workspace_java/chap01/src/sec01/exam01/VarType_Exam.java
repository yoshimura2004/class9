package sec01.exam01;

public class VarType_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			byte b1; //바이트 변수 b1을 선언했다!
			b1 = -127;
			System.out.println(b1);
//			b1= 128; 128부터는 못써용~
			
			char c1 = 65; //char는 글씨 하나를 넣을 수 있다.
			System.out.println("c1:"+ c1); // char는 글씨 전용 코드이다.
			c1 = 65 + 2;
			System.out.println(c1);
			char c2 = 'F';  //유일하게 char타입에만 ''를 사용한다.
			System.out.println(c2);
			System.out.println(c1-c2);
			char c3 = '한';
			System.out.println("c3 : " + (c3+1));
			
			
			String s1 = "suzuka"; //string은 ""
			System.out.println("s1 : " + s1);
			
			String s2 = "su\tzu\nka"; //string은 ""
			System.out.println("s2 :" + s2);	// \n은 많이 쓴다 \n은 엔터 \r 왼쪽으로 but 윈도우는 \n으로 괜찮다
										//\n 은 하나의 문자가 된다.
			
			String s3 = "suzu\nka"; 
			System.out.println("s3 :" + s3);
			
			String s4 = 3 + 2 + "글씨";
			System.out.println("s4: " + s4);
			
			long l1 = 129382109l; //long은 숫자 뒤에 l을 붙여주어야 한다.
			long l2 = 123;
			System.out.println(l1+l2); 
				
			float f1 = 3.14f;
			double d1 = 3.14;
			System.out.println("f1:"+ f1);
			System.out.println("d1:"+ d1);
			
			float f2 = 0.123456781f; //해상도, 정밀도라 부른다. float은 7자리까지만 신뢰가 가능하다.
			System.out.println("f2 :" + f2); // 8자리부터는 정확하지 않을 수 있다.
			
			double d2 = 0.1234567890123456789012345678901234567890;
					System.out.println("d2 :" +d2); //double의 정밀도는 16자리
			
			boolean stop = true; //예약어이다. 참과 거짓을 저장 가능.
			boolean start = false; //논리 타입이라 부른다.
			// 내 나이를 저장하시요.
			
			byte age = 25;  // 내 나이를 저장❤
			System.out.println("age :" + age);
			// 내소유 자차가 있다.
			boolean car = true;
			System.out.println(car);
			//우리집에 있는 스마트폰의 개 수.
			byte phone = 4;
			System.out.println(phone);
			// 내 이름
			String t1 = "김경식";
			System.out.println(t1);
			// 1평은 3.3 제곱미터 입니다. 5평은?
			float area = 5*3.3f; //해상도, 정밀도라 부른다. float은 7자리까지만 신뢰가 가능하다.
			System.out.println(area);

			
			/* q1.
			 *  출력 결과: "3 > 4"의 결과는 false"
			 *  1-2 : 두 변수의 값을 6,5로 변경
			 *  출력 결과 : 6 > 5 의 결과는 true 입니다.
			 *  
			 */

			int a1 = 6;
			int b2 = 5;
			System.out.println((a1 + ">" + b2) + "결과는" +(a1>b2) +"입니다");

			// q2
			/*
			 * 숫자 132
			 * 출력 결과 
			 * " 백의 자리 : 1"
			 * " 십의 자리 : 3"
			 * " 일의 자리 : 2"
			 * 
			 */
			
		// user + info
		// userInfo  : 카멜케이스 camel case
		// user_info : snake case
		// user-info : kebab case
		// nUserInfo, sUserInfo : 헝가리언 표기법
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
