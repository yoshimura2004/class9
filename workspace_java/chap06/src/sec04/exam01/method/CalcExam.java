package sec04.exam01.method;

public class CalcExam {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		
		cal.powerOn(); // ()실행을 의미하는 괄호
		cal.powerOff();
		
		int sum = cal.plus(3,3);
		System.out.println("sum은"+sum);
		
		
		int a = 3;
		sum = cal.plus(a,3);
		System.out.println("sum은"+sum);
		
		int x = 3;
		sum = cal.plus(x,3);
		System.out.println("sum은"+sum);
		
		int a1 = 13;
		int b = 1;
		double result2 = cal.divide(a1, b);
		System.out.println("나누기:"+ " " + result2);
	
		
		
		
		
	}

}
