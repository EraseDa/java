package day02;

public class OperatorEx07 {

	public static void main(String[] args) {
		/* 조건선택연산자
		 *  - 조건식 ? 참일 때 : 거짓일 때;
		 * */
		//주어진 성적이 60점 이상이면 Pass, 아니면 Fail이 출력되도록 코드를 작성
		
		int score = 80;
		String result = (score >= 60) ? "Pass" : "Fail";
		System.out.println(score + "점은 " + result);
	}

}
