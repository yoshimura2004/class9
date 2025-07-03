package sec01.exam01;

import java.util.Random;
import java.util.Scanner;

public class ArrayQuestion {

	public static void main(String[] args) {
		
		System.out.println("=문제 1번=");
		int [] arr0 = {1, 2, 3};
		int [] arr01 = new int [arr0.length];
		for  (int i = 0; i < arr0.length; i++) {
			arr01[i]= arr0[i];
		}
		for  (int i = 0; i < arr0.length; i++) {
			System.out.println(arr01[i]);
		}
////문제 1: 문제 뒤집기: {1,2,3} -> {3,2,1}
		
//        	
//		}
		
/*
보기:	[3,4,7,5,1,4,9]
문제 2: 보기에서 홀 수 개수 찾기	
		[3,4,7,5,1,4,9]
*/			System.out.println("==문제 2==");
			int [] num2 = new int [] {3,8,7,5,1,4,9};
			int count = 0;
		
			for(int i2 = 0; i2<num2.length; i2++){
				
			if(num2[i2]%2 !=0 ) {
					count = num2[i2];
				System.out.print(count);
				}
			}
		System.out.println();
/*	
문제 3: 보기에서 4보다 큰 수 찾기
*/	
			System.out.println("===문제 3===");
			int [] num3 = new int [] {3,8,7,5,1,4,9};
	
			for(int i3 = 0; i3<num3.length; i3++) {
				
			if(num3[i3] > 4) {
			
				}
			System.out.print(num3[i3]+" ");
			}
			System.out.println();
//문제 4: 보기에서 최댓값 구하기
	
			int [] num4 = new int [] {3,8,7,5,1,4,9};
			
			int max = num4[0];
			
			for(int i4 = 0; i4 < num4.length; i4++) {
			
				if (num4[i4] > max) {
			        max = num4[i4];
			    }
			}
			
			System.out.println("문제 4번 :" + max);		
			
			 
			
			/*
문제 5: 보기에서 두번 째 큰 수 구하기
*/
			int [] num5 = new int [] {3,8,7,5,1,4,9};
			
			int max2 = num5[0];
			int max3 = num5[0];
	
			for (int i5 = 0; i5 < num5.length; i5++) {
			    if (num5[i5] > max2) {
			        max3 = max2;
			        max2 = num5[i5];
			    } else if (num5[i5] > max3 && num5[i5] != max2) {
			        max3 = num5[i5];
			    }
			}
			
			System.out.println("문제 5번 :"+ max3);
			
		
		
/*
문제 6: 오른쪽으로 한 칸 밀기(왼쪽은 0으로 채우기)  ex) [0,3,4,7,5,1,4,9]
*/		
			int[] num6 = new int[] {3, 8, 7, 5, 1, 4, 9};
			
			int[] result = new int[num6.length + 1];
			//방 늘이기
		
			for (int i6 = 0; i6 < num6.length; i6++) {
			    result[i6 + 1] = num6[i6];		
			}
			
			System.out.print("문제 6번: ");
			for (int n : result) {				//각성for문 적용
			    System.out.print(n+ " ");
			}
			System.out.println();
		
/*
문제 7: 오른쪽으로 이동 하는 데 맨 끝에 값을 맨 처음으로 보내기.
		[3,5,7,5,1,9,4] -> [4,3,4,7,5,1,9]
*/
		// 오른쪽으로 이동
		// 하면서 숫자가 넘어가야함
			int[] num7 = new int[] {3, 8, 7, 5, 1, 9, 4};

			int last = num7[num7.length - 1];
//마지막자리 쳐 내고 자리 만들기
			for (int i7 = num7.length - 1; i7 > 0; i7--) {
			    num7[i7] = num7[i7 - 1];
			}
		
			num7[0] = last;
//대입			
			System.out.print("문제 7번: ");		//각성for문 
			for (int n : num7) {
			    System.out.print(n + " ");
			}
		System.out.println();
		
		
		
/*
문제 8: 임시 비밀번호 8자리 생성
8-1: 숫자만
8-2: 소문자만		
8-3: 숫자 2개 이상, 대/소문자 각 1개 이상
임시 비밀번호 8자리
------------
8-1 ---------++ 숫자로만 8자리==============
*/		
		String password = "";

        for (int i = 0; i < 8; i++) {
            int dg = (int)(Math.random() * 10); // 0~9 사이의 정수
            password += dg;
        }
        System.out.println("문제 8-1 :" +password);

// 8-2 
        String pw = "";

        for (int c = 0; c < 8; c++) {
           
    							//알파벳 개 수 26개 
    	char LT = (char)((int)(Math.random() * 26) + 'a'); 
        pw += LT;
        }

        System.out.println("문제 8-2: " + pw);
        
// 8-3
        char[] password2 = new char[8];
        int index = 0;

        // 숫자 2개 넣기 (0~9)
        for (int i = 0; i < 2; i++) {
            password2[index++] = (char)((int)(Math.random() * 10) + '0');
        }

        // 소문자 1개 (a~z)
        password2[index++] = (char)((int)(Math.random() * 26) + 'a');

        // 대문자 1개 (A~Z)
        password2[index++] = (char)((int)(Math.random() * 26) + 'A');

        // 나머지 4자리를 랜덤하게 채우기 (숫자, 소문자, 대문자 중 랜덤)
        while (index < 8) {
            int type = (int)(Math.random() * 3); // 0: 숫자, 1: 소문자, 2: 대문자

            if (type == 0) {
                password2[index++] = (char)((int)(Math.random() * 10) + '0');
            } else if (type == 1) {
                password2[index++] = (char)((int)(Math.random() * 26) + 'a');
            } else {
                password2[index++] = (char)((int)(Math.random() * 26) + 'A');
            }
        }

        // 배열 섞기 
        for (int i = 0; i < password2.length; i++) {
            int j = (int)(Math.random() * 8);
            char temp = password2[i];
            password2[i] = password2[j];
            password2[j] = temp;
        }

        // 출력
        System.out.print("임시 비밀번호: ");
        for (char c : password2) {
            System.out.print(c);
        }
        System.out.println();
        
        
        
        
        

/*
문제 9: 자리가 10개 있는 소극장의 예약 시스템
자리 번호는 1~10번까지 번호의 자리가 있습니다.
메뉴: "1.예약 2.모든 좌석 현황 3.잔여 좌석 0. 종료"
만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
만약2 : 예약이 불가능하다면 "이미 예약되어 있습니다"
		*/
//	문제 10: 로또 6개 생성. 단 중복 없이.		
	
      
        int[] lotto = new int[6];
        boolean flag = false;
        for(int i=0; i<lotto.length; i++) {
            do {
                flag = false;
                lotto[i] = (int)(Math.random()*45) + 1;
                for(int j=0; j < i; j++) {
                    if(lotto[j] == lotto[i]) {
                        System.out.println("중복:"+ lotto[i]);
                        flag = true;
                    }
                }
            } while( flag );
        }
        for(int i=0; i<lotto.length; i++) {
            System.out.print(lotto[i]+ ", ");
        }
        System.out.println();
		
	}

}
