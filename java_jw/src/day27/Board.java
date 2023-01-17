package day27;

import java.util.Date;

public class Board {

	private String title, content;
	private int num, count;

	Member member = new Member(title, content);
	
	public Board(String title, String content, int num) {
		this.title = title;
		this.content = content;
		this.num = num;
		++count;
		num = count;
	}
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	
	}
	
}
