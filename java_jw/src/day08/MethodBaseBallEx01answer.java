package day08;

import java.util.Scanner;

public class MethodBaseBallEx01answer {

	public static void main(String[] args) {
		
		
		//1. 랜덤으로 세 개의 수를 선택	
				int min =1, max=9, size=3;
				int []com = createRandomArray(min, max, size);
				printArray(com);
		//2. 사용자가 숫자를 선택
			Scanner sc = new Scanner(System.in);
			
			
		//3. 판별
			int strike =0, ball;
			do {
				System.out.print("입력 : ");
				int []user = scArray(sc,size);
				
				
			
			// =>스트라이크를 판별하는 기능을 구현	
			// => countLotto를 이용하여 일치하는 개수 - 스트라이크 개수 => 볼의 개수
				strike = getStrike(com,user);
				ball = getBall(com, user);
				printGame(strike,ball);
				System.out.println();
			}
			//2~3을 반복(3S가 될 때까지)	
			while(strike<3);
			System.out.println("게임 종료");
			sc.close();
	}
	/** 
	 * 기능 : strike와 볼의 개수가 주어지면 콘솔에 결과를 출력하는 메소드
	 * @param strike 스트라이크 개수
	 * @param ball 볼의 개수
	 * */
	
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
	
	
	/** 
	 * 기능 : 두 배열이 주어지면 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수를 알려주는 메소드
	 * @param arr1 int [] : 첫번째 정수 배열
	 * @param arr2 int [] : 두번째 정수 배열
	 * @return 같은 숫자들 중에서 번지가 서로 다른 숫자들의 개수
	 * */
	
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
	
	
	
	
	
	/** 
	 * 기능 : 두 배열이 주어지면 같은 번지에 있는 수를 비교하여 일치하는 숫자들이 몇 개 있는지 알려주는 메소드
	 * @param arr1 int [] : 첫번째 정수 배열
	 * @param arr2 int [] : 두번째 정수 배열
	 * @return 같은 번지에서 일치하는 숫자들의 개수
	 * */
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
	
	
	/**
	 *  기능 : Scanner가 주어지면 정수를 size개만큼 입력받아 배열에 저장하고,
	 *  저장된 배열을 돌려주는 메소드
	 *  매개변수: Scanner, size => Scanner sc, int size
	 *  리턴타입: 정수 배열 = > int []
	 *  메소드명: scArray
	 *  @param sc Scanner
	 *  @param size 입력받을 정수의 개수
	 *  @return 입력받은 값들이 저장된 배열
	 * */
	
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
		
		public static int [] createRandomArray(int min, int max, int size) {
			if(max-min+1 <= size) {
				return null;
			}
			int arr[] = new int[size];	
			for(int i=0; i<arr.length; ) {
				int r = random(min, max);
				if(!contains(r,arr)) {
					arr[i] = r; 
					i++;
				}
			}
				return arr;
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
		
	
	
	
	
}
