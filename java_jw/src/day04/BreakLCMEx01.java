package day04;

public class BreakLCMEx01 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 
		 * */ 
		int i, a = 8, b =12;
		for(i=a; i <= a*b; i +=a) {
			if( i % a ==0 && i % b ==0) {
				System.out.println(i); break;} 
		}		
	}
}
