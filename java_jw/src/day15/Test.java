package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*가계부 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 내역 추가
		 * 2. 내역 확인
		 * 3. 내역 수정
		 * 4. 종료
		 * 
		 * 1.  내역 추가
		 * 구분 : 수입/지출
		 * 분류 :  식비/통신비/교통비/생활비/용돈
		 * 내용 :  편의점/XX식당
		 * 금액 : 5000
		 * 일시 : 년, 월, 일
		 * 
		 * 2. 내역 확인
		 * 2-1. 전체 내역 확인
		 * 2-2. 년 내역 확인
		 * 2-3. 월 내역 확인
		 * 2-4. 일 내역 확인
		 * 구분 | 일시 | 분류 | 내용 | 금액 순으로
		 * 
		 * 3. 내역 수정
		 * 년, 월, 일로 검색 후 내역 출력
		 * 번호를 입력
		 * 입력 받은 번호에 맞는 내역을 수정 - 구분/일시/분류/내용/금액순으로
		 * 
		 * 4. 내역 삭제
		 * 년, 월, 일로 검색 후 내역 출력
		 * 번호를 입력
		 * 입력 받은 번호에 맞는 내역을 삭제
		 * 
		 * 추가 - 가계부를 년, 월, 일로 정렬
		 * ---------------------
		 * 가계부가 필요
		 * 가계부는 내역들로 구성
		 * 가계부 클래스 필요
		 * 내역(항목) 클래스 필요
		 * 가계부는 내역들을 가지고 있다. (포함 관계) ->가계부 클래스에 내역 객체가 필드
		 * 내역 추가, 확인, 수정, 삭제 기능을 인터페이스로 묶을 수 있다.
		 * */ 
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		
		do {
			printMenu();
			runMenu(menu);
			menu = sc.nextInt();
		}while(menu !=4);

	}
	ArrayList<HouseHold> holdList = new ArrayList<HouseHold>();
	
	private static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			 /*1.  내역 추가
			 * 구분 : 수입/지출
			 * 분류 :  식비/통신비/교통비/생활비/용돈
			 * 내용 :  편의점/XX식당
			 * 금액 : 5000
			 * 일시 : 년, 월, 일*/
			Scanner sc= new Scanner(System.in);
			System.out.print("구분(수입/지출) :  ");
			String inOrOut = sc.next();
			System.out.print("분류(식비/교통비/통신비/생활비/용돈) :  ");
			String cate = sc.next();
			System.out.print("내용 :  ");
			String contents = sc.next();
			System.out.print("금액 :  ");
			int money = sc.nextInt();
			System.out.print("일시(yyyy-mm-dd) :  ");
			String date = sc.next();
			
			
			
			
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
		default :
			break;	
		}
	}

	private static void printMenu() {
		System.out.println(" - - - - - - - - - - - - - - - - -");
		System.out.println("메뉴");
		System.out.println("1. 내역 추가");
		System.out.println("2. 내역 확인");
		System.out.println("3. 내역 수정");
		System.out.println("4. 종료");
		System.out.print("메뉴 선택 : ");
		
	}

}
