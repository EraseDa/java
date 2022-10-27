package day04;

public class NestingForStarEx02 {

	public static void main(String[] args) {
		/* *
		 *  **
		 *  ***
		 *  ****
		 *  *****
		 * */ 
		
		//int i;
	   //	int row;
		//for(row=1; row<=5; row++) {
		//for(i=1; i<=row; i++) {System.out.print("*");}
		//System.out.println();
	
		//int row, col;
		//for(row=1; row<=5; row++) {
			//for(col=1; col <=5-row; col++) {System.out.print(" ");}
		//for( col=1; col <=row; col++ ) {System.out.print("*");}System.out.println();} 		
		
		int i, row;
		for(row=1; row <=5; row++) {
			for(i=1; i<=5-row;i++) {System.out.print(" ");}
			for(i=1; i <= row; i++) {System.out.print("*");
			}for(i=1; i<=row-1; i++) {System.out.print("*");}
			System.out.println();
		}
		
		
	}
}
