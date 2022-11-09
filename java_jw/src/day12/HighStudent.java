package day12;

import java.util.Scanner;

public class HighStudent {


	private int grade, classNum, num;
	private String name;
	
	//학생 정보(학년, 반, 번호, 이름)를 입력하는 메소드
	public void addInfor() {
	
		Scanner sc = new Scanner(System.in);
		grade = sc.nextInt();
		classNum= sc.nextInt();
		num= sc.nextInt();
		name = sc.next();
	}
	//생성자
	public void HighStudent() {
		this.grade = 0;
		this.classNum =0;
		this.num = 0;
		this.name = null;
		
	}
	public void printInfo() {
		System.out.println( "이름 : " + name + "/" + grade + "학년 " + classNum + "반 " + num + "번호 ");
	}

	public int[] getInfor() {
		int [] tmp = new int[3];
		return tmp;
	}
	
}
