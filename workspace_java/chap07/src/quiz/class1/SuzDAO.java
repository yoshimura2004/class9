package quiz.class1;

import java.util.HashMap;

public class SuzDAO {
	
	HashMap map = new HashMap();
	
	SuzDAO(){
		map.put("트윅스", "초콜릿");
		map.put("점심", "달식당");
		map.put("회식", "어디로 가요?");
		map.put("휴식", "네!");
		map.put("강사혐오", "아니오!");
	}	
	
	String selectAnswer(String question) {
		return (String)map.get(question);
	}
}
