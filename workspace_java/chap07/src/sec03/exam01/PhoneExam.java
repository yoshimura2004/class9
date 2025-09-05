package sec03.exam01;

public class PhoneExam {	//abstract를 class 앞에 부쳐서 추상클래스로 만들 수 있다.
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// abstract 클래스는 new 할 수 없다.
//		Phone phone = new Phone();
		
		SmartPhone sp = new SmartPhone();
		
		Phone phone = (Phone)sp;
	}

}
