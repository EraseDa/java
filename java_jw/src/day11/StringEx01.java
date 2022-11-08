package day11;



public class StringEx01 {

	public static void main(String[] args) {
		 /* String 클래스는 문자열의 값을 수정할 수 없다.
		  * StringBuffer 클래스는 문자열의 값 수정할 수 있다.
		  * StringBuilder 클래스는 StringBuffer와 동일하다.
		  * StringBuffer는 쓰레드에서 safe기능 제공하고, StringBuilder는 제공하지 않음
		  * */
		String str = "abc";
		System.out.println(str);
		str = new String("defe");
		System.out.println(str);

		/*length() : 문자열 길이*/
		System.out.println("문자열의 길이 : " + str.length());
		int [] arr = new int[5];
		System.out.println("배열의 길이 : " + arr.length);
	
		/* indexOf(문자 또는 문자열) : 해당 문자 또는 문자열을 0번지부터 탐색하여
		 * 첫번째로 만나는 문자 또는 문자열의 시작 번지 (if 없는 경우엔 -1로 나옴)
		 * lastIndexOf(문자 또는 문자열) : 해당 문자 또는 문자열을 마지막번지부터 탐색하여
		 * 첫번째로 만나는 문자 또는 문자열의 시작 번지 ((if 없는 경우엔 -1로 나옴)
		 * contains(문자 또는 문자열) : 해당 문자/문자열이 있는지 없는지를 알려줌*/
		System.out.println("e의 위치 : " + str.indexOf("e"));
		System.out.println("e의 위치 :" + str.lastIndexOf("e"));
		
		/*substring(시작번지) : 문자열의 시작번지부터 끝까지 부분 문자열을 추출
		 * substring(시작번지, 마지막번지) :  문자열의 시작번지부터 마지막 번지 -1 까지 부분문자열을 추출
		 * */
		
		System.out.println("0번지부터 부분문자열 : " + str.substring(0));
		System.out.println("0번지부터 부분문자열 : " + str.substring(1,3));
		
		/* equals (문자열) : 문자열과 같은지 다를지를 알려줌
		 * 문자열은 참조변수이기 때문에 ==를 통해서는 정확히같은지 다른지를 비교할 수 없다.
		 * 리터럴 문자열은 리터럴들만 모여있는 공간에 할당되는데, 같은 리터럴 문자열이 있는 경우
		 * 새로 만들지 않고 기존에 있는 리터럴 문자열의 주소를 반환
		 * */
	
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String ("abc");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str1과 str2가 같다?(==) : " + (str1 == str2)); //str1과 str2은 같은 리터럴 공간 주소를 공유
		System.out.println("str1과 str3이 같다? :(==) " + (str1 == str3));
		System.out.println("str1과 str2가 같다?(equals) : " + (str1.equals(str2)));
		System.out.println("str1과 str3이 같다? :(equals) " + (str1.equals(str3)));
		
		/*charAt(번지) : 문자열에서 해당 번지에 있는 문자열을 반환
		 * */
		String str4 = "Hello";
		System.out.println(str4 + "문자열에 2번지에 있는 문자 : " +str4.charAt(2));
		
		/* split(정규표현식) : 정규표현식을 기준으로 문자열을 추출하여 배열로 만듦
		 * */
		String fruit = "사과, 배, 오렌지, 귤";
		String [] fruits = fruit.split(",");
		for(String tmp : fruits) {
			System.out.println(tmp);
		}
		/* trim() : 시작 문자 앞에 있는 공백들을 제거하고 마지막 문자 뒤에 있는 공백들을 제거함
		 * */
		String str5 = "\n\n       \t 안녕 하세요.\n\n";
		System.out.println("trim 전 문자열 : " + str5);
		System.out.println("trim 후 문자열 : " + str5.trim());
	}

}
