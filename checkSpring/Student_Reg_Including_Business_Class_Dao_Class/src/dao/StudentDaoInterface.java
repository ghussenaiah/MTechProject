package dao;

import model.Student;

public interface StudentDaoInterface {

	
	
	public int save(Student st);
	public Student find(int id); //findstudent check
}
