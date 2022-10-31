package day06;

public class ArrayRandomEx02 {

	public static void main(String[] args) {
		/* 랜덤으로 1~9 사이의 숫자를 중복되지 않게 3개 생성하여 배열 저장하는 코드를 작성하세요.
		 * */ 
		int size = 3;
		int arr[] = new int[size]; //랜덤 수를 저장할 배열
		int count = 0; //저장된 랜덤 수의 개수
		
		int min=1, max = 9;//랜덤 수 범위
		//배열에 저장된 중복되지 않은 수가 3개가 될 때까지 반복해야함
		
		while(count<3) {
			
			//랜덤한 수 생성
			int r = (int)(Math.random()*(max-min+1)+min);
			
			boolean isDuplicated = false;
			//배열에 저장된 수 중에서 랜덤한 수와 일치하는 숫자가 있는지 없는지 확인하여
			//저장된 숫자 개수만큼 반복 => i번지부터 저장된 개수보다 작거나 같을때까지
			for(int i=0; i <count; i++) {
				if(arr[i] == r) {
					isDuplicated = true;
				}
			}	
			
			//참고로 처음엔 배열에 저장된 숫자는 0개임
					//배열에 저장된 숫자 개수만큼 확인
					// i번지에 있는 숫자와 랜덤수가 같으면 isDuplicated를 true로 
			
			//있으면 다음 처음으로, (isDuplicated가 true면)
			// 없으면 배열에 저장하고, 저장된 개수 1 증가
			if(isDuplicated) {
				continue;
			}
			else {
				arr[count] = r; // 두 줄을 한 줄로 만들려면, arr[count++] =r ;
				count++;
			}
		}
			for(int tmp : arr) {
				System.out.print(tmp + " ");
			}
		

		
		
		
		
	}
	}



