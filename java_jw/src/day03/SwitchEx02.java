package day03;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
	
		/*
		 * 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 하는 코드를 작성하세요
		 */
		int num1, num2; char ch;
		
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		ch = scan.next().charAt(0);
		num2 = scan.nextInt();
		
		switch(ch) {
		case '+' : System.out.println(num1 + num2);
		break;
		case '-' : System.out.println(num1 - num2);
		break;
		case '*' : System.out.println(num1 * num2);
		break;
		case '/' :System.out.println((double)num1 / num2);
		break;
		case '%' : System.out.println(num1 % num2);
		break;
		}
		
	}
	

}
