package Quiz;

public class Froot {
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
	가격 가격문의(과일 종류, 갯수)
	void 전체목록출력()
	거스름돈 결제(과일 종류, 갯수, 금액)
	성공여부 택배(주소, 종류, 갯수)
*/	
	/*	
	 * 클래스파일 1 Froot
	 * 클래스 파일 1에서는 과일의 정보만 적는다.
	 * 
	 * 과일 이름: String
	 * 과일 가격: int
	 * 과일 재고 : stock
	 * 
	 */
	
	String name;
    int price;
    int stock;
      
    Froot (String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
	
}
