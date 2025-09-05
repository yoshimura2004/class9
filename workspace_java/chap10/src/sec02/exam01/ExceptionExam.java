package sec02.exam01;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("딸랑딸랑");
		for(int i = 0; i < args.length; i++) {
			System.out.println(i + ":"+ args[i] );
		}
		int a = -1;
		try {
			String name = "suz";
			a = Integer.parseInt(name);
			
			System.out.println(args[100]);	
			System.out.println("1번자리");
			
//		} catch (Exception e) {
//
//			System.out.println("4번자리");
//			e.printStackTrace(); << 이건만은 꼮 기억하자
//			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("2번자리");
			e.printStackTrace();
			
		} catch (NumberFormatException e) {
			System.out.println("3번자리");
			e.printStackTrace();
			System.out.println("----------------------");
			System.out.println(e);
			System.out.println("//////////////////////");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 무조건 실행");
		}
		// finally는 무조건 실행을 보장해 준다. 강력하다.
		System.out.println("출력");	
		System.out.println("a:" + a);
		}

}
