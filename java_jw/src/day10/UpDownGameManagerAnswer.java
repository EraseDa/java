package day10;

import java.util.Scanner;

public class UpDownGameManagerAnswer {

	public static void main(String[] args) {
		
		
		//반복
		int menu;
		Record[] records = new Record[5];
		do {
		//메뉴출력
			printMenu();
		// 메뉴 선택
			menu = insertInt();
		//메뉴에 따른 기능 실행 : 선택한 메뉴, 기록 정보
			runMenu(menu, records);	
			
				//종료
		
		} while(menu !=3);
	}
	/**
	 *  고정된 메뉴를 출력하는 메소드 
	 * */
	public static void printMenu() {
		System.out.println("-------------");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 종료");
		System.out.println("-------------");
		System.out.print("메뉴 확인 : ");
	}
	/**
	 * 콘솔에서 정수를 입력받아 입력받은 정수를 알려주는 메소드
	 * @return 입력 받은 정수, 메뉴
	 * */
	public static int insertInt() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
/**
 *  주어진 기록정보를 이용하여 메뉴에 따른 기능을 실행하는 메소드.
 * @param records 기록 정보들
 * @param menu 선택한 메뉴
 * */
	public static void runMenu(int menu, Record[] records) {
		switch(menu) {
		case 1 :

			//플레이를 하고 나면 몇 번 만에 맞췄는지 알아야함
			int tryCount = playGame();
			//기존 기록보다 좋으면 기록을 추가
			writeRecord(records, tryCount);
			break;
		case 2 :
			//기록확인
			printRecords(records);
			//기록된 순위를 출력
			System.out.println("기록확인 기능 구현해야합니다.");
			break;
		case 3 :
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
			System.out.println("잘못된 메뉴입니다!");
		}
	}
	
	private static void printRecords(Record[] records) {
	for(int i =0; i <records.length; i++) {
		System.out.print( i +1 + "위 ");
		if(records[i] != null) {
			records[i].print();
		} else {
			System.out.println();
		}
	}
	
}
	/**
	 * 기록 정보보다 사용자 기록이 좋으면 기록을 추가하는 메소드
	 * @param records 기록 정보
	 * @param tryCount 사용자 기록
	 * */
private static void writeRecord(Record[] records, int tryCount) {
	int index = 0;
	for(int i=0; i < records.length; i++) {
		if(records[i] != null && tryCount > records[i].getCount()) {
			index++;
			} //기록이 없는 처음 순위를 내 기록으로 하기위해 i를 index에 저장 
				else if(records[i] == null) {
					index = i;
						break;
			}	//비교 순위보다 내가 기록이 좋으면 반복문 종료
				else {
					index = i;
						break;
			}
		}
	if(index==5) {
		return;
	}
	System.arraycopy(records, index, records, index+1, records.length - index -1);
	System.out.println("이름 입력(예 : ABC) : ");
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	records[index] = new Record(tryCount, name);
}
private static int playGame() {
	//랜덤수 생성
		int num = random(1,100);
		System.out.println(num);
		int tryCount =0;
		int user;
	//반복
		do {
		//사용자입력
			System.out.print("정수 입력 : ");
			user = insertInt();
			//Up Down 판별
			if(user > num) {
				System.out.println("DOWN");
			} else if (user < num) {
				System.out.println("UP");
			} else { 
				System.out.println("정답!");
			}	tryCount++;
		}while(num != user);
			return tryCount;
}
public static int random(int min,int max) {
	return (int)(Math.random()*(max-min+1)+min);
}
}


