package day03;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		// IfEx06 예제를 switch문으로 변경
		
		Scanner scan = new Scanner(System.in);
		char ch;
		ch = scan.next().charAt(0);
		
		switch(ch) {
		case '+', '-', '*', '/', '%' :
		System.out.println(ch + "는 산술연산자입니다.");
		break;
		default : System.out.println("산술연산자가 아닙니다.");}

		scan.close();
		
		
		
		
	}

}
