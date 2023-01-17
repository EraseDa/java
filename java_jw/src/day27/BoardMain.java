package day27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BoardMain {
	/*게시글 관리 프로그램
	 * -회원가입
	 * 	-처음 가입한 회원이 관리자, 그 외 회원은 일반 회원
	 * -로그인
	 * -게시글 등록/수정/삭제 =>회원만 가능
	 * -카테고리 관리(공지,자유)
	 * -카테고리 추가/수정/삭제(관리자만 가능)*/ 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

		
		int menu = 0;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu, sc);
			
		}while(true);
		
		

	}
	private static void runMenu(int menu, Scanner sc) {
		ArrayList <Member> list = new ArrayList<Member>();
		switch(menu) {
		case 1:
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			System.out.print("비밀번호 생성 : ");
			String pw = sc.next();
			Member mem = new Member(id,pw);
			list.add(mem);
			for(Member tmp : list) {
				System.out.println(list);
			};
			break;
		case 2:
			System.out.print("아이디 : ");
			id = sc.next();
			int indexId = list.indexOf(id);
			System.out.print("비밀번호 : ");
			pw = sc.next();
			int indexPw = list.indexOf(pw);
			if(indexId == indexPw) {
				menuBar();
				System.out.println("로그인 성공!");
				runSubMenu();
			}else {
				menuBar();
				System.out.println("로그인 실패!");
			}
			break;
		default : System.out.println("잘못된 메뉴입니다.");
		}
		
	}
	private static void runSubMenu() {
		printSubmenu();
		int submenu = sc.nextInt();
		runSubmenu(submenu);
		
		
	}
	private static void runSubmenu(int submenu) {
		ArrayList<Board> list = new ArrayList<Board>();
		while(submenu!=5) {
		switch(submenu) {
		case 1:
			sc.nextLine();
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("내용 : ");
			String contents = sc.nextLine();
			Board simpleList = new Board(title, contents);
			list.add(simpleList);
			
			break;
		case 2:
			for(Board tmp : list) {
				System.out.println(tmp);
			}
			break;
		case 3:
			break;
		default : System.out.println("잘못된 메뉴입니다.");
		}
		}
	}
	private static void printSubmenu() {
		menuBar();
		System.out.println("1.게시물 등록");
		System.out.println("2.게시물 목록");
		System.out.println("3.게시물 수정");
		System.out.println("4.게시물 삭제");
		System.out.println("5. 종료");
		menuBar();
		System.out.print("메뉴 선택 : ");
	}
	private static void printMenu() {
		menuBar();
		System.out.println("1 . 회원가입");
		System.out.println("2. 로그인");
		menuBar();
		System.out.print("메뉴 선택 : ");
		
	}
	private static void menuBar() {
		System.out.println("-----------------");
	}
}
