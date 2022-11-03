package day09;

public class AbstractionEx01 {

	public static void main(String[] args) {
		
		Student std1 = new Student(1,1,1,"홍길동");
		std1.print();
		std1.updateScore(50, 30, 20);
		std1.print();
	}

}
/* 학생 성적 관리 프로그램에서 필요한 학생 클래스를 만들어보세요.
 * 학생은 학년, 반, 번호, 이름, 성적을 관리
 * 성적은 국어, 영어, 수학 성적만 관리. 각 과목은 100점 만점을 기준으로 관리
 * 학생 정보 출력 기능
 * 성적을 수정하는 기능
 * - 국어
 * - 수학
 * - 영어
 * - 국어,수학,영어
 * 학생 정보의 초기값
 *  - 학년 : 1, 반: 1, 번호 : 1, 이름 : 빈문자열, 성적 : 0
 * */

class Student{
	private int grade, classNumber, num;
	private String name;
	private int kor, eng, math;
	
	
	public void print() {
	 System.out.println(name + " : " + grade + "학년 " + classNumber + "반 " + num + "번 " );
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
	public Student() {
		grade = 1;
		classNumber = 1;
		num = 1;
		name = "";
	}


	public Student(int grade1, int classNumber1, int num1, String name1) {
		
		grade = grade1;
		classNumber = classNumber1;
		num = num1;
		name = name1;
	}
	
}