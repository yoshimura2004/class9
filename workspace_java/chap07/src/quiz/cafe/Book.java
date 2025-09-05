package quiz.cafe;

public class Book {
		String title;
		int price;
		
		public Book(String title){
			this(title, 10000);
		}
		
		public Book(String title, int price) {
			this.price = price;
			this.title = title;
		}
		
		void info(){
		System.out.println("제목 :"+ title + "/가격 :"+ price);
		}
}
