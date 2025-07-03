package sec04.exam03_return;

public class Car {
	
	int gas;
	int speed;
	void setGas(int g) {
		gas = g;
	}
	//만약 주서글 달았으때, gas가 0이면 false 그렇지 않으면 ture로 돌려주는 메소드
	
	boolean isLeftGas() { 
		if(gas == 0) {
			System.out.println("가스가 없습니다");
			return false;
			//return 하는 순간에 메소드 종료!
		}//else{		
		//else 가 있다는 건 무조건 하나는 실행되는 것을 보장!
		System.out.println("가스가 있습니다");
		return true;
	}
	
	boolean isLeftGas2() {
		boolean result = false;
		if(gas == 0) {
			System.out.println("가스가 없습니다");
			result = false;
		}else{
			System.out.println(("가스가 있습니다"));
			result = true;
		}
		return result;
}
	boolean isLeftGas3() {
		return gas !=0;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달려잇 잔량:" + gas);
				gas--;
			}else {
				System.out.println("멈춘다 잔량:"+ gas);
				return;
			}
		}
	}
}
