package Quiz;

public class FrootShop {
	
	/*
	과일
	# 필드
	이름
	가격
	재고
==========================	
	과일가게
	# 필드
	가게명
==========================
	과일클래스자체를  배열로 만들어서 써준다.
	 ex) Froot [] ...
==========================
	# 생성자
	가게명 필수
==========================
	# 메소드
	1. 가격 가격문의(과일 종류, 갯수)
	2. void 전체목록출력()
	3. 거스름돈/ 결제(과일 종류, 갯수, 금액)
		(과일 종류 없을 때, 수량 없을 때, 돈 모지랄때)
	4. 택배 성공여부 랜덤 사용 안하고 (주소, 종류, 갯수)
*/	
/*	Froot 클래스 클래스 배열로만들기
 * 
 * 	생성자
 * 
 */

	String  suzs;
    Froot[] fruits;  // 과일 배열 Froot클래스 배열

    // 생성자 선언: 가게명 필수
			FrootShop(String shopName) {
			this.suzs = shopName;

        // 예시 과일 배열 초기화
        	fruits = new Froot[] {
            new Froot("사과", 1000, 45),
            new Froot("바나나", 1200, 8),
            new Froot("포도", 2000, 5),	
        	new Froot("자두", 3000, 4),
        	new Froot("파인애플", 5000, 2)
        	};
    }

			//1번 메소드 가격 문의
			int getPrice(String fruitName, int count) {
	    	for (Froot f : fruits) {
	        if (f.name.equals(fruitName)) {
            return f.price * count;
	        }			//향상된 for문
	    	}
	    	return 0; // 없는 과일일 때
			}
			
			// 2번 메소드 전체 목록 출력
			void printAll() {
		    System.out.println("=== " + suzs + "의 재고 목록 ===");
		    for (Froot f : fruits) {
	        System.out.println(f.name + " - 가격: " + f.price + "원 / 재고: " + f.stock + "개");
			}
			}
			
		    // 3번 메소드 결제 
			/* 경우의 수
			 * 1. 재고 모지랄 때
			 * 2. 돈 모지랄때
			 * 3. 과일이 아예 없을 때
			 * 
			 */
		    int buy(String fruitName, int count, int money) {
		    for (Froot f : fruits) {
		    if (f.name.equals(fruitName)) {	
		    if (f.stock < count) {
		    System.out.println("재고가 부족합니다");
		    return money;
		                }
			int totalPrice = f.price * count;
			
			if (money < totalPrice) {
		    System.out.println("돈이 부족해요!");
		    return money;		// 돈 모지랄 때
			}
			f.stock -= count;
			System.out.println(fruitName + " " + count + "개 구입 성공!");
			return money - totalPrice; // 거스름돈 돌려주기
			    }
			}
			System.out.println("해당 과일이 없습니다.");
		    return money;		// 과일 없을 때
			}			
		    
		    // 4. 택배 랜덤사용안하고 하기
		    // 1. 재고부족
		    // 2. 과일(항목)이 없음
			boolean delivery(String address, String fruitName, int count) {
			for (Froot f : fruits) {
			if (f.name.equals(fruitName)) {
			if (f.stock > count) {
			f.stock -= count;
			System.out.println(address + "로 " + fruitName + " " + count + "개 택배 발송 완료!");
			return true;
			} else {
			System.out.println("재고 부족으로 배송 실패!");
			return false;
			}
			}
			}
			System.out.println("해당 과일 없음");
			return false;
			}
			
    
			
			
}
