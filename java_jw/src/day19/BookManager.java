package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		BookInfor bookInfo = new BookInforImp();
		Scanner sc;

	}

	public void run() {
		int menu=0;
		do {
			System.out.println("도서 관리 프로그램입니다.");
			BookInfor.printMenu();
			
			
		}while(menu!=5);
	}
	
}
