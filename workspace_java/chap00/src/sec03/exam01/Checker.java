package sec03.exam01;

public class Checker {
	
	int checkOddEven(int number) {
		if(number%2==0) 	{
		System.out.println("짝수입니다.");
		}if(number == 0)	{
			System.out.println("0은 입력하시면 안됩니다");
		}else{
			System.out.println("홀수입니다.");
		}
		return number;
	}
}
