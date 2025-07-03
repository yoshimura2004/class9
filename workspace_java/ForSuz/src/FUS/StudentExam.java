package FUS;

import java.util.ArrayList;

public class StudentExam {

	public static void main(String[] args) {
	

	ArrayList<Student>students = new ArrayList<>();
	
	students.add(new Student("suz", 20));
	students.add(new Student("lyu", 23));
	students.add(new Student("yuri", 23));

			
	for (Student s : students) {
		s.introduce();
	}	
	
	
	ArrayList<Animal>animals = new ArrayList<>();
	animals.add(new Animal("강아지",3));
	
	for (Animal a : animals) {
		a.introduce();
	}
		
		

	
		
	}

}
