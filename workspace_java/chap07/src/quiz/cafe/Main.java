package quiz.cafe; //실행 Main

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe myCafe = new Starbucks("휴먼점");

		myCafe.addMenu("아메리카노", 4000);
		myCafe.addMenu("카페라떼", 4500);
		myCafe.addMenu("바닐라라떼", 4800);
		myCafe.addMenu("초코라떼", 5000);


		Alba start = new Alba();
		start.run(myCafe);

	}

}
