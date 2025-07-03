package sec04.exam06.overloading;

public class CalcExam {

	public static void main(String[] args) {
	
		Calc cal = new Calc();
		
		cal.plus (1,2);
		cal.plus (1.23,123.2);
		cal.plus (1,123.2);
		
		System.out.println("문자");
		System.out.println(1);
		
		
	}

}
