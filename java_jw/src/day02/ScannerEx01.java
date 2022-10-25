package day02;

import java.util.Scanner;

public class ScannerEx01{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num);
		
		System.out.println("실수를 입력하세요 : ");
		double num2 = scan.nextDouble();
		System.out.println(num2);
		
		System.out.println("정수A와 정수B를 입력하세요 : ");
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		System.out.println(numA);
		System.out.println(numB);
		
		//이렇게 할 경우, 숫자 두 개 입력 후 (하나 입력 후 스페이스 하나 입력) 두 개 다 출력. 
		
	
		scan.close();
	}

}
