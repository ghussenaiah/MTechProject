package dao;


import java.util.List;
import model.Student;

public interface StudentDaoI {


	public int save(Student st)throws Exception;
	public boolean update(Student st)throws Exception;
	public boolean delete(Student st)throws Exception;
	public Student findByPK(int id)throws Exception;
	public List<Student> fingByName(String name)throws Exception;
	public List<Student> fingByEmail(String email)throws Exception;
	public List<Student> fingByAddress(String address)throws Exception;
	public List<Student> findAll()throws Exception;

	
}
