package day26;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Ex04_ClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*서버에 연결을 요청하고,
		 * 연결이 되면 exit를 입력하기 전까지
		 * 문자열을 서버에 전송함*/
		Socket socket = null;
		
		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(5001));
			System.out.println("[연결 완료]");
			Client c = new Client(socket);
			c.send();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	
}

