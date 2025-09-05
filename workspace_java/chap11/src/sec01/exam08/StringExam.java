package sec01.exam08;

public class StringExam {

	public static void main(String[] args) {
		
		System.gc(); // 이걸로 가베지컬렉터를 직접 부를 수 있다.
	
		String s1 = "영일이삼사오육칠팔구삼사";
		
//		char c = 'a';
//		char c = s1.charAt(110); // 범위 예외 발생
		char c = s1.charAt(2);		
		System.out.println("char c :" + c);
		
		int i1 = s1.indexOf("삼사");
		System.out.println("i1: " + i1);
		
		int i2 = s1.lastIndexOf("삼사");
		System.out.println("라스트 :" + i2);
		
		int i3 = s1.indexOf("a");
		System.out.println("i3 :" + i3);
		
		// 이메일 양식 점검
		// @와 .이 하나 이상 있는가?
		String email =  "todair@naver.com";
		// if @가 있는가, else if .이 하나 이상 있는가. String 문자 문자니까
		if(email.indexOf("@") != -1 && email.indexOf(".") >=0) {
			System.out.println("이메일이 맞음");
		} 
	
		// indexOf 구현
		// email에 첫 @가 몇번 째에 있는지
		//charAt
		
		int idx = -1;
		for(int i = 0;  i < email.length(); i++) {
			if(email.charAt(i) == '@') {
				idx = i;
				break;
			}
		}
		System.out.println("idx:" + idx);
		
		
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		// replace는 모두 바꿔준다
		
		String s3 = s1.substring (5,8);
		System.out.println("s3 :" + s3);
		
		//주민번호로 남잔지 여자인지 남자: 1,3 여자: 2,4
		//charAt
//		String ssn = "123456-1234567";
//		
//		char Male = ssn.charAt(7);
//		
//		if(Male == '1') {
//			System.out.println("남자입니다.");
//		}else if(Male == '3') {
//			System.out.println("이것도 남자입니다.");
//		}
		
		String ssn = "123456-1234567";
		int start = ssn.indexOf("-") + 1;
		int end = start + 1;
		String s4 = ssn.substring(start, end);
		if(s4.equals("1") || s4.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//문제 1 
		// blog.naver.co.kr에서 naver만 추출하기
		// . 앞 뒤 잘라주고 나머지 나오게하기!
		String mail = "blog.naver.co.kr";
		
		int first = mail.indexOf(".") + 1;
		int second = mail.lastIndexOf(".") - 3;
		
		String mail2 = mail.substring(first, second);
		System.out.println("naver만 나와라:  " + mail2);
		
		
		//문제 2 응원 전광판
		// "Hello world"
		// "ello world H"
		// "llo world He"  제일 앞에 글자가 순서대로 글자 맨 뒤로가게 하기.
		// 맨 앞에 꺼 떼다가 뒤에 붙이기

        String billboard = "Hello world";
        System.out.println(billboard);
        
        for(int i = 0; i < billboard.length(); i++) {
        	
            char firstChar = billboard.charAt(0);
            billboard = billboard.substring(1) + firstChar;
            System.out.println(billboard);
        } 
		
		// 문제 3 마스킹
		// humanec@naver.com 이걸
		// hu*****@naver.com 앞에 두 글자 빼고 마스킹처리
        // 앞에 두개만 자르기. 
        // @까지 나오게하고 둘 사이를 *로 나오게하기.
        // substring으로 앞에 두글자만 자르고 @위치 찾고 반복문
        
        String id = "humanec@naver.com";
        
        String masking = "";
        int masking2 = id.indexOf("@");
        String masking3 = id.substring(0,2);
        
        for (int i = 2; i < masking2; i++) {
        	masking += "*";
        }
        
        String back = id.substring(masking2);
        
        String result = masking3 + masking + back;
        System.out.println(result);
    	

        ///////////////////문제 4번 란////////////////////////
        
        String s5 = " 글씨         중간공백 ";
        System.out.println("["+s5+"]");
        System.out.println("["+s5.trim()+"]");
        
        String menu = "김밥,라면,돈가스,제육덮밥";
        String [] menus = menu.split(",");
        for(String m : menus) {
        	System.out.println(m);
        }
        
        String url = "blog.nvaer.com";
        // split 정규 표현식을 사용 (String 아님에 주의)
        // .은 정규 표현식에서 사용하는 의미 있는 예약어라서
        // 문자 .으로 인식하지 않는다.
//        String [] urls = url.split("."); //
        String [] urls = url.split("\\."); // .을 표현하는(예약어) 방법 1
        String [] urls2 = url.split("[.]"); // .을 표현하는(예약어) 방법 2
        System.out.println(urls.length);
        System.out.println(urls2.length);
    	
        String a = "a";
        a += "b";
        a = a + "c";
        
        // StringBuffer
        // 메모리를 효율적으로 사용한다.
        // StringBuilder보다 쪼끔 느립니다.
        // 느린이유: Thread에 안전하다. (Thread-safe)
       StringBuffer sb = new StringBuffer("a"); //Buffer는 메모리를 뜻한다.
       sb.append("b");
       sb.append("c");
       String d = sb.toString();
       
       // 스레드에 안전하지 않다.
       StringBuilder sbb = new StringBuilder("a");
       sbb.append("b");
       String d2 = sbb.toString();
       
	}

}
