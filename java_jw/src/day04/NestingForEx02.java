package day04;

public class NestingForEx02 {

	public static void main(String[] args) {
		/* 2부터 100사이의 소수를 출력하는 코드를 작성하세요
.		 * */

		int i, num;
		int count = 0;
		for(num=2; num <= 100; num++) {
			for(count=0, i=1; i <=100; i++) {if(num % i == 0) {count +=1;}}
			if (count == 2) {System.out.print(num + " ");}
		}
	
		
		
		
	}

}
