package day07;

import java.util.Scanner;

public class MethodEx03 {

	public static void main(String[] args) {
		/* 주어진 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 단, 메소드를 이용할 것
		 * */ 
		
		System.out.print("정수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PrimeNum(num);
		System.out.println(isPrimeNum(num));
		
		sc.close();
		
	}
	/* 기능 :  정수 num이 입력되면 소수인지 아닌지 판별 후 출력
	 * 매개변수 :  입력받은 정수 = > int num
	 * 리턴타입 :  없음 = > void
	 * 메소드명 : PrimeNum
	 * */
	
	public static void PrimeNum(int num) {
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num % i ==0) { 
				count++;
			}
		}
			if(count ==2) {
				System.out.println(num + "는 소수입니다.");
			}
			else {
				System.out.println(num + "는 소수가 아닙니다.");
			}
		
	}
	
	/* 기능 :  정수 num이 입력되면 소수인지 아닌지 알려주는 메소드
	 * 매개변수 :  입력받은 정수 = > int num
	 * 리턴타입 :  boolean 
	 * 메소드명 : isPrimeNum
	 * */
	public static boolean isPrimeNum(int num) {
			for(int i=2;  i < num; i++) {
					if(num % i ==0) { 
						return false;
					}
				}
		return num  <=1 ? false : true;
	}
	
}
