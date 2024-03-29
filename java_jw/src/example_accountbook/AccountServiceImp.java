package example_accountbook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

import javax.management.RuntimeErrorException;

public class AccountServiceImp implements AccountService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertItem(ArrayList<Item> list, Item item) {
		//내역 리스트에 내역을 추가
		
		list.add(item);
		
		Collections.sort(list, new Comparator<Item>() {		
			
			@Override
			public int compare(Item o1, Item o2) {
				if(o1 == null)
					return 1;
				if(o2 == null)
					return -1;
				return o1.getDate().compareTo(o2.getDate());
			}
		});
		
	}

	@Override
	public void printItem(ArrayList<Item> list) {
		if(list.size() ==0) {
			System.out.println("기록된 내역이 없습니다.");
			return;
		} 
		for(Item item : list) {
			System.out.println(item);
		}
		
	}

	@Override
	public boolean updateItem(ArrayList<Item> list, int index, Item item) {
		if(index < 0 || index >= list.size())
			throw new RuntimeException("예외 발생 : 내역을 잘못 선택했습니다.");
		
		list.set(index, item);
		return true;
	}

	@Override
	public boolean deleteItem(ArrayList<Item> list, int index) {
		if(index <0 || index >=list.size())
			throw new RuntimeException("예외 발생 : 내역을 잘못 선택했습니다.");
		list.remove(index);
		return true;
	}

	@Override
	public void printMenu() {
		System.out.println("=====메뉴=====");
		System.out.println("1. 내역 추가");
		System.out.println("2. 내역 확인");
		System.out.println("3. 내역 수정");
		System.out.println("4. 내역 삭제");
		System.out.println("5. 종료 : ");
		System.out.println("============");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(ArrayList<Item> list, int menu, Scanner sc) throws ParseException {
		
		switch(menu) {
		case 1:
			//내역 정보를 입력
			//가계부에 내역을 추가
			//입력받은 정보를 이용하여 내역 객체를 생성
			
			insertItem(list, inputItem(sc));
			break;	
			
		case 2:
			
			printSubMenu();
			//서브 메뉴 선택
			int subMenu = sc.nextInt();
			
			//메뉴에 따른 출력 기능 실행
			runPrint(sc,list,subMenu);
			
			break;
		case 3:
			//년 월 일을 입력 (2022-11-16)
			String date = inputDate(sc);
			
			//수정할 내역을 입력함
			int index = selectItem(list, date, sc);
			
			Item item = inputItem(sc);
			//입력된 내용으로 수정
			
			updateItem(list,index,item);
			break;
		case 4:
			//년 월 일을 입력 (2022-11-16)
			String date1 = inputDate(sc);
			//해당 일자에 기록된 내역들을 출력
			
			//삭제할 내역을 선택
			int index1 =selectItem(list, date1, sc);
			//내역을 삭제(확인 문구)
			deleteItem(list, index1);
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			break;
		default: 
			System.out.println("잘못된 메뉴입니다.");
							
		}
		
	}

	@Override
	public Item inputItem(Scanner sc) throws ParseException {
		//구분, 목적, 내용, 금액, 일시를 입력
		System.out.print("구분(수입/지출) : ");
		String type = sc.next();
		System.out.print("분류(식비/교통비 등) : ");
		String purpose = sc.next();
		sc.nextLine();//위에서 입력한 엔터 처리
		System.out.print("내용 : ");
		String content = sc.nextLine();
		System.out.print("금액(정수) : ");
		int money = sc.nextInt();
		System.out.print("일시(2022-11-16) : ");
		String date = sc.next();
		return new Item(type, purpose, content, money, date);
	}

	@Override
	public int selectItem(ArrayList<Item> list, String date, Scanner sc) {
		
		//해당 일자에 기록된 내역들을 출력
		//날짜가 같은 내역들의 번지를 정수형 리스트에 저장
		
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		//날짜가 같은 내역들을 모음
		for(int i =0; i<list.size();i++) {
			if(list.get(i).getDateStr().equals(date))
				indexList.add(i);
		}
		
		if(indexList.size() == 0) {
			throw new RuntimeException("예외 발생 :  해당 일시에는 내역이 없습니다.");
		}
		//날짜가 같은 내역들을 출력
		for(int i = 0; i<indexList.size();i++) {
			System.out.println(i+1+"번 내역");
			list.get(indexList.get(i)).print();
		}
		//수정할 내역을 선택
		System.out.println("내역 선택 : ");
		int index = sc.nextInt() - 1;
		if(index < 0 || index >= indexList.size())
			throw new RuntimeException("예외 발생 : 내역을 잘못 선택했습니다.");
		return indexList.get(index);
	}

	@Override
	public String inputDate(Scanner sc) throws ParseException {
		System.out.println("일시 입력 : ");
		String date = sc.next();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		f.parse(date);		
		return date;
	}

	@Override
	public void printItem(ArrayList<Item> list, int... dates) {
		
		String date = "";

		for(int tmp : dates) {
			date += "-" +( tmp <10? "0"+tmp : tmp);
		}
		
		date = date.substring(1); //년도 앞의 -를 제거하기 위해
		int size = date.length();
		
		for(Item item : list) {
			if(item.getDateStr().substring(0, size).equals(date)) {
				System.out.println(item);
			}
		}
		
	}

	@Override
	public int inputYear(Scanner sc) {
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		if(year < 0)
			throw new RuntimeException("예외 발생 : 년도를 잘못 입력했습니다..");
		return year;
		
	}

	@Override
	public int inputMonth(Scanner sc) {
	
		System.out.print("월 입력 : ");
		int month =sc.nextInt();
		if(month < 0)
			throw new RuntimeException("예외 발생 : 월을 잘못 입력했습니다..");
		return month;
	}

	@Override
	public int inputDay(Scanner sc) {
		
		System.out.print("일 입력 : ");
		int day =sc.nextInt();
		if(day < 0 || day > 31)
			throw new RuntimeException("예외 발생 : 일을 잘못 입력했습니다.");
		return day;
	}

	@Override
	public void printSubMenu() {
		
		System.out.println("===확인 메뉴===");
		System.out.println("1. 전체 확인");
		System.out.println("2. 년 확인");
		System.out.println("3. 월 확인");
		System.out.println("4. 일 확인");
		System.out.println("===========");
		System.out.print("메뉴 선택 : ");
		
	}

	@Override
	public void runPrint(Scanner sc, ArrayList<Item> list, int subMenu) {
		int year, month, day;
		switch(subMenu) {
		case 1:
			printItem(list);
			break;
		case 2:
			year = inputYear(sc);
			//printItem(list, year);
			printItem(list,(s)->s.getDateStr().substring(0, 4).equals(""+year));
			break;
		case 3:
			year = inputYear(sc);
			month = inputMonth(sc);
		//	printItem(list, year,month);
			printItem(list,(s)->s.getDateStr().substring(0, 7).equals(""+year+"-"+month));
			break;
		case 4:
			year = inputYear(sc);
			month = inputMonth(sc);
			day= inputDay(sc);
			//printItem(list, year,month,day);
			printItem(list,(s)->s.getDateStr().substring(0, 10).equals(""+year+"-"+month+"-"+day));
			break;
			
		//case 5 :
			//System.out.print("수입/지출 선택 :");
			//String type= sc.next();
			//printItem(list, (s)->s.getType().equals(type));
		default:
		}
		
	}

	@Override
	public void printItem(ArrayList<Item> list,Predicate<Item> p) {
		for(Item tmp:list) {
			if(p.test(tmp)) {
				System.out.println(tmp);
			}
		}
	}



}
