package day17;

import lombok.Data;
//키가 아이디 밸류가 멤버
@Data
public class Member {

	public Member(String pw, String name, String residentNumber, int age) {
		this.pw=pw;
		this.name=name;
		this.residentNumber=residentNumber;
		this.age=age;
	}
	private String pw, name, residentNumber;
	private int age;
	
	public void update(String newPw, String name, String residentNumber, int age) {
		this.pw=newPw;
		this.name=name;
		this.residentNumber=residentNumber;
		this.age=age;
	}
	
}
