package sql.conn;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class SQLConnection {

	public static void main(String args[]){  
//For insertion replace  sql query
//String sql = "INSERT INTO STUDENT " +
//		"(ID, NAME, EMAIL,ADDRESS) VALUES (?, ?, ?, ?)";
		 try
	        {
	     Class.forName("oracle.jdbc.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	     Statement st=(Statement) con.createStatement();
	     System.out.println("connection established successfully...!!");     
	           
	             
	     // ResultSet rs=st.executeQuery("Select * from "+tb);
	     ResultSet rs=((java.sql.Statement) st).executeQuery("select * from student");
	           
	    while(rs.next())
	    {
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)); 
	                     
	   }
	      }
	        catch (Exception e){
	            e.printStackTrace();
	     }
	
			
	}
}