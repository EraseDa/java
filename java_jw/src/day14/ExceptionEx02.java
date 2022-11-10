package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx02 {

	public static void main(String[] args) {
		/*Scanner 를 통해 정수를 입력 받아 입력받은 정수를 출력하는 코드를 작성하세요.
		 * */ 

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
	
		try {
			
			int num =sc.nextInt();
			System.out.println("입력된 정수 : " + num);

			
		}catch(Exception e) {
			System.out.println("정수를 입력하세요.");
		}
		sc.close();
	}
	
}
