package day05;

public class DoWhileEx01 {

	public static void main(String[] args) {
		/* for, while문은 상황에 따라서 한 번도 동작하지 않을 수 있다.
		 * do while문은 최소 1번은 실행됨.
		 *do{
		 * 	실행문;
		 * }while(조건식); // 여기에 있는 ;필수
		 * */ 
		
		//Hello 출력되지 않음. i가 1인데 5보다 크다고 했기에
		for(int i = 1;  i >=5; i++) {
			System.out.println("Hello");
		}
		//얘는 똑같이 j가 1인데 do while문이기 때문에 조건식이 거짓이어도 무조건 1번은 실행됨.
		int j = 1;
		do {
			System.out.println("Hello");
		} while(j>=5);
		
	}

}
