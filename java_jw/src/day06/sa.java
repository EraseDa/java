package day06;

import java.util.Scanner;

public class sa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int sum=0;
		for(int i=1; i <=T; i++) {
			for(int num =1; num<=10;num++) {
				int input = sc.nextInt(); if (input % 2 ==1) {sum+=input;}
			}
			System.out.println("#" + i + " " + sum );
		}
		
		sc.close();
		
	}

}
