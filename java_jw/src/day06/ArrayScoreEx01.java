package day06;

import java.util.Scanner;

public class ArrayScoreEx01 {

	public static void main(String[] args) {
		/* 5명 학생의 국어, 영어, 수학 성적을 저장하기 위한 배열을 만들고,
		 * Scanner를 이용하여 입력받아, 국어평균, 영어평균, 수학평균을 구하는 코드를 작성
		 * */ 

		int Kor[] = new int[5];
		int Eng[] = new int[5];
		int Math[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요 : ");
		int i, sum = 0;
		
		for(i=0; i < Kor.length; i++) {
				Kor[i] = sc.nextInt();
				sum += Kor[i];
		} 
		System.out.println("5명의 국어 성적 평균은 " + (double)sum/Kor.length + "입니다.");
		
		
		sum =0;
		System.out.print("영어 성적을 입력하세요 : ");
		
		for(i=0; i < Eng.length; i++) {
			Eng[i] = sc.nextInt();
			sum += Eng[i];
		} 
		System.out.println("5명의 영어 성적 평균은 " + (double)sum/Eng.length + "입니다.");
		
		System.out.print("수학 성적을 입력하세요 : ");
	
		sum =0;
		
		for(i=0; i < Math.length; i++) {
			Math[i] = sc.nextInt();
			sum += Math[i];
		} System.out.println("5명의 수학 성적 평균은 " + (double)sum/Math.length + "입니다.");
	
		
		//학생별 평균
		int stdCount;
		for(i=0; i <=4 ; i++) {
			stdCount = Kor[i]+Eng[i]+Math[i];
			System.out.println("학생" + (1+i) + "의 평균 : " + (double)stdCount/3);
			
		}
		
	}

}
