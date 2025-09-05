package quiz.class1;

public class SuzController extends Student {

	public SuzController(){
		super("Suz");
	}
	
	SuzService suzService = new SuzService();
	
	@Override
	String answer(String question) {
		String result = suzService.getInfo(question);
		return result;
	}
	
}
