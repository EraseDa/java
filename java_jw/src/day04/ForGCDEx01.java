package day04;

public class ForGCDEx01 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 
		 * */ 

		int A =12, B = 18;
		int i, gcd = 1;
		
		for(i=1; i<=12 ; i++) {if (A % i == 0 && B % i == 0) {gcd = i;}}
		System.out.println(gcd);
			
		
		
	}

}
