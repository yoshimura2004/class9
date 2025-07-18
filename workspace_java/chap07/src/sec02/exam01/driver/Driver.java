package sec02.exam01.driver;

public class Driver {
	
	void driveTico(Tico tico) {
		System.out.println("맛있는 아이스크림");
		tico.run();
		tico.autoRun();
	}
	
	void drive(Car car) {
		System.out.println("준비!");
		car.start();
		car.run();
		
		if( car instanceof Tico ) {
			System.out.println("어 아이스크림이네요?");
			Tico tico= (Tico) car;
			tico.autoRun();
			
			((Tico) car).autoRun();
		}
		
		car.stop();
		
		//car.autoRun(); autoRun은 Car에 없다.
	}
}
