package day12;

import java.util.Scanner;

public class StudentManagerTest {

	public static void main(String[] args) {
		/*학생 성적 관리 프로그램을 작성하세요.
		 * -작성하기 위해 필요한 작업들을 주석으로 정리해보세요.
		 * 1) 프로그램에 필요한 기능을 정리.
		 * 메뉴
		 * 1. 학생 정보 추가
		 * 2. 학생 성적 추가
		 * 3. 학생 정보 출력
		 * 4. 프로그램 종료
		 * 
		 * 2) 프로그램 실행 과정은 어떻게 할 것인가?
		 * 1. 학생 정보 추가
		 *  - 학년, 반, 번호, 이름을 입력하여 학생 정보 추가
		 *  - 학년 , 반, 번호가 같은 학생이 이미 있으면 추가하지 않음
		 *  2. 학생 성적 추가
		 *  - 학년, 반, 번호로 학생을 검색한 후, 있으면 성적을 추가
		 *  - 성적 추가시 과목명, 중간, 기말, 수행 평가를 입력하여 추가한다.
		 *  - 이미 추가된 과목(학기랑 과목명이 같으면)이면 추가하지 않음
		 *  3. 학생 정보 출력
		 *  
		 * 3) 정보를 효율적으로 관리하기 위해 클래스를 만들것인가? 만든다면 어떤 클래스를 만들 것인가
		 *  - 학생 클래스 (HighStudent)
		 *  - 성적 클래스 (Score)
		 *  
		 *  4) 프로그램 실행 과정을 주석으로 작성.
		 *
		 * */
		Scanner sc = new Scanner(System.in);
		int menu; 
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			}while(menu==4);
		
		
		
	}
//메뉴를 출력하는 메소드
public static void printMenu() {
	
	System.out.println(" - - - - - - - - - - -");
	System.out.println("1. 학생 정보 추가");
	System.out.println("2. 학생 성적 추가");
	System.out.println("3. 학생 정보 출력");
	System.out.println("4. 프로그램 종료");
	System.out.println(" 메뉴 선택 : ");
		
}

//메뉴를 작동하는 메소드
public static void runMenu(int menu) {
	switch(menu) {
	case 1 : 
		System.out.println("학생 정보 추가 메뉴입니다");
		
		int [] arr = new int[3];
		HighStudent hs = new HighStudent();
		hs.addInfor();
		
		
		break;
	case 2 :
		System.out.println("학생 성적 추가 메뉴입니다.");
		break;
	case 3 :
		System.out.println("학생 정보 출력 메뉴입니다.");
		break;
	case 4 :
		System.out.println("프로그램을 종료합니다.");
		break;
		
	}
	
//	
}

}
	

