package day05;

import java.util.Scanner;

public class ForUpDownEx01 {

	public static void main(String[] args) {
		/* 랜덤한 수를 생성하여 해당 수를 맞추는 코드를 작성하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		int min = 1, max = 100;
		int r = (int)(Math.random()*(max-min+1)+min);

		
	
		for(;;) { System.out.print("숫자를 입력하세요 : ");
			int i = sc.nextInt();
			if(i>r) {System.out.println("DOWN");}
			else if(i<r) {System.out.println("UP");}
			if(i==r) {System.out.println("정답입니다."); break;}}
	
		/*  반복횟수 : 맞출 때까지 => 랜덤수 r과 입력한 수가 일치하지 않을 때까지
			int num = min -1;
			Scanner sc = new Scanner(System.in);
			for( ; r != num ; ){ //1. 숫자를 입력하세요 : 안내문구 출력 
				System.out.print("숫자를 입력하세요 : "); 
			//2. 정수를 입력 받음
		 	num = scan.nextInt();
		 	//3. 입력받은 정수가 r과 같으면 정답입니다.라고 출력하고
			if (num ==r){
				System.out.println("정답입니다.");
			}
		 	//3. 입력받은 정수가 r보다 크면 DOWN이라고 출력
		 	else if(num > r){
		 		System.out.println("DOWN");
		 	}
			else{
			System.out.println("UP");
			}
		*/
		
		
		sc.close();
		
		}
	
	}


