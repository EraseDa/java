package day22;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Log {

	private ArrayList<StudentLog> slogs = new ArrayList<StudentLog>();
	private String date;

	public Log(ArrayList<StudentLog> stdLogs, String date) {
		this.date=date;
		this.slogs=stdLogs;
		}
	}


