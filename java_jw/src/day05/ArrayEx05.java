package day05;

public class ArrayEx05 {

	public static void main(String[] args) {
		/* 5개짜리 배열을 생성하여 2부터 5개의 소수를 배열에 저장하고 출력하세요.
		 * */ 

		int arr [] = new int[5];
		int index=0; //소수를 저장할 배열의 번지
		int i, count = 0;
		int num;
		
		for(num=2; ;num++) { //num가 소수인지 판별하는 코드가 필요
			
			for(i =1,count=0;  i<=num ; i++) {
				if(num % i == 0) {
					count++;
					};
			}
				if(count == 2) {
					arr[index]=num; 
					index++;
					}
				if(index==arr.length) {
					break;
				}
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		} 
		
	}


