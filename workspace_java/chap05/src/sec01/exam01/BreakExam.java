package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Game Start");
		int count = 0;
		while(true) {
			int num =(int)(Math.random()*6) + 1;
			System.out.println("dice:" + num);
			if( num == 6) {
				break;
			}
			count++;
		}
		System.out.println("Game over:"+ "total :" + count);
		
		
		
		for (int i = 0; i<5; i++) {
			System.out.println("i:" + i);
			
			for (int j = 0; j<20; j++) {
				System.out.println("j"+j);
				if(j >=2) {
					System.out.println("break");
					break;
				}
		
				
				boolean isStop = false;
				
				for(int k = 1; k<=5; k++) {
					
					for(int h = 1; h<=3; h++) {
						int num2 =(int)(Math.random()*6) + 1;
						System.out.println("dice2:" + num2);
						if( num2 == 6) {
							isStop = true;
							break;
						}
						
				}
				if(isStop){
					break;
					}
				}
					
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
	}

}
