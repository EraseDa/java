package day02;

import java.util.Scanner;

public class OperatorEx08 {

	public static void main(String[] args) {
		/* 정수를 입력받아 입력받은 점수가 홀수인지 짝수인지 출력하는 코드를 작성하세요.
		 * 예시
		 * 정수를 입력하세요 : 5
		 * 5는 홀수입니다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		scan.close();
		//내가 한 것
		String result =( num % 2 == 1)? "홀수" : "짝수";
		System.out.println(num + "은 " + result + "입니다."  );
		//선생님이 짠 것
		// boolean isEven = num % 2 == 0;
		// String result = isEven ? "짝수" : "홀수";
		// System.out.println(num + "은 " + result + "입니다."  );
		
		
		
	}

}
