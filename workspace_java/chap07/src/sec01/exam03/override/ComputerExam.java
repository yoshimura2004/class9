package sec01.exam03.override;

public class ComputerExam {

	public static void main(String[] args) {
		
		
		Calc c = new Calc();
		System.out.println(c.areaCircle(10));
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(3));
		
		System.out.println(com.plus(3,20));
		
		
	}

}
