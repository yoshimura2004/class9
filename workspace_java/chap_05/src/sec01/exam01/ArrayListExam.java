package sec01.exam01;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		
		
		//휴먼카페 1호점
		String[] menu = new String[2];
		menu[0] = "자바칩프라푸치노";
		menu[1] = "말차라떼";

		//휴먼카페 2호점
		//얕은 복사
		String[] menu2 = menu;
		
		
		// 2호점에서 딸기라떼를 추가
		menu2 = new String[3];
		menu2[0] = menu [0]; 
		menu2[1] = menu [1];
		menu2[2] = "딸기라떼";
		System.out.println(menu2[1]);
		
		// ArrayList 사용법
		ArrayList list = new ArrayList();
		
		//추가
		list.add(1);
		list.add("문자");
		list.add(false);
		list.add("사랑");
		//Use
		System.out.println(  list.get(0)    );
		System.out.println(  list.get(1)    );
		System.out.println(  list.get(2)    );
		
		//크기
		System.out.println(  list.size()   );
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> list2 = new ArrayList();
		list2.add("첫번 째");
		list2.add("두번 째");
		
		for(String data : list2) {
			System.out.println(data);
		}
	
		
		
		
		
		
		
		
	
		
	}

}
