package day05;

import java.util.Scanner;

public class WhileCharEx01 {

	public static void main(String[] args) {
		// 문자를 입력받아 q이면 종료하고, 아니면 반복하는 코드를 작성하세요.
		
		Scanner sc = new Scanner(System.in);

		
		char ch = 'a';
		while(ch != 'q'){
			System.out.print("문자를 입력하세요. (종료 : q) : "); 
			 ch = sc.next().charAt(0);
		}
		
		/*char ch;
		while(true) {
			System.out.println("문자를 입력하세요. (종료 : q) : ");
			ch = sc.next().charAt(0);
			if(ch == 'q') {
				break;
			} //break를 이용하여 무한루프를 빠져 나오는 예제
		}
		*/
		
	}

}
