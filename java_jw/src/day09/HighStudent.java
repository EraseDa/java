package day09;

public class HighStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

private int grade, classNum, num;
private String name;
private int kor, eng, math;


public void print() {
 System.out.println(name + " : " + grade + "학년 " + classNum + "반 " + num + "번 " );
 System.out.println("국 : " + kor + " 수 : " + math + " 영 : " + eng);
}


public void updateKor(int kor1) {
	kor = kor1;
}
public void updateMath(int math1) {
	math = math1;
}
public void updateEng(int eng1) {
	eng = eng1;
}

public void updateScore(int kor1, int math1, int eng1) {
	updateKor(kor1);
	updateMath(math1);
	updateEng(eng1);
}
public HighStudent() {
	this(1,1,1,"");
}

public HighStudent(int grade1, int classNum1, int num1, String name1) {
	
	grade = grade1;
	classNum = classNum1;
	num = num1;
	name = name1;
}
}