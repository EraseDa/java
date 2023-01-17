package day25;

import java.util.Scanner;

public class Ex04 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*컴퓨터와 가위,바위, 보를 하는 프로그램을 작성하세요.
		 * 예:
		 * 사용자 : 가위
		 * 컴퓨터 : 보
		 * 사용자가 이겼습니다. 더 하시겠습니까?(y/n) : y
		 * 사용자 : 가위
		 * 컴퓨터 : 주먹
		 * 컴퓨터가 이겼습니다. 더 하시겠습니까?(y/n) : n*/
		String n="n";

	
		String answer;
		
		do {
			verse(user(sc), computer());
		System.out.print("더 하시겠습니까?");
		answer = sc.next();
		}while(!n.equals(answer));
		
	}




	private static void verse(Object user, Object computer) {
		
		String rock = "바위", scissors="가위", paper="보";
		if(user.equals(computer)) {
			System.out.print("비겼습니다. ");
		}else if((user.equals(scissors) && computer.equals(paper)) ||(user.equals(rock) && computer.equals(scissors)) 
				||(user.equals(paper) && computer.equals(rock))) {
			System.out.print("사용자가 이겼습니다. ");
		}else {
			System.out.print("컴퓨터가 이겼습니다. ");
		}
		
		
		
		
		
	}




	public static String user(Scanner sc) {
		System.out.print("사용자 : ");
		String input = sc.next();	
		return input;
	}

	public static String computer() {
		
		String [] arr = {"가위", "바위", "보"};
		int min =0, max=2;
		
		
		System.out.print("컴퓨터 : ");
		int num = (int)(Math.random()*(max-min+1)+min);
		System.out.println(arr[num]);
		return arr[num];
	}


	
}
