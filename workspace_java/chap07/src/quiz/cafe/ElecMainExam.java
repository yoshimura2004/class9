package quiz.cafe; //실행 

public class ElecMainExam {

	public static void main(String[] args) {
		
		Electronic e = new Electronic("LG",1000000);
		Laptop l = new Laptop("Apple", 100000000, 1.3);
		
		e.info();
		l.info();
		

	}

}
