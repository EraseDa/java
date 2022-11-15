package day17;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data
public class Board {


	//게시글 번호를 위한 클래스 변수
	private static int count = 0; 

	private int view, num;
	private String title, contents, writer;
	private Date date;
	
	public Board(String title, String contents, String writer) {

		this.title = title;
		this.contents = contents;
		this.writer = writer;
		date = new Date();
		++count;
		num = count;
	}
	public Board(int num) {
		this.num= num;
	}
	public String getDate() {
		SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd ");
		return format.format(date);
	}
	
	public String print() {
		return " - - - - - - - - - - - - - - - - - -\n " 
				+ "제목 : " + title +"\n"
				+ "내용 : " + contents +"\n"
				+ "작성자 : " + writer +"\n"
				+ "조회수 : " + view +"\n"
				+ "작성일 : " + getDate() +"\n"
				+ " - - - - - - - - - - - - - - - - - -";
	}


@Override
public String toString() {
	return num + "\t" + title + "  " + writer + "  " + view + "  " + getDate();
	}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass()) {
		//obj가 Integer로 클래스변환이 가능하면 게시글 번호와obj를 비교
		if(obj instanceof Integer) {
			if(num == (Integer)obj) {
				return true;
				}
			}
		//Integer, Board 클래스가 아닌 경우
		return false;
		}
	Board other = (Board) obj;
	if (num != other.num)
		return false;
	return true;
	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + num;
	return result;
}

public void update(String title, String contents) {
		this.title = title;
	this.contents=contents;
	}

public void updateView() {
	view++;	
	}

}
