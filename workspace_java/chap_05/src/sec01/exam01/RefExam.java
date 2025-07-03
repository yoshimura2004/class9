package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = a;
		System.out.println(a+" "+b);
		
		b= 12;
		System.out.println(a+" "+b);
		
		String c = "김경식";
		// = 을 기준으로 오른쪽이 먼저 실행된다.
		// 즉 "김경식"을 heap영역의 비어있는 번지에 할당한다(놓기).
		// stack영역의 변수 c에 방금 번지를 저장.
		System.out.println("내이름은 :"+c);
		
		System.out.println(a == b);
		// ==또는 !=는 무조건 stack 에서의 값만을 비교한다.
		
		String d = new String("김경식");
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
		// String 값 비교는 무조건 equals()를 사용한다.
		
		String e = d;
		System.out.println(e == d);
		
		String f1 = "김경식";
		String f = "김"+ "경식";
		System.out.println(f==f1);
		
//		a = null;
//		기본 타입에는 null을 넣을 수 없다.
		
//		null은 참조하는 주소가 없는 상태
		String g = "휴면";
		System.out.println("g == null :" + (g == null));
		
		String  h = "";
		System.out.println("h == null :" + (h != null));
		
		g = null;
		
		System.out.println("g == null :" + (g == null));
		System.out.println("g + \"abc\" =" + (g+""));
		
		
		
		
		
	}

}
