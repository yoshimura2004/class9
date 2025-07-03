package sec01.exam01;

public class TypeCasting_Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2 * ( 3 + 4 );
		System.out.println("a :" + a);
		
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println("바이트벨류:" + byteValue);

		intValue = 220;
		byteValue = (byte)intValue;
		System.out.println("바이트벨류2:" + byteValue); 
		// 127을 넘어가기 때문에 예상하기 힘들다.
		// 비트를 2의 보수로 계산한 결과가 나온다.
		//형 변환 연산자
		// type casting operator
		double d = 3.14;
		int i = (int) d;
		System.out.println("i :" + i);
		
		int i2 = 100;
		long l1 = (long)i2;
		long l2 = i2;
		System.out.println("l2 :" + i2);
				
		int i3 = 3;
		long l3 = 4;
		long l4 = i3 + l3;
		System.out.println(l4);
//		i3 + l3
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7;  // (double) i7 + d7 괄호 더블이 생략되어 있다.
		System.out.println("d8 :" + d8);
		
		double d9 = 10/4;
		System.out.println("d9 :" + d9);
		double d10 = 10/3;
		System.out.println("d10 :" + d10); 
		// 	double d9 = 10.0/ 4;
		// 	double d9 = (double) 10/4;
		
		//문자를 숫자로 바꾸기!
//		String s1 = "123a";
		String s1 = "123";
	//	int i8 = (int)s1; 이거 안됨
		int i8 = Integer.parseInt(s1);
		
	// 가장 쉽게 숫자를 문자로 바꾸는 방법
		String s2 = "" + i8;
		System.out.println("s2 :" + s2);
		
		//queeze
//		회식비 43000원
		// 인원 :4 명
		// 이 때, 인당 얼마 내야 하는가?
		//참석인원은 만원 단위로
		// 주최자는 얼마 내야하나?
		
		double dinner = 4.3;
		int count = 4;
		double dp = dinner/count;
		
		
		System.out.println("회식비 :" + dinner + "만원");
		System.out.println(count);
		System.out.println("1번:" + (dp*10000));
		
		int dp2 = (int) dp;
		System.out.println("2번:" +(dp2*10000));
		
		double dp3 = dinner - ((count-1) * dp2 );
				System.out.println("3번:" + (dp3*10000));
		
		
		
				
				
				
	}

}
