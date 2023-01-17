package db_day03.Dao;

import db_day03.Vo.StudentVO;

public interface StudentDAO {

	void insertStudent(StudentVO std);
	void updateStudent(StudentVO std);
}
