package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.util.List;



import javax.sql.DataSource;

import model.Student;

public class StdentDaoImp implements StudentDaoI {

	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student st) throws Exception {
		
		/*  mysql perfect
		 java.sql.Connection con=((javax.sql.DataSource) ds).getConnection();
		String sql = "INSERT INTO STUDENT " +
				"(ID, NAME, EMAIL,ADDRESS) VALUES (?, ?, ?, ?)";
		 PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
		 ps.setInt(1, st.getId());
		 ps.setString(2, st.getName());
		 ps.setString(3, st.getEmail());
		 ps.setString(4, st.getAddress());
		 int i=ps.executeUpdate();
		 con.close();*/
		//FOLLOWING SQL CONNECTION
		 java.sql.Connection con=((javax.sql.DataSource) ds).getConnection();
			String sql = "INSERT INTO STUDENT(ID,NAME,EMAIL,ADDRESS) VALUES (?,?,?,?)";
			 PreparedStatement ps= (PreparedStatement) con.prepareStatement(sql);
			 ps.setInt(1, st.getId());
			 ps.setString(2, st.getName());
			 ps.setString(3, st.getEmail());
			 ps.setString(4, st.getAddress());
			 int i=ps.executeUpdate();
			 con.close();
			 
		 
		  return i;
	}

	@Override
	public boolean update(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findByPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> fingByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> fingByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> fingByAddress(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
