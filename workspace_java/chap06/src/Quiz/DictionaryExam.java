package Quiz;

public class DictionaryExam {

	public static void main(String[] args) {
		
			Dictionary	Dc	= new Dictionary();
			
			System.out.println(Dc.En2Ko("love"));
			System.out.println(Dc.En2Ko("devil"));
			System.out.println(Dc.En2Ko("angel"));
			System.out.println(Dc.En2Ko("hate"));
			
			System.out.println(Dc.Ko2En("사랑"));
			System.out.println(Dc.Ko2En("악마"));
			System.out.println(Dc.Ko2En("천사"));
			System.out.println(Dc.Ko2En("증오"));
			
			
	}

}
