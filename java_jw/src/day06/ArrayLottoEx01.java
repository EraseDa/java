package day06;

import java.util.Scanner;

public class ArrayLottoEx01 {

	public static void main(String[] args) {
		/* 로또 번호를 랜덤으로 생성하고, 당첨번호를 입력하여 몇 등 당첨됐는지 출력하는 
		 * 코드를 작성하세요.
		 * 숫자 범위 : 1~ 45
		 * 1등 : 6개
		 * 2등  : 5개 + 보너스 번호
		 * 3등 : 5개
		 * 4등 : 4개
		 * 5등 : 3개
		 * */ 
		int size = 6;
		int lotto[] = new int[size]; 
		int count = 0; 
		int min=1, max = 45;
		
		while(count<size) {
			
			int r = (int)(Math.random()*(max-min+1)+min);			
			boolean isDuplicated = false;
			for(int i=0; i <count; i++) {
				if(lotto[i] == r) {
					isDuplicated = true;
				}
			}	
			
			if(isDuplicated) {
				continue;
			}
			else {
				lotto[count] = r; 
				count++;
			}
	} 		
		System.out.print("로또 번호 확인 : ");
		for(int tmp : lotto) {
			System.out.print(tmp + " ");
		}
		
		//보너스 번호를 랜덤으로 생성(위에서 생성한 번호와 중복되지 않게)
		int bonus;
		while(true) {
			int r = (int)(Math.random()*(max-min+1)+min);			
			boolean isDuplicated = false;
			for(int i=0; i <size; i++) {
				if(lotto[i] == r) {
					isDuplicated = true;
				}
			}	
			
			if(isDuplicated) {
				continue;
			}
			bonus = r;
			break;
		}
		System.out.println();
		System.out.print("보너스 번호 : " + bonus);
		
		
		
		//당첨 번호 6개 입력받음
		System.out.println();
		System.out.print("\n번호를 입력하세요 : ");
	
		Scanner sc = new Scanner(System.in);
		int user[] = new int[size];
		for(int i=0; i<size; i++) {
			user[i] = sc.nextInt();
		}
		sc.close();
		
		//일치하는 번호 개수를 구함(보너스 번호 제외)
		
		//이게 바로 6 by 6 다 비교하는 코드...!!
			int sameCount = 0;
			for(int i = 0; i <lotto.length; i++) {
				for(int j=0; j<user.length;j++) {
					if(lotto[i]==user[j]) {
						sameCount++;
					}
				}
			}
			
			
			
			
			//등수 판별
			switch(sameCount) {
				case 6: 
					System.out.println("1등");
					break;
				case 5:
					boolean isDuplicated = false;
					for(int i=0; i <user.length; i++) {
						if(user[i] == bonus) {
							isDuplicated = true;
						}
					}	
					if(isDuplicated) {
						System.out.println("2등");
					} else {
						System.out.println("3등");
					}
					
					break;
				case 4:
					System.out.println("4등");
					break;
				case 3:
					System.out.println("5등");
					break;
				default :
					System.out.println("꽝!");
			}

	}	
	}

