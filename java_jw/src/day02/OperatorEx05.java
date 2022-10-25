package day02;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
	/* 홍길동 학생의 국어, 영어, 수학 점수를 콘솔에 입력받고,
	 * 홍길동 학생 평균 성적을 콘솔에 출력하는 코드를 작성하세요.
	 * */
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("홍길동 학생의 국어, 영어, 수학 점수를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		
		int sumOfScore = num1 + num2 + num3;
		double avg = (double)sumOfScore / 3; // ((double)sumOfScore / 3), sumOfScore / 3.0, (double)sumOfScore / 3 셋 다 가능.
		// (double)(sumOfScore/3); 은 안돼
		System.out.println("홍길동 학생의 평균 점수는  " + avg + "입니다."); 

		//통과입니까? true/false
		//평균이 60점 이상이면 true, 아니면 false
		
	
		System.out.println("통과입니까? " + (avg>=60));
		
		//통과를 알려주는 변수, 실패를 알려주는 변수
		boolean isPass = avg >= 60;
		boolean isFail = avg < 60;
		
		System.out.println("통과입니까? " + isPass);
		System.out.println("통과입니까? " + !isFail);
	}

}
