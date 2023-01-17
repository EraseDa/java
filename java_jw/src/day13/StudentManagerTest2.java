package day13;

import java.util.Scanner;

public class StudentManagerTest2 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student [] stds = new Student[30];
		int count = 0;
		int menu = -1;
	
		for( ;menu != 4 ; ) {
			printMenu();
			menu = sc.nextInt();
			count = runMenu(menu, stds,count);
			}
	}
	
	private static int runMenu(int menu, Student[] stds, int count) {
		Scanner sc = new Scanner(System.in);
		switch(menu) {
			case 1 :
				if(addStudent(stds,count)) {
				System.out.println("학생을 추가했습니다.");
				count++;
				}  else {
				System.out.println("학생을 추가하지 못했습니다.");
			} break;
			case 2 : 
				boolean res = addScore(stds, count);
					if (res) {
							System.out.println("성적을 등록했습니다.");
						}	 else {
							System.out.println("성적 등록에 실패했습니다.");
						}	break;		
			case 3 :
					printStudentList(stds,count);
				break;
			case 4 : 
				System.out.println("프로그램 종료");
				break;
			default :
			System.out.println("잘못된 메뉴!!");
		
		}
		return count;
	}

	private static void printStudentList(Student[] stds, int count) {
		for(int i = 0; i <count; i++) {
			System.out.println(stds[i]);
			stds[i].printScore();
		}				
	}

	private static boolean addScore(Student[] stds, int count) {
		System.out.println("성적을 추가할 학생 정보 입력");
		Student tmp = scStudentBaseInfo();
		int index = indexOfScore(stds, count, tmp);
		
		if (index == -1) {
			return false;
		}
		System.out.println("성적을 입력하세요");
		return stds[index].addScore(scScore());
	}

	private static boolean addStudent(Student[] stds, int count) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 학생 정보 입력");
		Student tmp = scStudentBaseInfo();

		System.out.print("이름 : ");
		tmp.setName(sc.next());
					
		int index = indexOfStudent(stds, count, tmp);
	
		if(index == -1 && count < stds.length) {
			stds[count] = tmp;
			return true;
		}
		return false;
	}

	private static Score scScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 : ");
		String title = sc.next();
		System.out.print("학기 : ");
		int term = sc.nextInt();
		System.out.print("중간 : ");
		int midScore = sc.nextInt();
		System.out.print("기말 : ");
		int finalScore = sc.nextInt();
		System.out.print("수행평가 : ");
		int performance = sc.nextInt();
		return new Score(title, term, midScore, finalScore, performance);
	}

	private static Student scStudentBaseInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년 : ");
		int grade =sc.nextInt();
		System.out.print("반 : ");
		int classNum =sc.nextInt();
		System.out.print("번호 : ");
		int num =sc.nextInt();
		return new Student(grade, classNum, num);
	}

	private static int indexOfScore(Student[] stds, int count, Student tmp) {
		for(int i=0; i<count; i++) {
			if(stds[i].equals(tmp)) {
				return i;
			}
		} return -1;
	}	
	

	private static int indexOfStudent(Student[] stds, int count, Student tmp) {
		for(int i=0; i<count; i++) {
			if(stds[i].equals(tmp)) {
				return i;
			}
			
		}
		return -1;
	}

	private static void printMenu() {
		System.out.println("------메뉴-----");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 학생 성적 추가");
		System.out.println("3. 학생 정보 출력");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}

}