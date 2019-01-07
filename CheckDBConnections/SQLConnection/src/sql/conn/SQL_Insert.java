package sql.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;




public class SQL_Insert {

	
	public static void main(String args[]){  
		
				 try
			        {
			     Class.forName("oracle.jdbc.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
			  
			     
			           
			     String sql = "INSERT INTO STUDENT(ID,NAME,EMAIL,ADDRESS) VALUES (22,'gandham','husen@gmail.com','mbnr')";   
				 java.sql.PreparedStatement ps= (java.sql.PreparedStatement) con.prepareStatement(sql);
				  
				 int i=ps.executeUpdate();
				 con.close();
				  
				 System.out.println(i);  
			   
			      }
			        catch (Exception e){
			            e.printStackTrace();
			     }
			
					
			}
	
}
