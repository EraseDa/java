package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInforImp implements BookInfor {
	
	public static void main(String[] args) {
	
	
	}
		
	
	
	
	@Override
	public Book addBookInfo(Scanner sc) {
		
		System.out.print("도서명 : ");
		String title = sc.next();
		System.out.print("저자 : ");
		String writer = sc.next();
		System.out.print("출판사 : ");
		String publisher = sc.next();
		System.out.print("분류 : ");
		String category = sc.next();
		System.out.print("ISBN : ");
		String isbn = sc.next();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		return new Book(title, writer, publisher, category, isbn,price);
	}

	@Override
	public void insertBookInfo(ArrayList<Book> list, Book book) {
		
		list.add(book);
		
	}

	@Override
	public void printMenu() {
		
		System.out.println("===========");
		System.out.println("1. 도서 추가");
		System.out.println("2. 도서 조회");
		System.out.println("3.프로그램 종료");
		System.out.println("===========");
		System.out.print("메뉴 선택 : ");	
		
	}






	@Override
	public void runMenu(ArrayList<Book> list, int menu, Scanner sc) {
		menu =0;
		do {
			printMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				addBookInfo(sc);
				insertBookInfo(list, addBookInfo(sc));
				
				break;
			case 2:
				break;
			case 3:
				break;
			default:
			}
		}while(menu !=3);
		
	}






}
