package day11;

public class StringEx02 {

	public static void main(String[] args) {
		/* 문자열 str에 search가 몇 번 등장하는지 확인하는 코드를 작성하세요.*/
		String str = "Hello World! My name is Hong";
		String search = "o";

		int i; 
		int count = 0;

		
		String tmp = str;
		count = 0;
		while(true) {
			System.out.println(tmp);
			int index = tmp.indexOf(search);
			if(index == -1) {
				break;
			}
			tmp = tmp.substring(index + search.length());

			count++;
		}
		System.out.println(str + "에는 " + search + "가 " + count + "번 있습니다.");
	} 

}
