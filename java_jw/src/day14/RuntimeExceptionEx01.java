package day14;

import lombok.Data;

public class RuntimeExceptionEx01 {

	public static void main(String[] args) {
		//RuntimeExption은 코드 상 에러 표시가 안나고, 실행 시 예외가 발생할 수 있음.
		//예외처리가 필수가 아님.
		//ArithmeticException 발생. 0으로 나누면 안됨
		int num1 = 1, num2 =0;
		//System.out.println(num1/num2);
		//System.out.println(num1%num2);
		Parent p = null;
		p.print();
		exceptionTest(p);
	}

	public static void exceptionTest(Parent a) {
		a.print();
	}	
}
@Data
class Parent{
	private int num;
	public void print() {
		System.out.println(num);
	}
}

class Child extends Parent{}
