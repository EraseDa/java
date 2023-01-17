package day19;

import lombok.Data;

@Data
public class Student {

	
	
	private int grade, classNum, num;
	private String name;
	private int kor,eng,math;
	

	public Student(int grade, int classNum, int num, String name, int kor, int eng, int math) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng =  eng;
		this.math = math;	
	}
	
public Student(int grade, int classNum, int num, String name) {
		
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		
	}

@Override
public String toString() {
	return "[" + name + " : " + grade + "학년 "+classNum+ "반 "+ num+ "번 "+ "/ " + "국어 :" + kor+ " 영어 : " + eng
			+ " 수학 : " + math + "]";
}
	
}
