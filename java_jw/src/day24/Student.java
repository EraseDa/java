package day24;


import java.io.Serializable;
import java.util.ArrayList;

import lombok.Data;
@Data
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -640733973647676408L;
	private String name;
	private int grade,classNum,num;
	ArrayList<Student> list;
	
	public Student(String name, int grade, int classNum, int num) {
	
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	
	}

	@Override
	public String toString() {
		return "[이름:" + name + ", 학년 : " + grade + ", 반 : " + classNum + ", 번호 : " + num + "]";
	}


}
