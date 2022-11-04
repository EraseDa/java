package day10;

import java.util.Scanner;

public class UpdownGameManager {

	public static void main(String[] args) {
		/* UpDown게임을 구현하세요.
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * */
		
		// 1. 메뉴를 출력
		int menu;
		Record [] records = new Record[5];
		do {
		printMenu(
				"- - - - - - - - - - - ",
				"메뉴 ",
				"1. 플레이",
				"2. 기록확인",
				"3. 종료",
				"- - - - - - - - - - - ",
				"메뉴 선택 : "
				);
		//2. 사용자의 입력을 받음

		Scanner sc = new Scanner(System.in);
		menu = sc.nextInt();
		//3. 입력 받은 메뉴를 실행
		
		runMenu(menu);
		} while(menu!=3);
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1 :
			//플레이
			//게임을 반복하고 싶을 때
			
			//min ~ max 사이의 랜덤한 숫자 한 개 생성
			char userChoice; //do문 밖에다 지정해야 while문에서도 사용가능.
			int min = 1, max = 10;
			int randomNum = (int)(Math.random()*(max-min+1)+min);
			int count =0;
			
			//사용자의 입력을 받음.
				Scanner sc = new Scanner(System.in);
				for(int i = 0; ;i++){
					count++;
					System.out.print(min + "과 " + max + "사이의 숫자를 입력하세요 : ");
					int userNum = sc.nextInt();
				// 두 숫자를 비교함
					if(randomNum==userNum) {
							System.out.println("정답입니다."); break;
						}	else if(randomNum > userNum){
							System.out.println("UP");
						} else if(randomNum < userNum) {
							System.out.println("DOWN");
						} else {
							System.out.println("ERROR");
						}
					int maxRecordCount = getMaxRecordCount(records);	
					int maxRecordRank = getMaxRecordRank(records);
					if(maxRecordCount > tryCount || maxRecordRank < 5) {
						addRecord(records, tryCount);
					}
				}	
			break;
			
		case 2 :
			break;
		case 3 :
			break;
		default :
			}
		
	}

	private static void printMenu(String ...strs) {
		for(int i = 0; i <strs.length; i++) {
		System.out.print(strs[i] + (i !=strs.length-1? "\n" : ""));
		
		}	
	}
	private static void addRecord(Record[] records, int record) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력(예 : JIK) : ");
		String name = sc.next();
		Record r = new Record(count, name);
		int index = 0;
		for(Record record : records) {
			if(record !=null && record.getCount() < tryCount) {
				index++;
			}
		}
		for (int i = records.length-1; i >index; i--) {
			records[i] = records[i-1];
		}
		records[index] = r;
	}

	private static int getMaxRecordRank(Record[] records) {
		int rank = 999999;
		for(Record record : records) {
			if(record != null) {
				rank++;
			}
		}
		return 0;
	}
	private static int getMaxRecordCount(Record[] records) {
		int count = 999999;
		for(Record record : records) {
			if(record != null) {
				count = record.getCount();
			}
		}
		return count;
	}
		
	}


