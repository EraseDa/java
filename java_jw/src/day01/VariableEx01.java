package day01;

public class VariableEx01 {

	public static void main(String[] args) {
	/* - 변수선언
	 *  자료형 변수명;
	 * 자료형 변수명 = 초기값;
	 *  - 자료형
	 */
		//기본 자료형
		boolean isEven = false; //Even -> 짝수를 의미
		char operator = '+';
		int age = 30;
		float pi1 = 3.1415f; //float은 접미사 f나 F를 반드시 붙여야 한다.
		double pi2 = 3.1415;
		//참조형 문자열
		String str = "+";
		
		//사과의 개수를 저장하기 위한 변수를 선언해보세요.
		
		int countOfApple;
		
		//학생 평균 성적을 저장하기 위한 변수를 선언해보세요.
		
		double avgScore;
		
		int num;
		//double num;//Duplicate local variable num : 중복된 변수를 선언
		int NUM; //대소문자를 구분
		int num1;
		//int 1num;//숫자로 시작할 수 없다
		int _num, $num;
		//int !num2;//_와 $가 아닌 문자가 나오면 에러
		//int int;//예약어 사용시 에러
		
		/* 관례 : 
		 *  - 변수는 소문자로 시작
		 *  - 카멜 표기법을 따라서 두번째 글자부터 첫글자를 대문자로 
		 *  - 클래스와 인터페이스는 대문자로 시작
		 */
		

	}

}
