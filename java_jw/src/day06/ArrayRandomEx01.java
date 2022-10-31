package day06;

import java.util.Scanner;

public class ArrayRandomEx01 {

	public static void main(String[] args) {
		// 랜덤으로 1~9 사이의 숫자를 3개 생성하여 배열 저장하는 코드를 작성하세요.
		
		
		int min = 1, max =9;
		int num[] = new int[3];
		int i;
		for(i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*(max - min + 1) + min);
		System.out.print(num[i] + " ");
		}
		//정수를 입력받아 랜덤한 수에 있는지 없는지 확인해서 알려주는 코드를 작성하세요.
		System.out.println();
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int check = sc.nextInt(); 
		sc.close();
		int sum=0;
			for(i=0; i<3; i++) {
				if(check == num[i]) { 
					sum+=1; }}
				
		if(sum>0) {System.out.println("입력한 정수가 랜덤한 수에 있습니다.");}	
		else {System.out.println("입력한 정수가 랜덤한 수에 없습니다.");}
		
		/*int num=sc.nextInt(); 
		 * boolean isDuplicated = false; //중복(isduplicated)이 (false)안됨으로 초기화
		 * for(int i = 0; i < arr.length; i++}{
		 * 	if(arr[i] == num) { 
		 * isDuplicated = true; 
		 * 			break;
		 * 	}
		 * }
		 * if (isDuplicated){
		 * 	System.out.println("입력한 정수가 랜덤한 수에 있습니다.");
		 * }
		 * else {System.out.println("입력한 정수가 랜덤한 수에 없습니다.");}
		 * */
		

	} 
			
	}
		



