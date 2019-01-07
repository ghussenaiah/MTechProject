
package webService;

import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;


@Path("/met121")
public class UpdateMetricDetails {

	Connection conn;
    ResultSet rslt;
    String Vuser ="Valid";
    String Iuser="Invalid";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/met212")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
    
   public String LoginUser(@QueryParam("la") String LastName,@QueryParam("phase") String Phase,			
		@QueryParam("resource") String Resources,
			@QueryParam("comment") String Comments,@QueryParam("cost") String Cost,
			
			@QueryParam("risk") String Risk,
			@QueryParam("quality") String Quality,@QueryParam("status") String Status1,
		@QueryParam("pid1") String PID,@QueryParam("m17") String Month,
			@QueryParam("u17") String Username,
			@QueryParam("ss1") String CategoryName,@QueryParam("dt1") String Dt) throws SQLException
  //  public void LoginUser()
    {
    
    	
         try{
      	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      	 
         
             String url="jdbc:sqlserver://IE1FVWISOP016\\SQLSER2008R2;databaseName=TestDB";
              conn=DriverManager.getConnection(url,"sa","Password@1");
           
           
             String sql="UPDATE MetricDetails SET Phase=?,Resources=?,Comments=? ,Cost=?,Risk=?,Quality=?,Status1=?,Dt=? where Username=? and Month=? and CategoryName=? and PID=? ";
             
       
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1,Phase);
            pst.setString(2,Resources);
            pst.setString(3,Comments);
            pst.setString(4,Cost);
            pst.setString(5,Risk);
            pst.setString(6,Quality);
            pst.setString(7,Status1);
            pst.setString(8,Dt);
            pst.setString(9,Username);
            pst.setString(10,Month);
            pst.setString(11,CategoryName);
            pst.setString(12,PID);
            int n1=pst.executeUpdate();
         if(n1>0)
          {
  	
        	
        	return Vuser;
        	 
       
            }
            else
            {
            	
          	
          	return Iuser;
            
            } 
   
         }catch(Exception e){
      	   System.out.println(e);
         }
      
       return Iuser;  
       
      
       
}
	
	
}


