package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListEx01 {

	public static void main(String[] args) throws Exception {
		/*리스트를 이용하여 다음 기능을 갖는 오늘의 할 일 프로그램을 작성하시오 (아래 예시)
		 * 메뉴
		 * 1. 할 일 추가
		 * 2. 할 일 확인
		 * 3. 할 일 삭제
		 * 4. 종료
		 * 메뉴 선택 : 1
		 * ----------------------
		 * 할 일 입력 :  오후 수업 참여
		 * ----------------------
		 *메뉴
		 *1. 할 일 추가
		 *2. 할 일 확인
		 *3. 종료
		 *메뉴 선택 : 2
		 *----------------------
		 *1. 오후 수업 참여
		 *2. 저녁
		 *----------------------*/

		ArrayList<String> todoList = new ArrayList<String>();
		int menu = -1;
		Scanner sc = new Scanner(System.in);
		do {
			printMenu();
			try {menu = sc.nextInt();
			runMenu(todoList, menu);
			}catch(InputMismatchException e) {
				System.out.println("----------------");
				System.out.println("예외 발생 : 정수를 입력하세요");
				System.out.println("----------------");
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println("----------------");
				System.out.println(e.getMessage());
				System.out.println("----------------");
			}
		}while(menu !=4);
		
		
	}

private static void runMenu(ArrayList<String> todoList, int menu) throws Exception {
	Scanner sc = new Scanner(System.in);
		switch(menu) {
		case 1 :
			//할 일을 입력(공백 포함해서 입력)
			System.out.println("할 일 입력 : ");
			String todo = sc.nextLine();
			// 리스트에 입력된 할 일을 추가
			todoList.add(todo);
			break;
		case 2 :
			printTodoList(todoList);
			break;	
		case 3 :
		
				System.out.print("삭제할 할 일 번호 입력 : ");
				int index = sc.nextInt() - 1;
				if(index<0 || index >= todoList.size()) {
					throw new Exception("예외 발생 : 삭제할 번호를 잘 못 입력했습니다.");
					
				}
				todoList.remove(index);
				System.out.println("삭제가 완료됐습니다.");
			
			break;
		case 4 :
			System.out.println("프로그램을 종료합니다.");
			break;					
		default :
					throw new Exception("예외 발생 : 잘못된 메뉴입니다.");

		}
		
	}
	
	private static void printTodoList(ArrayList<String> todoList) {
		if(todoList ==null || todoList.size() == 0) {
			System.out.println("저장된 할 일이 없습니다.");
			return;
		} 
		for(int i = 0; i < todoList.size();i++) {
			System.out.println(i + 1 + ". " +todoList.get(i));
		}
	
}

	public static void printMenu() {
	System.out.println("----------------");
	System.out.println("메뉴");
	System.out.println("1. 할 일 추가");
	System.out.println("2. 할 일 확인");
	System.out.println("3. 할 일 삭제");
	System.out.println("4. 종료");
	System.out.print("메뉴 선택 : ");
	}



}

