package day25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*정수를 5번 입력하여 배열/리스트에 저장하는 코드를 작성하세요.
		 * 정수가 홀수이면 그대로 저장. 정수가 짝수이면 -를 붙여서 저장*/
		//배열 편
		int size = 5;
		int [] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("정수 입력 : ");
			int num = sc.nextInt();
			arr [i] = num%2==0? -num : num;
			}
		System.out.println(Arrays.toString(arr));
		//리스트 편
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			System.out.println("정수 입력 : ");
			int num = sc.nextInt();
			if(num %2 !=0) {
				list.add(num);
			}else {
				list.add(-num);
			}
			}
		for(int num2 : list) {
			System.out.print(" " +num2);
	}
	}
	
}


