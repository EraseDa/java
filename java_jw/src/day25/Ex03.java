package day25;

import java.util.ArrayList;

public class Ex03 {

	
	/* 1에서 9사이의 숫자를 랜덤하게 9번 뽑아서 일렬로 출력하는 코드를 작성하세요.*/
	public static void main(String[] args) {
		
		int min = 1, max =9;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<9; i++) {
		
			int num = (int)(Math.random()*(max-min+1)+min);
			list.add(num);
		}
		System.out.println(list.toString());
		}

}
