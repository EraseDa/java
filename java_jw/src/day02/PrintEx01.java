package day02;

public class PrintEx01 {

	public static void main(String[] args) {
		/* println() :원하는 값을 출력한 후 엔터
		 *                    () 안의 값을 생략 가능
		 * print() : 원하는 값을 출력
		 *                 () 안의 값을 생략할 수 없음
		 * 문자열 + 정수 => 문자열
		 * 정수 + 문자열 => 문자열
		 * 문자 + 문자열 => 문자열
		 * */
		String name = "홍길동";
		int age = 20;
		System.out.println(name + "의 나이는 " + age + "살 입니다." );
		
		int num1 = 10;
		int num2 = 20;
		char operator = '+';
		//10+20출력 되도록 operator -> 연산자
		
		
		System.out.println( num1 + operator + num2);
		System.out.println("" + num1 + operator + num2);
		//앞에 빈문자열 ""을 넣어주면 문자열로 되어서 정상적으로 나옴.
		System.out.println("1"+2); //결과값이 1이라는 문자와 2라는 정수가 합해진 "1"2가 되는것임. 숫자 12가 아님.
		System.out.println(1+2);
	}

}
