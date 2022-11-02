package day08;

import java.util.Scanner;

public class MethodBaseballGameEx01 {

	public static void main(String[] args) {
		/* 1~9사이의 중복되지 않은 3개의 숫자가 랜덤으로 생성이 되고, 생성된 숫자를 맞추는 게임
		 * 규칙
		 *  - 숫자가 같은 자리에 있으면  Strike
		 *  - 숫자가 있지만 다른 자리면 Ball
		 *  -일치하는 숫자가 하나도 없으면 Out
		 * */ 
	
		Scanner sc = new Scanner(System.in);
		int min =1, max =9;
		
		System.out.print(min + "부터 "+ max+ "까지 숫자를 3개 입력하세요 : ");
	   int user[] = new int[3];
	    for(int i=0; i<user.length;i++) {
	    	user[i] = sc.nextInt();
	    }
	    System.out.println(checkStrike(createRandomArray(min, max,3),user));
	    printArray(createRandomArray(min, max,3));
	
	
	}
	/* 기능 :  배열을 출력하는 메소드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메소드명 : printArray
	*/	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	/* 기능 :  min에서 max 사이의 숫자를 랜덤으로 생성하는 메소드
	 * 매개변수 : int min, int max, int num
	 * 리턴타입 : 숫자 => int
	 * 메소드명 : random
	*/	
	public static int random(int min, int max) {
		if(min>max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
		}

	
	/* 기능 :  min에서 max 사이의 숫자를 중복하지 않게 number개를 생성하여 배열하는 메소드
	 * 매개변수 : int min, int max, int num
	 * 리턴타입 : 배열 => int[]
	 * 메소드명 : createRandomArray
	*/
	public static int [] createRandomArray(int min, int max, int num) {
		if(max-min+1 <= num) {
			return null;
		}
		int arr[] = new int[num];
		for(int i=0; i<arr.length; ) {
			int r = random(min, max);
			if(!contains(arr,r)) {
				arr[i] = r; 
				i++;
			}
		}
			return arr;			
	}	
	
	/* 기능 :  배열 안에 주어진 수가 있는지 알려주는 메소드
	 * 매개변수 : int arr[], int num
	 * 리턴타입 : 수가 있는지 없는지 = > boolean
	 * 메소드명 : contains
	*/
	public static boolean contains(int arr[], int num) {
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
	/* 기능 :  배열과 배열을 비교하여 같은 수가 같은 자리에 몇 개 있는지 알려주는 메소드
	 * 매개변수 : 랜덤한 수  = > int arr1[],  사용자 입력 = > int arr2[]
	 * 리턴타입 : int
	 * 메소드명 : checkStrike
	*/
	
	public static int checkStrike(int arr1[], int arr2[]) {
			int sameCount =0;
			for(int i =0, j=0; i < arr1.length; i++, j++) {
			if (arr1[i] == arr2[j]) {
				sameCount++;
			}
		} return sameCount; 
	}
		
	/* 기능 :  배열과 배열을 비교하여 같은 수가 몇 개 있는지 알려주는 메소드
	 * 매개변수 : 랜덤한 수 = > int arr1[],   사용자 입력 =>  int arr2[]
	 * 리턴타입 : int
	 * 메소드명 : checkAll
	*/
	public static int checkAll(int arr1[], int arr2[]) {
		int count = 0;
		for(int tmp : arr1) {
			if(contains(arr2,tmp)) {
				count++;
			}
		}
		return count;
	}
		
	/* 기능 :  볼의 개수를 알려주는 메소드
	 * 매개변수 : 볼 + 스트라이크 개수 =>int num1,  스트라이크 개수 => int num2
	 * 리턴타입 : int
	 * 메소드명 : ball
	*/
	
	public static int ball(int num1, int num2) {
		int ball=0;
			if(num1 > num2) { 	
				ball = num1 - num2;
			} return ball;
	}
}