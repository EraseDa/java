package example_accountbook;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public interface AccountService {
			
			void insertItem(ArrayList<Item> list, Item item);//가계부에 있는 내역 리트스, 추가할 아이템 
			void printItem(ArrayList<Item> list);
			void printItem(ArrayList<Item> list, int ...dates); // 가계부에 있는 내역 리스트
			void printItem(ArrayList<Item> list, Predicate<Item> p); // 가계부에 있는 내역 리스트
			boolean updateItem(ArrayList<Item> list, int index, Item item); // 가계부에 있는 내역 리스트, 몇 번지, 수정할 아이템
			boolean deleteItem(ArrayList<Item> list, int index); //가계부에 있는 내역 리스트, 몇 번지

			void printMenu();
			void runMenu(ArrayList<Item>list, int menu, Scanner sc)throws ParseException;
			
			Item inputItem(Scanner sc) throws ParseException;
			
			int selectItem(ArrayList<Item>list, String date, Scanner sc);
			
			String inputDate(Scanner sc) throws ParseException;
			
			int inputYear(Scanner sc);
			int inputMonth(Scanner sc);
			int inputDay(Scanner sc);
			
			void printSubMenu();
			void runPrint(Scanner sc, ArrayList<Item> list, int subMenu);
}
