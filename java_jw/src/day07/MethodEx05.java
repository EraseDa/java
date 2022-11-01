package day07;

public class MethodEx05 {

	public static void main(String[] args) {
		// 1부터 10까지 합을 구하는 코드를 작성하세요. 단 메소드를 이용할 것
		
		System.out.println(Plus(5,10));
		System.out.println(Sum(10,5));
		System.out.println(Plus1(10,5));

	}
	/* 기능 :  처음 정수와 끝 정수를 입력하면 그 사이에 있는 정수들의 합을 구하고, 더한 결과를 알려주는 메소드
	 * 매개변수 :  int start, int end
	 * 리턴타입 : 더한 결과 = >  int
	 * 메소드명 : Plus
	 * */
	
	public static int Plus (int start, int end) {
		int sum=0;
		for(int i = start; i <=end; i++) {
		sum+=i;
	} return sum;
	
}
	public static int Sum (int end, int start) {
		int sum=0;
		for(int i = end; i >=start; i--) {
		sum+=i;
	} return sum;
}
	public static int Plus1 (int start, int end) {
		if(start>end) {
			int tmp = start;
			start = end;
					end = tmp;
		}
		int sum=0;
		for(int i = start; i <=end; i++) {
		sum+=i;
	} return sum;
	
}
	
}