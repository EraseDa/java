package day18;

import java.util.Scanner;

public class EnumEx02 {

	public static void main(String[] args) {
		/*오늘의 요일을 영어로 입력받아 한굴로 출력하는 코드를 작성하세요
		 * 예
		 * 요일 : WEDNESDAY
		 * 수요일*/
		
		Scanner sc =new Scanner(System.in);

		String mon = "MONDAY";
		String tues = "TUESDAY";
		String wed = "WEDNESDAY";
		String thur = "THURSDAY";
		String fri = "FRIDAY";
		String sat = "SATURDAY";
		String sun = "SUNDAY";
		
		System.out.print("요일 : ");
		String day = sc.next();
		
		
		if(day.equals(mon)) {
			System.out.println("월요일");
		}
		if(day.equals(tues)) {
			System.out.println("화요일");
		}
		if(day.equals(wed)) {
			System.out.println("수요일");
		}
		if(day.equals(thur)) {
			System.out.println("목요일");
		}
		if(day.equals(fri)) {
			System.out.println("금요일");
		}
		if(day.equals(sat)) {
			System.out.println("토요일");
		}
		if(day.equals(sun)) {
			System.out.println("일요일");
		}
	try {
	Week week = Week.valueOf(day);
	switch(week) {
	case MONDAY : System.out.println("월요일"); break;
	case TUESDAY : System.out.println("화요일"); break;
	case WEDNESDAY: System.out.println("수요일"); break;
	case THURSDAY : System.out.println("목요일"); break;
	case FRIDAY : System.out.println("금요일"); break;
	case SATURDAY: System.out.println("금요일"); break;
	case SUNDAY	 : System.out.println("토요일"); break;
	
	}
}catch(Exception e) {
	System.out.println("잘못 입력했습니다.");
}
	
		
	}

}
enum Week{
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,SUNDAY	 
}