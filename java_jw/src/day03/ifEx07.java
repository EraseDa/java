package day03;

import java.util.Scanner;

public class ifEx07 {

	public static void main(String[] args) {
		/* 두 정수와 문자를 입력받아 산술연산자이면 산술연산 결과를 출력하는 코드를 작성하세요
		 * 예시
		 * 두 정수와 문자를 입력하세요 (예 1 / 2) : 1 / 2
		 * 1 / 2 = 0.5
		 * 두 정수와 문자를 입력하세요 (예 1 + 2) : 1 ? 2
		 * ?는 산술연산자가 아닙니다.
		 * */
		Scanner scan = new Scanner(System.in);
		
		int num1, num2; char ch;
		System.out.print("두 정수와 문자를 입력하세요.");
		num1 = scan.nextInt();
		ch = scan.next().charAt(0);
		num2 = scan.nextInt();
	
		//""썼을 때, 문자열의 범위가 어디까지 적용되는지,,? 뒤에 (num1 + num2)는 왜 계산형식으로 나오는지.
		//()연산 먼저하기 때문에 ()처리 후 문자열)
		
		if(ch == '+'){System.out.println(""+ num1 + ch + num2 + "=" + (num1 + num2));}
		else if(ch == '-'){System.out.println(""+ num1 + ch + num2 + "=" + (num1 - num2));}
		else if(ch == '*'){System.out.println(""+ num1 + ch + num2 + "=" + (num1 * num2));}
		else if(ch == '/'){System.out.println(""+ num1 + ch + num2 + "=" + ((double)num1 / num2));}
		else if(ch == '%'){System.out.println(""+ num1 + ch + num2 + "=" + (num1 % num2));}
		else {System.out.println(ch + "는 산술연산자가 아닙니다.");}
		
		scan.close();
		
	

	}

}
