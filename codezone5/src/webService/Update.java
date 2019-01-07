package webService;

import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;
 @Path("/up1")
public class Update {
	Connection conn;
    ResultSet rslt;
    String Vuser ="Valid";
    String Iuser="Invalid";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/up2")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
 public String Revenue(@QueryParam("la") String LastName,@QueryParam("use2") String Username,@QueryParam("month1") String Month,@QueryParam("pam") String CategoryID) throws SQLException
    {
           String k2=LastName;
       try{
    	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	 
         //  String url="jdbc:sqlserver://199.63.10.69\\SQLSER2008R2;databaseName=TestDB"; 
           String url="jdbc:sqlserver://IE1FVWISOP016\\SQLSER2008R2;databaseName=TestDB";
            conn=DriverManager.getConnection(url,"sa","Password@1");
         
           String sql="UPDATE SUserTable3 SET Status='Green' where Username='"+Username+"' and Month='"+Month+"' and CategoryID='"+CategoryID+"' ";
          
          java.sql.PreparedStatement pst=conn.prepareStatement(sql);
       
          int n1=pst.executeUpdate();
       if(n1>0)
        {
	     System.out.println(k2);
      	 return Vuser;
      	
          }
          else
          {
        	  
        	  System.out.println(k2);
        	return Iuser;
          } 
 
       }catch(Exception e){
    	   System.out.println(e);
       }
    
      return Iuser;  
}
}

