package day24;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	/*학생 정보를 관리하는 프로그램을 작성하세요.
	 * 1. 학생 추가(이름,학년,반,번호)
	 * 2. 학생 출력
	 * 3. 종료
	 * -프로그램 시작 전 학생 정보를 읽어오는 기능 추가 (load)
	 * -프로그램 종료 전 학생 정보를 저장한는 기능 추가(save)
	 * */
		String fileName="student.txt";
		int menu = 0;
		ArrayList<Student> list = new ArrayList<Student>();
		
		load(list,fileName);
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu,list);
		}while(menu!=3);
		save(list,fileName);
		
	}
	private static void load(ArrayList<Student> list, String fileName) {
		
		if(list == null) {
			throw new RuntimeException("리스트가 없습니다.");
		}
		
		try (ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(fileName))){
		while(true) {
			Student std = (Student)ois.readObject();
			list.add(std);
		 }
		}catch(FileNotFoundException e) {
		System.out.println(fileName + "을 생성할 수 없어서 저장에 실패했습니다.");
		}catch(EOFException e) {
			System.out.println("불러오기 완료");
		}catch(Exception e) {
		System.out.println("불러오기에 실패했습니다.");
		}
	}	
		
	
	private static void save(ArrayList<Student> list, String fileName) {
		if(list == null) {
			throw new RuntimeException("리스트가 없습니다.");
		}
		
		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream(fileName))){
			for(Student std : list) {
				oos.writeObject(std);
			}
			System.out.println("저장했습니다.");
		}catch(FileNotFoundException e) {
		System.out.println(fileName + "을 생성할 수 없어서 저장에 실패했습니다.");
		}catch(IOException e) {
		System.out.println("저장에 실패했습니다.");
		}
	}	
	
	private static void runMenu(int menu, ArrayList<Student> list) {
		switch(menu) {
		
		case 1:
			
			addStudent(sc, list);
			
			break;
		case 2:
			
			printStudent(list);
			break;
		case 3:
			
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
			System.out.println("잘못된 메뉴입니다.");
		}
		
	}
	private static void printStudent(ArrayList<Student> list) {
		if(list == null) {
			throw new RuntimeException("리스트가 없습니다.");
		}
		if(list.size() ==0) {
			System.out.println("학생 정보가 없습니다.");
		}
		for(Student std : list) {
			System.out.println(std);
		}
			
		
	}
	private static void addStudent(Scanner sc, ArrayList<Student> list) {
		
		sc.nextLine();
		if(list==null)
			throw new RuntimeException("학생 리스트가 없습니다.");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		
		Student std = new Student(name,grade, classNum, num);
		list.add(std);
		System.out.println("학생을 추가했습니다.");

		
	}
	private static void printMenu() {
		System.out.println("++++++++++++");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 출력");
		System.out.println("3. 종료");
		System.out.println("++++++++++++");
		System.out.print("메뉴 선택 : ");
	}

}
