package day09;

import java.util.Scanner;

import day08.MethodBaseBallEx01answer;

public class BaseballManager {

	public static void main(String[] args) {
		/* 숫자 야구게임을 플레이 한 후, 기록을 저장하는 프로그램을 작성하세요.
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록확인
		 * 3. 종료
		 * 
		 * 메뉴 선택 : 2
		 * 1. 홍길동 2회
		 * 2. 임꺽정 3회
		 * 3. 이몽룡 3회
		 * 4. 춘향이 4회
		 * */ 
		
		Scanner sc = new Scanner(System.in);
		int menu;		
		do { 
			//메뉴를 출력
			printMenu();
			//메뉴 선택 (입력)
			System.out.print("메뉴를 입력하세요 : ");
				menu = selectMenu();
				
			//선택한 메뉴에 맞는 기능 실행
				//1.플레이
					//컴퓨터가 랜덤으로 숫자 생성
					//사용자가 숫자 입력

				
					// 판별
					//3S 종료
					//[new] 횟수를 기록 (최대 5등), 5등 기준으로 횟수가 동일한 경우 먼저 플레이한 사용자의 기록을 유지.
				
				runMenu();
				//2. 기록확인
					//등록된 5위까지의 기록을 확인
				
				//3. 종료
		}while(menu !=3);{		
				}
		
		

	}

	/** 메뉴를 출력하는 메소드
	 * */
	public static void printMenu() {
		
		System.out.println("------- 메뉴 -------");
		System.out.println("1. 플레이");
		System.out.println("2. 기록확인");
		System.out.println("3. 프로그램 종료 ");
		System.out.println("-------------------");
	}	
	
	/** 콘솔에서 입력받은 정수(메뉴)를 알려주는 메소드
	 * @return 입력받은 정수(메뉴)
	 * */	
	
	public static int selectMenu() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	/** 메뉴에 맞는 기능을 실행하는 메소드
	 * */
	public static void runMenu() {
		
		switch(menu) {
		case 1 :
			//컴퓨터가 랜덤으로 숫자 생성
			int min =1, max = 9, size =3;
			int []com = MethodBaseBallEx01answer.createRandomArray(min, max, size);
			MethodBaseBallEx01answer.printArray(com);
			
			//사용자가 숫자 입력
			Scanner sc = new Scanner(System.in);
			int strike =0, ball;
			int count = 0;
					do {
							System.out.print("입력 : ");
							int []user = scArray(sc,size);
				
							strike = getStrike(com,user);
							ball = getBall(com, user);
							printGame(strike,ball);
							System.out.println();
							count++; 
							}
			//2~3을 반복(3S가 될 때까지)	
					while(strike<3);
					System.out.println(count + "번에 맞추셨습니다.");
					System.out.println("게임 종료");
					sc.close();
			break;
			
		case 2 :
			break;
		case 3 :
			break;
		default :
		}
		
	}
	
	public static int[] scArray(Scanner sc, int size) {
		if(size<=0) {
			return null;
		}
		int [] arr = new int[size];
		for(int i = 0; i <size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}




public static void printArray(int arr[]) {
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}



public static int countArray(int arr1[], int arr2[]) {
	if(arr1 == null || arr2 ==null) {
		return 0;
	}
	int sameCount = 0;
	for(int tmp : arr1) {
		if(contains(tmp, arr2)) {
			sameCount++;
		}
	}
	return sameCount;
}
		public static int record(int num) {
			int count =0;
			for(int i=1; ;i++) {count++;}
			
			return count;
		}

		public static boolean contains( int num, int arr[]) {
					if(arr == null || arr.length ==0) {
									return false;
												}
					for(int tmp : arr)   {
							if(num == tmp) {
									return true;
											}
									}	
						return false;
					}

		public static int random(int min, int max) {
				if(min>max) {
						int tmp = min;
						min = max;
						max = tmp;
								}
					return (int)(Math.random()*(max-min+1)+min);
				}

		public static int getStrike(int []arr1, int [] arr2) {
							if(arr1==null || arr2 ==null) {
															return 0;
																}
							int size = arr1.length < arr2.length ? arr1.length : arr2.length;
							int strike = 0;
							for(int i =0; i < size; i++) {
									if(arr1[i] == arr2[i]) { 
												strike++;
													}
												}
							return strike;		
						}

		public static int getBall(int[]arr1, int[]arr2) {
								if(arr1==null || arr2 ==null) {
													return 0;
										}
								int ball =0;
								int strike = getStrike(arr1,arr2);
									for(int num : arr1) {
											if(contains(num, arr2)) {
														ball++;
														}
													}return ball - strike;
												}

		public static void printGame(int strike, int ball) {
				if(strike !=0) {
						System.out.print(strike + "S ");
							}
				if (ball !=0) {
						System.out.print(ball + "B");
							}
				if (strike ==0 && ball == 0) {
						System.out.println("OUT");
							}
						}	
}
