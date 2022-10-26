package day03;

public class ForEx04 {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수를 출력하는 코드를 작성하세요.
		 * */ 
		
		//int i = 1;
		//for(i=1; 1>0 && i<=5; i++){System.out.prinln(2*i);}
		
		//int i;
		//for(i=2; i>1 && i <11; i = i+2) {System.out.println(i);}
		//for(i=2; i <= 10; i +=2){System.out.println(i);}
		
		int i;
		for(i=1; i>0 && i <11; i++) {if(i % 2 ==0) {System.out.println(i);}}
		
	}

}
