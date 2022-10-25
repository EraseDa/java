package day02;

public class TypeCastingEx01 {

	public static void main(String[] args) {
		//접미사 f(F)가 없는 실수 리터럴은 double형임. 
		//그래서 오른쪽 1.23은 double(8byte) 이기에 왼쪽 float은 num1은 4byte이기에 
		//자동 형변환이 불가능하다.
		//But 접미사f(F)를 붙이거나 강제형변환을 해주어야함
		float num1 = (float)1.23;
		//정수 리터럴은 자료형에 맞는 타입으로 설정
		byte num2 = 3;
		long num3 = 3;
		int num4 = (int)12345678901L;
		
		
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
