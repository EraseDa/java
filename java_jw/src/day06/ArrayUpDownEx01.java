package day06;

import java.util.Scanner;

public class ArrayUpDownEx01 {

	public static void main(String[] args) {
		// Up Down 게임을 무조건 3번 반복해서 맞춘 3번의 횟수를 배열에 저장하여 출력하는 
		//코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		int times = 3;
		int arr[] = new int[times];
		int min=1, max=20;
		for(int i=0; i <  times; i++) {
			
			int r = (int)(Math.random()*(max-min+1)+min);

			 
			 for(int j=0;;j++) {
				 System.out.print(min + "에서 " + max + "사이의 숫자를 입력하세요 : ");
				 int num =sc.nextInt();


				if(r==num) {
				 System.out.print("정답입니다.  "); 
					arr[i] = j;  System.out.println((j+1)+ "번만에 정답을 맞추셨습니다."); break; }
				else if(r>num) {
				 System.out.println("Up");
					}
				else {System.out.println("Down");}
			}
		
		}
		//times-- 는 후위연산자!!!!!
			while( times-- >0) {
				int r = (int)(Math.random()*(max-min+1)+min);
				 System.out.print(min + "에서 " + max + "사이의 숫자를 입력하세요 : ");
				int num;
				int tryCount=0;
				do {
					tryCount++; 
					System.out.println("숫자 입력 : ");
				num = sc.nextInt();
				if(r==num) {
					 System.out.print("정답입니다.  "); 
						arr[arr.length - times - 1] = tryCount;  
				}
					else if(r>num) {
					 System.out.println("Up");
						}
					else {
						System.out.println("Down");
						}
				
				}while(r !=num);
			}
		 for(int i =0; i<arr.length; i++) {
			 System.out.println(i+1+ "번째 게임 횟수 : " + arr[i]);
		 }
		
		
	}

}
