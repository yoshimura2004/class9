package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {

	public static void main(String[] args)  {

		try {
			test();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test2(100);
			
			
		} catch (HumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			String errorCode = e.getMessage();
			if(errorCode.equals("EV10")) {
				System.out.println("볼륨은 10보다 작게!");
			}
		}
		
		// try-with-resources 책에 안 나와있고, 모르면 당황한다.
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream ("c:\\tmp\\text.txt");
			//뭔가 함
			//예외 발생 가능
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			if(fis != null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
			// try-with-resources
			// close() 자동 실행
			// Closeable 인터페이스가 있는 클래스만 ()안에 넣을 수 있다. 
		try (
			// String a =""; // Closeable 인터페이스 없음jvm 이란
			FileInputStream fis2 =  new FileInputStream ("c:\\tmp\\text.txt");
				) {
			System.out.println("뭔가 함");
			System.out.println(fis2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void test() throws ClassNotFoundException, IOException {
		Class.forName("suz");
	}
	static void test2 (int vol) throws HumanException {
				if(vol>10) { // 고의로 error을 발생시킬 수 있따.
			throw new HumanException("EV10");
		} else if (vol<0) {
			throw new HumanException("EV0");
		}
			System.out.println("vol :" + vol);			
	}
	
	static void test3() {
		try {
			
			//코딩
			
				
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
