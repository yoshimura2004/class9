package sec03.exam01.constructor;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		
		Car c = new Car(null);
		Car c2 = new Car("black");
		System.out.println(c.maxSpeed);
	
	}
}