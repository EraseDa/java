package day19;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

import day19.Student;

public class FunctionEx01 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student> ();
		list.add(new Student(1,1,1,"홍길동", 100,90,80));
		list.add(new Student(1,2,1,"바보", 50,40,30));
		list.add(new Student(2,4,1,"멍청이",20,80,45));
		
		/*학생들의 국어성적만 출력하는 코드를 작성하세요.*/
		/*학생들의 영어성적만 출력하는 코드를 작성하세요.*/
		/*학생들의 수학성적만 출력하는 코드를 작성하세요.*/
		//printKor(list);
		//printEng(list);
		//printMath(list);
		
		print(list, "국어", s -> s.getKor());
	}
	public static void print(ArrayList<Student> list, String subject, Function<Student, Integer> f) {
		
		for(Student tmp : list) {
			System.out.println(subject + " : " + f.apply(tmp));
		}
	}

	public static void printKor(ArrayList<Student> list) {
		
		for(Student tmp : list) {
			System.out.println("국어" + tmp.getKor());
		}
	}
	
	public static void printEng(ArrayList<Student> list) {
		
		for(Student tmp : list) {
			System.out.println("영어" + tmp.getEng());
		}
	}
	
	public static void printMath(ArrayList<Student> list) {
			
		for(Student tmp : list) {
			System.out.println("수학" + tmp.getMath());
			
		}			
	}
	
}
