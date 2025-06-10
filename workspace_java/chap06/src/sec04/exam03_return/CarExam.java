package sec04.exam03_return;

public class CarExam {

	public static void main(String[] args) {

		Car car = new Car();
		boolean st = car.isLeftGas();
		System.out.println("가스 남음?"+st);
		
		car.gas =3;
		car.setGas(3);
		
		st = car.isLeftGas();
		System.out.println("가스가 남았나?" + st);
		
		if(car.isLeftGas()) {
			System.out.println("출발!");
			car.run();
		}
				
	}

}
