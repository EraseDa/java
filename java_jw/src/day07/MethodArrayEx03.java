package day07;

public class MethodArrayEx03 {

	public static void main(String[] args) {
		// 배열의 정수 num가 있는지 없는지 확인하는 코드를 작성하세요. 메소드 이용하기.
			
		int arr[] = {1, 3, 5, 7, 9};
		int num = 2;
		if(contains(num,arr)) {
			System.out.println(num + "는 배열에 있습니다.");
		}
		else { 
			System.out.println(num + "sms 배열에 없습니다.");
		}
		
		
	}

	/* 기능 :  정수 num이 배열 안에 있는지 없는지 확인하는 메소드
	 * 매개변수 :  int num, int arr[]
	 * 리턴타입 : boolean
	 * 메소드명 : contains
	 * */
	
	
	public static boolean contains(int num, int arr[]) {
	 for(int tmp : arr)   {
		 if(num == tmp) {
			 return true;
		 		}
	 		}
	 	return false;
	}
}