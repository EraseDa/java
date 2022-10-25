package day02;

public class OperatorEx {

	public static void main(String[] args) {
		
		//!(not)연산자 : 참 또는 거짓인 값(변수, 리터럴, 조건식) 앞에 옴. 정수, 문자열 등에는 당연히 안됨.
		boolean isMale = true;
		boolean isFemale = false;
		System.out.println("남성입니까? : " + isMale + "," + !isFemale);
		System.out.println("여성입니까? : " + !isMale + "," + isFemale);
		
		

	}

}
