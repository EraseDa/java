package day03;

public class ifEx05 {

	public static void main(String[] args) {
		/* 정수 num가 2의 배수이면 2의 배수라고 출력
		 * 3의 배수이면 3의 배수라고 출력
		 * 6의 배수이면 6의 배수라고 출력
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다라고 출력하는 코드를 작성
		 * 단, 6의 배수는 6의 배수라고만 출력
		 * */ 
		//내가 작성한 코드
		int num = 3;
		
		if(num % 6 == 0) {System.out.println(num + "은 6의 배수입니다.");}
		else if (num % 3 == 0) {System.out.println(num + "은 3의 배수입니다.");}
		else if (num % 2 == 0) {System.out.println(num + "은 2의 배수입니다.");}
		else {System.out.println("2,3,6의 배수가 아닙니다");}
		
		//추가 코드
		int num1 = 6;
		
		if(num1 % 2 == 0 && num1 % 3 !=0) {System.out.println(num1 + "은 2의 배수입니다.");}
		else if(num1 % 3 == 0 && num1 % 2 !=0) {System.out.println(num1 + "은 3의 배수입니다.");}
		else if (num1 % 6 == 0) {System.out.println(num1 + "은 6의 배수입니다.");}
		else {System.out.println("2,3,6의 배수가 아닙니다");}
	}

}
