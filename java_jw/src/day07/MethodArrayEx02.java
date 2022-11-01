package day07;

public class MethodArrayEx02 {

	public static void main(String[] args) {
		/* 1~9 사이의 랜덤한 수를 배열에 3개 저장하는 코드를 작성하세요.
		 * 메소드를 이용할 것.*/ 

			int min=1, max=9;
			int arr2[] = new int[3];
			createRandomArray1(arr2,min,max);
			System.out.println("---------------");
			printArray(randomArray(1,9,3));
			System.out.println("---------------");
			printArray(createRandomArray2(1,9,3));
			System.out.println("---------------");
			System.out.println(random(1,9));
	}
	
	public static void printArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/* 기능 :  min과 max사이의 랜덤한 수 size개를 생성하여 배열을 저장하여 저장된 배열을 알려주는 메소드
	 * 매개변수 :  int min, int max
	 * 리턴타입 : void
	 * 메소드명 : printArray
	 * */
	
	public static int[] randomArray(int min, int max, int size) {
		int arr[] = new int[size];
		for(int j=0; j<size; j++) {
			int i = (int)(Math.random()*(max-min+1)+min); 
			arr[j] = i;  
		}  return arr;
	}
	/* 기능 :  최소값과 최대값 사이의 랜덤한 수를 주어진 배열에 저장하는 메소드
	 * 매개변수 :  int min, int max, int arr[]
	 * 리턴타입 : void
	 * 메소드명 : creatRandomArray1
	 * */
	public static void createRandomArray1(int arr[], int min, int max) {
		for(int i = 0; i < arr.length; i++) {
			arr [i] = random(min,max);
		}
	}
	
	
	/* 기능 :  min과 max사이의 랜덤한 수 size개를 생성해 배열에 저장한 후, 반환하는 메소드
	 * 매개변수 :  int min, int max, int size
	 * 리턴타입 : int[]
	 * 메소드명 : creatRandomArray2
	 * */
	public static int [] createRandomArray2(int min, int max, int size) {
		int arr[] = new int[size];
		for(int j=0; j<size; j++) {
			int i = (int)(Math.random()*(max-min+1)+min); 
			arr[j] = i;  
		} 
		return arr;
	}	
	
	/* 기능 : 최솟값과 최대값 사이의 랜덤한 수를 생성하여 알려주는 메소드
	 * 매개변수 : int min, int max
	 * 리턴타입 : 랜덤한 수 = >  int 
	 * 메소드명 : random
	 * */
	public static int random (int min, int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	
	
}
