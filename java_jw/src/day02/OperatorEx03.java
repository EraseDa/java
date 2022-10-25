package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		/* 산술연산자 : + - & / %
		 * 정수 산술연산자 정수 => 정수
		 * 실수 산술연산자 정수 => 실수
		 * 정수 산술연산자 실수 => 실수
		 * 실수 산술연산자 실수 => 실수
		 * */
		
		int num1 = 1, num2 = 2;
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // 정수 산술연산자 정수 이기 때문에 0.5가 아닌 정수로 0이 나옴
		System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2)); // 그래서 강제 형변환을 해주어 정상적인 0.5를 나오게 함
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
	}

}
