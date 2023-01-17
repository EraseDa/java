package day25;

import java.util.Scanner;

public class Ex01 {

	static private Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*정수를 입력받아 입력받은 정수가 0이상이면 0부터 입력받은 수까지 합을 구하고
		 * 입력받은 정수가 0미만이면 0부터 입력받은 입력받은수까지 차를 구하는 코드를 작성하세요
		 * 예 : 
		 * 정수 입력 : 3 
		 * 0부터 3까지 합 : 6
		 * 정수 입력 : -3
		 * 0부터 -3까지 누적 합 : 6
		 * */


		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();
		Sum(num);
	
	
	}
 public static void Sum(int num) {
		int sum=0;
		String str = "합";
		 if (num >=0) {
				for(int i = 0; i<=num; i++) {
					sum += i;
				}
		 }else{
			   str = "차";
				for(int i = 0; i>=num; i-- ) {
					sum-=i;
				}
			}
		 System.out.println("0부터 " + num +  "까지의 " +str +" : " + sum );
 	}
}
