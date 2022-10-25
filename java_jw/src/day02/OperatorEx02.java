package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		/*증감 연산자는 최종적으로 1증가/1감소
		 * 전위 : 증가하고 동작
		 * 후위 : 동작하고 증가
		 */
		
		int a = 10, b = 10;
		
		System.out.println("증가 전 : a = " + a + ", b = " + b);
		System.out.println("증가 중 : a = " + ++a + ", b = " + b++);
		System.out.println("증가 후 : a = " + a + ", b = " + b);
		
		a = 10;
		b = 10;
		System.out.println("증가 전 : a = " + a + ", b = " + b);
		++a;
		System.out.println("증가 중 : a = " + a + ", b = " + b);
		++b;
		System.out.println("증가 후 : a = " + a + ", b = " + b);
		
		a = 10;
		b = 10;
		
		System.out.println("증가 전 : a = " + a + ", b = " + b);
		a++;
		System.out.println("증가 중 : a = " + a + ", b = " + b);
		b++;
		System.out.println("증가 후 : a = " + a + ", b = " + b);

		//위와 아래가 같은 이유는 동작이 없기 때문! 동작이 없어서 바로 연산이 되기 때문에 전위와 후위가 일치
	}

}
