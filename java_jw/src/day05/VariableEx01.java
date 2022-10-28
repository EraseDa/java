package day05;

public class VariableEx01 {

	public static void main(String[] args) {
		/* 변수는 선언에 위치에서 같은 {}내에서 사용 가능
	      */
		int i = 0;
		//반복문 초기화에서 변선을 선언하면 이미 선언된 변수를 초기화 할 수 없다.
		for(int j =1; j<=5; j++) {
			System.out.println(j);
		}
			//이 곳에서 System.out.println(j); 사용할 경우 에러 뜸, 반복문 안에서만 j가능
		
		
		
	}

}
