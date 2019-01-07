package business;

import dao.StudentDaoI;
import model.Student;

public class StudentBImple implements StdentBI {

	
	private StudentDaoI dao;
	
	public StudentDaoI getDao() {
		return dao;
	}

	public void setDao(StudentDaoI dao) {
		this.dao = dao;
	}

	@Override
	public int createstudent(Student st) throws Exception {
		
		
		
		return dao.save(st);
	}

	@Override
	public boolean deletestudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatestudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
