package day15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class WordListMain {

	public static void main(String[] args) {
	//영어 단어장 프로그램을 구현하세요
		ArrayList<Word> wordList = new ArrayList<Word>();
		int menu = -1;
		Scanner sc = new Scanner(System.in);
		do {
			printMenu();
			try {menu = sc.nextInt();
			runMenu(wordList, menu);
			}catch(InputMismatchException e) {
				System.out.println("----------------");
				System.out.println("예외 발생 : 정수를 입력하세요");
				System.out.println("----------------");
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println("----------------");
				System.out.println(e.getMessage());
				System.out.println("----------------");
			}
		}while(menu !=5);	
	}
	
	private static void runMenu(ArrayList<Word> wordList, int menu) throws Exception {
		Scanner sc = new Scanner(System.in);
		switch(menu) {
		case 1:
			insertWord(wordList);	
			break;
		case 2:
			printWord(wordList);
			break;
		case 3:
			updateWord(wordList);
			break;
		case 4:
			deleteWord(wordList);
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			break;
		default :
			throw new Exception("잘못된 메뉴입니다.");
		}
		
	}

	private static void deleteWord(ArrayList<Word> wordList) throws Exception {
		Scanner sc = new Scanner(System.in);
		//수정할 단어 입력
		System.out.println("단어 입력 : ");
		String word = sc.next();
		//단어장에서 입력 단어와 일치하는 단어 객체들을 가져옴
		ArrayList<Integer> indexList = findWordList(wordList, word);
		//가져온 단어 객체들을 출력
		if(indexList == null || indexList.size() == 0) {
			throw new Exception("예외 발생 : 삭제하려는 단어가 단어장에 없습니다.");
		
		}
		
		for(int i =0; i<indexList.size();i++) {
			int index = indexList.get(i);
			System.out.println(i+1+". " + wordList.get(index));
		}
		//수정할 단어 번호를 입력
		System.out.print("삭제할 번호 : ");
		int index = sc.nextInt() - 1;
		
		if(index < 0 || index >=indexList.size()) {
			throw new Exception("예외 발생 : 삭제할 잘못된 번호를 입력했습니다.");
		}
		wordList.remove((int)indexList.get(index));
		System.out.println("삭제가 완료됐습니다.");
	}

	private static void updateWord(ArrayList<Word> wordList) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단어 입력 : ");
		String word = sc.next();
		//단어장에서 입력 단어와 일치하는 단어 객체들을 가져옴
		ArrayList<Integer> indexList = findWordList(wordList, word);
		//가져온 단어 객체들을 출력
		if(indexList == null || indexList.size() == 0) {
			throw new Exception("예외 발생 : 수정하려는 단어가 단어장에 없습니다.");
		
		}
		
		for(int i =0; i<indexList.size();i++) {
			int index = indexList.get(i);
			System.out.println(i+1+". " + wordList.get(index));
		}
		//수정할 단어 번호를 입력
		System.out.print("수정할 번호 : ");
		int index = sc.nextInt() - 1;
		
		if(index < 0 || index >=indexList.size()) {
			throw new Exception("예외 발생 : 수정할 잘못된 번호를 입력했습니다.");
		}
		//수정할 뜻을 입력
		System.out.print("뜻 : ");
		sc.nextLine();
		String mean = sc.nextLine();
		//선택된 단어의 뜻을 수정
		Word tmp =  wordList.get(indexList.get(index));
		tmp.setMean(mean);
		System.out.println("수정이 완료됐습니다.");
	}

	private static ArrayList<Integer> findWordList(ArrayList<Word> wordList, String word) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<wordList.size(); i++) {
			if(wordList.get(i).equals(word)) {
			list.add(i);
			}
		}
		return list;
	}

	private static void printWord(ArrayList<Word> wordList) {
		if(wordList == null || wordList.size() ==0) {
			System.out.println("-----------------------");
			System.out.println("단어장이 비었습니다.");
			System.out.println("-----------------------");
			return;
		}
		System.out.println("-----------------------");
		for(Word tmp : wordList) {
			System.out.println(tmp);
		}System.out.println("-----------------------");
	}

	private static void insertWord(ArrayList<Word> wordList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단어 : ");
		String word = sc.next();
		sc.nextLine();//위에서 입력한 엔터를 처리해주는 코드
		
		System.out.print("뜻 : ");
		String mean = sc.nextLine();
		//단어 객체 생성하기
		
		Word tmp = new Word(word, mean);
		
		wordList.add(tmp);
		
		
	}

	public static void printMenu() {
		System.out.println("----------------");
		System.out.println("메뉴");
		System.out.println("1. 단어 추가");
		System.out.println("2. 단어 확인");
		System.out.println("3. 단어 수정");
		System.out.println("4. 단어 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴 선택 : ");
		}
}


