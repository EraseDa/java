package example.db.dao;

import java.util.ArrayList;


import example.db.vo.StudentVO;



public interface StudentDAO {

	
	ArrayList<StudentVO> selectAllStudent();
	
	StudentVO selectStudent(String st_num);
	int insertStudent(StudentVO std);

	int updateStudent(StudentVO std);



	
	
	
}
