package day19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateEx01 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student> ();
		list.add(new Student(1,1,1,"홍길동", 100,90,80));
		list.add(new Student(1,2,1,"바보", 50,40,30));
		list.add(new Student(2,4,1,"멍청이",20,80,45));
		/*1학년 1반 학생들을 출력하는 코드를 작성하세요
		 * 1학년 2반 학생들을 출력하는 코드를 작성하세요
		 * 1학년 학생들을 출력하는 코드를 작성하세요.
		 * */
		
		printGrade(list,2);
		printGradeAndClass(list,1,2);
		print(list, (s) ->s.getName().charAt(0)=='홍');
	}
public static void printGrade(ArrayList<Student> list, int grade) {
	
	for(Student tmp:list) {
		 if(grade == tmp.getGrade()) {
				System.out.println(tmp);
			}
	}	
}

public static void printGradeAndClass(ArrayList<Student> list, int grade, int classNum) {
	
	for(Student tmp:list) {
		
		 if(grade == tmp.getGrade() && classNum==tmp.getClassNum()){
			 System.out.println(tmp);
		 	}
		}
	}
	
public static void print(ArrayList<Student> list, Predicate<Student> p) {
	for(Student tmp : list) {
		if(p.test(tmp)) {
			System.out.println(tmp);
		}
	}
}
}

	

