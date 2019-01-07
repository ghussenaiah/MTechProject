package business;

import dao.StudentDaoInterface;
import model.Student;

public class StudentBinterfaceImple implements StudentBInterface {

	
	private StudentDaoInterface dao;
	
	

	public void setDao(StudentDaoInterface dao) {
		this.dao = dao;
	}

	@Override
	public int createStudent(Student st) {


		return dao.save(st);
	}

	@Override
	public Student find(int id) {

         
		return dao.find(id);
	}

}
