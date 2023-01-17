package day22;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import lombok.Data;
@Data
public class Student {

	private String name;
	private String birthday;
	ArrayList<Student> list;
	
	public Student(String name, String birth) {
		
		this.name = name;
		this.birthday = birthday;
	}

	public Student(Student std) {
		this.name = std.name;
		this.birthday=std.birthday;
		
	}

	@Override
	public String toString() {
		return "[이름 : " + name + ", 생년월일 : " + birthday + "]";
	}
	
	
}
