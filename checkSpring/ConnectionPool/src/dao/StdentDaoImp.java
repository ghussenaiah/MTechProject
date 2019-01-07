package dao;

import java.sql.Connection;
import java.util.List;

import javax.activation.DataSource;

import model.Student;


public class StdentDaoImp implements StudentDaoI {

	private DataSource ds;
	
	
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student st) throws Exception {
	
		         Connection con=((javax.sql.DataSource) ds).getConnection();
		      // TODO Auto-generated method stub
		         con.close();
		return 0;
	}

	@Override
	public boolean update(Student st) throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return false;
	}

	@Override
	public Student findById(int id) throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return null;
	}

	@Override
	public Student fingByName(String name) throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return null;
	}

	@Override
	public Student fingByEmail(String email) throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return null;
	}

	@Override
	public Student fingByAddress(String address) throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		Connection con=((javax.sql.DataSource) ds).getConnection();
	      // TODO Auto-generated method stub
	         con.close();
		return null;
	}

}
