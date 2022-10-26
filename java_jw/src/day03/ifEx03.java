package day03;

public class ifEx03 {

	public static void main(String[] args) {
		/* if(조건식1){실행문1;}
		 * else if(조건식2){실행문2;}
		 * else{실행문3;}
		 * 조건식 1이 참이면 실행문1을 실행, 조건식1이 거짓이고 조건식 2가 참이면 실행문 2를 실행
		 * 조건식1,2가 거짓이면 실행문3을 실행.
		 * if : 반드시 필요, 1개
		 * else if : 0개 이상
		 * else : 0개 또는 1개
		 * */
		//정수가 양수, 음수, 0인지 판별하는 코드를 작성
		
		int num =-50;
		if (num > 0) {System.out.println(num + "은 양수입니다.");}
		
		else if (num == 0) {System.out.println(num + "은 0입니다.");}
		else {System.out.println(num + "은 음수입니다.");}
		
	}

}
