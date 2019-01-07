import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class MsAccessConnection {

	//do one thing 
	//administrative tools-dataSource(ODBC)->SystemDSN->add->Microsoft Access Driver(mdb,accdb)->
	//-->give database name->select->database location>ok->ok
	//without above still working no problem
		 public static void main(String[] args)
         {
         try 
           {
        	 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DavidHusen\\Documents\\David.accdb");
        	 Statement s = conn.createStatement();
          
        	 ResultSet rs =  s.executeQuery("SELECT * FROM mstable");
        	 while(rs.next())
        	 {
        	     System.out.println(rs.getInt("ID") + " " + rs.getString("Name") + " " + rs.getString("Age"));
             }
           }catch(Exception e)
         {
        	   System.out.println(e);
         }
		
         }
	
	
}
