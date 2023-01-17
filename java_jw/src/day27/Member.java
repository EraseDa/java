package day27;

import java.util.ArrayList;

public class Member {

	private String id, pw;
	ArrayList <Member> list = new ArrayList<Member>();
	
	public Member(String id, String pw) {
		
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "아이디 : " + id + ", 비밀번호 : " + pw;
	}
	
}
