import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class MsAccess_Insert {

	//Do One thing
	//select table and right click select design view remove auto number property; 
	public static void main(String[] args)
    {
    try 
      {
   	 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DavidHusen\\Documents\\David.accdb");
   	 Statement s = conn.createStatement();
 
   	String sql = "INSERT INTO MSTABLE(ID,NAME,AGE) VALUES (2,'Jack',34)";

    java.sql.PreparedStatement ps= (java.sql.PreparedStatement) conn.prepareStatement(sql);
   	 
    int i=ps.executeUpdate();
	 conn.close();
	  
	 System.out.println(i);
   	 
   	
      }catch(Exception e)
    {
   	   System.out.println(e);
    }
	
    }

}
