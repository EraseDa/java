package day30;

import java.util.function.Consumer;

public class LambdaEx01 {

	static String filedStr = "필드";
	
	
	public static void main(String[] args) {
		String str = "main 지역변수";
		Consumer<Object> con = o->{
			LambdaEx01.filedStr = "람다식에서 변경";
			System.out.println(str);
			//str +=""; //에러발생. 지역변수는 람다식에서 final이 자동으로 붙음. 즉 상수취급해서 바꿀 수 없단 말
		};
		con.accept("");
		System.out.println(filedStr);
	}

}
