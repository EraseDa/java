package day19;

import java.util.Scanner;

public class BookManagerMain {

	public static void main(String[] args) {
		/*도서 관리 프로그램을 작성하세요.
		 * 도서 정보 
		 * - 도서명, 저자(여러명, 엮은이, 옮긴이 다 포함), 가격, 출판사, 분류, ISBN
		 * 기능
		 * -도서 추가
		 * 	-ISBN으로 정렬
		 * -도서 조회
		 * 	-도서명으로 조회
		 * 	-저자로 조회
		 * 	-출판사로 조회
		 * 	-분류로 조회
		 * */ 
		BookInforImp bm = new BookInforImp();
		int menu = 0;
		do {
			bm.runMenu(null, menu, null);
			
			
		}while (menu !=3);

	
	}

}
