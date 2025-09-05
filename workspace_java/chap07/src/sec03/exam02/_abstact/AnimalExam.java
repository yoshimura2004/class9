package sec03.exam02._abstact;

public class AnimalExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Cat();
		a.sound();
		Cat cat = (Cat)a;
		
		System.out.println(cat.kind);
		testSound(cat);
		System.out.println(cat.kind);
		
	}
	static void testSound(Animal animal) {
		animal.sound();
		animal.kind = "뀨뀨";
	}
	
}
