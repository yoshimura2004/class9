package Quiz;

public class Dictionary {
		
	/*
	
	&&는 거짓을 찾아가는 과정이다.
	||는 참을 찾아가는 과정이다.
	
	전자사전 만들기 class에서.
	 단어 En2Ko(영단어) 
	영단어 Ko2En(한국단어)
	String [] En {love, hate, devil, angel}
	String [] Ko {사랑, 증오, 악마, 천사}	
	love 입력 시 사랑. hate 입력시 증오. devil 입력시. 악마 angel 입력시 천사. 이런식으로.
	*/
	String [] En = new String [] {"love", "hate", "devil", "angel"};
	String [] Ko = new String [] {"사랑", "증오", "악마", "천사"};
	
	// 한국단어 En2Ko(영단어)
	String En2Ko(String word) {
	    	for (int i = 0; i < En.length; i++) {
	        if (En[i].equals(word)) {
            return Ko[i];  // 같은 인덱스의 한국어 반환
	    }
	}
	return "사전에 없는 단어입니다."; // 사전에 없는 단어 입력시 종료.
	}
	// 영어 -> 한국어
	
	// 영단어 Ko2En(단어)
	String Ko2En(String word) {
	    	for (int i = 0; i < Ko.length; i++) {
	        if (Ko[i].equals(word)) {
            return En[i];  // 같은 인덱스의 영어 반환
	    }
	}
	return "사전에 없는 단어입니다.";
	}
	// 한국어 -> 영어

	
	
	
	
}
