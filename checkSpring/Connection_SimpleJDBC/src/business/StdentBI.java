package business;

import model.Student;

public interface StdentBI {

	
	public int createstudent(Student st)throws Exception;
	public boolean deletestudent(Student st)throws Exception;
	public boolean updatestudent(Student st)throws Exception;
	
}
