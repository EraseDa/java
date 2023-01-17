package day19;

import java.util.ArrayList;
import java.util.Scanner;

public interface BookInfor {
	
	//도서 정보 추가 
	void addBookInfo(Scanner sc);
	void insertBookInfo(ArrayList<Book>list, Book book);
	void printMenu();
	void runMenu(ArrayList<Book>list, int menu, Scanner sc);
	void run(Scanner sc);
}
