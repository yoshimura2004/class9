package quiz.class1;

public class SuzService {
	
	SuzDAO suzDAO = new SuzDAO();
	
	// 머리 속
	String getInfo(String question) {
		String result = suzDAO.selectAnswer(question);
		if (result == null) {
			result = "... (신중히 생각 중 입니다.)";
		} else {
			result = "흐음... 저는요" + result + "이거요";		
		}
		return result;
	}
	// gpt
	// 노션
	
}