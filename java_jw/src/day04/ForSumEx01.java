package day04;

public class ForSumEx01 {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수의 합을 구하는 코드를 작성하세요.
		 * */

		int i = 1;
		int sum = 0;
		for(i=1; i<=10 ; i++) {if(i % 2 == 0) {sum += i;}}
		System.out.println(sum);
	
		

	}

}
