package day03;

import java.util.Scanner;

public class ifEx06 {

	public static void main(String[] args) {
		/* Scanner를 입력받아 +, -,*, /, %이면 산술연산자라고 출력하고 아니면
		 * 산술연산자가 아닙니다라고 출력하는 코드를 작성
		 * */ 

		Scanner scan = new Scanner(System.in);
		char operator;
		operator = scan.next().charAt(0);
		if(operator == '+' || operator == '-' || operator == '*' || operator == '/' ||operator == '%')
		{System.out.println(operator + "은 산술연산자입니다.");} else {System.out.println("산술연산자가 아닙니다.");}
		scan.close();
		
	}

}
