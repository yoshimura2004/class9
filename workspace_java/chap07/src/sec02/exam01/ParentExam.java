package sec02.exam01;

public class ParentExam {

	public static void main(String[] args) {
		
		Parent1_1_1 p1_1_1= new Parent1_1_1();
		
		Parent1_1 p1_1 = (Parent1_1)p1_1_1;
		p1_1 = p1_1_1; //형변환 생략 가능
		
		Parent1 p1 = p1_1;
		p1 = p1_1_1;
		
		Parent1 pp1 = new Parent1_1_1();
		
		/////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		Parent1_2 p1_2 = new Parent1_2();
		Parent1 ppp1 = p1_2;
		
		// 부모가 자식이 될 때
		// 형 변환 연산자 생략이 안된다.
		Parent1_2 pp1_2 = (Parent1_2)ppp1;
		
		// 런타임 runtime 오류 : 실행해 보아야 아는 것이다.
		Parent1_2 ppp1_2 = (Parent1_2)pp1;
		String a = null;
		System.out.println(a.length());
	}

}
