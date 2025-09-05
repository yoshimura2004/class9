package sec01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {

	public static void main(String[] args) {
		
		long before = System.currentTimeMillis();
		
		for(int i = 0; i<10000000; i++) {
//			System.out.println(i);
		}
		
		long after = System.currentTimeMillis();
		System.out.println("걸린 시간 :" + before);
		System.out.println("걸린 시간 :" + after);
		System.out.println("걸린 시간 :" + (after - before) +"ms");
		System.out.println(Long.MAX_VALUE);
		
		//시간 잴 때 많이 사용한다.
		
		Date date = new Date();
		System.out.println(date);
		
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate =  sdf.format(date);
		System.out.println("현재 시간 정보 :" + strDate);
	}

}
