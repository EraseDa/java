package day05;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		/* 학생 5명의 국어 성적(성적)을 입력받고 출력하는 코드를 작성하세요.
		 * */ 
		Scanner sc = new Scanner(System.in);		
		int score[] = new int[5];
		int i;
		for( i = 0; i < score.length; i++) {
			System.out.print(i+1 + "번째 학생 성적 : ");
			score[i] = sc.nextInt(); 
			System.out.println(i+1 + "번째 학생 성적 : " + score[i] + " ");
			}
		/* 학생 성적의 평균을 구하는 코드를 작성하세요.
		 *반복횟수 : i는 0부터 배열의 크기보다 작을때까지 1씩 증가(향상된 for문 이용 가능)
		 * 규칙성 : sum에 배열 i번지에 있는 값을 누적
		 * */
		int sum = 0;
		for( i = 0; i < score.length; i++) {
			System.out.print(i+1 + "번째 학생 성적 : ");
			score[i] = sc.nextInt(); 
			sum += score[i];
			}
		System.out.println("학생들의 평균 성적은 "+ (double)sum/score.length + " 입니다."  );
	
		sum = 0;
		for(int tmp : score) { 
			sum +=tmp;
		}
		double avg = (double) sum / score.length;
		System.out.println("학생들의 평균 : " + avg);
		
		sc.close();	}

}
