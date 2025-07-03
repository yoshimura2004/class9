package FUS;

import java.util.Scanner;

public class CoffeeManager {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
        boolean running = true;

        String coffeeType = "";
        String coffeeDetail = "";
        String extraOption = "";
        int price = 0;

        while (running) {
            System.out.println("=== 커피 생산 관리 시스템 ===");
            System.out.println("1. 커피 종류 선택");
            System.out.println("2. 처음으로 돌아가기");
            System.out.println("3. 종료");
            System.out.print("번호를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); 

            if (menu == 1) {
                // 1단계:  커피 종류
                System.out.println("== 커피 종류 선택 ==");
                System.out.println("1. 에스프레소");
                System.out.println("2. 라떼");
                System.out.println("3. 모카");
                System.out.print("선택: ");
                int type = scanner.nextInt();
                scanner.nextLine();
                
                switch (type) {
                    case 1:
                        coffeeType = "에스프레소";
                        price = 2000;
                        break;
                    case 2:
                        coffeeType = "라떼";
                        price = 3000;
                        break;
                    case 3:
                        coffeeType = "모카";
                        price = 3500;
                        break;
                    default:
                        System.out.println("잘못된 선택입니다.");
                        continue;
                }

                // 2단계: 상세 종류
                System.out.println("== 상세 종류 선택 ==");
                System.out.println("1. 기본");
                System.out.println("2. 디카페인 (+500원)");
                System.out.print("선택: ");
                int detail = scanner.nextInt();
                scanner.nextLine();

                if (detail == 1) {
                    coffeeDetail = "기본";
                } else if (detail == 2) {
                    coffeeDetail = "디카페인";
                    price += 500;
                } else {
                    System.out.println("잘못된 선택입니다.");
                    continue;
                }

                // 3단계: 옵션 선택 (생략 가능)
                System.out.println("== 추가 옵션 선택 ==");
                System.out.println("1. 없음");
                System.out.println("2. 샷 추가 (+1000원)");
                System.out.print("선택: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option == 1) {
                    extraOption = "없음";
                } else if (option == 2) {
                    extraOption = "샷 추가";
                    price += 1000;
                } else {
                    System.out.println("잘못된 선택입니다.");
                    continue;
                }

                // 결과 출력
                System.out.println("=== 최종 선택 ===");
                System.out.println("커피 종류: " + coffeeType);
                System.out.println("상세 종류: " + coffeeDetail);
                System.out.println("추가 옵션: " + extraOption);
                System.out.println("최종 가격: " + price + "원");

            } else if (menu == 2) {
                // 모든 선택 초기화
                coffeeType = "";
                coffeeDetail = "";
                extraOption = "";
                price = 0;
                System.out.println("처음으로 돌아갑니다.");

            } else if (menu == 3) {
                System.out.println("시스템을 종료합니다.");
                running = false;
            } else {
                System.out.println("올바른 메뉴 번호를 선택해주세요.");
            }
        }

	}

}
