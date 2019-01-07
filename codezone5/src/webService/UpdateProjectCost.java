package webService;

import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;


@Path("/u11")
public class UpdateProjectCost {

	Connection conn;
    ResultSet rslt;
    String Vuser ="Valid";
    String Iuser="Invalid";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/u22")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
    
   public String LoginUser(@QueryParam("la") String LastName,@QueryParam("te1") String TotalEffort,			
		@QueryParam("re1") String ReviewEffort,
			@QueryParam("de1") String DesignEffort,@QueryParam("ce1") String CodingEffort,
			
			@QueryParam("te11") String TestEffort,
			@QueryParam("re11") String ReworkEffort,
		@QueryParam("pid1") String PID,@QueryParam("m17") String Month,
			@QueryParam("u17") String Username,
			@QueryParam("ss1") String CategoryName,@QueryParam("dt1") String Dt) throws SQLException
  //  public void LoginUser()
    {
    
    	
         try{
      	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      	 
         
             String url="jdbc:sqlserver://IE1FVWISOP016\\SQLSER2008R2;databaseName=TestDB";
              conn=DriverManager.getConnection(url,"sa","Password@1");
           
           
             String sql="UPDATE Effort SET TotalEffort=?,ReviewEffort=?,DesignEffort=?,CodingEffort=?,TestEffort=?,ReworkEffort=?,Dt=? where Username=? and Month=? and CategoryName=? and PID=? ";
             
       
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            
            pst.setString(1,TotalEffort);
            pst.setString(2, ReviewEffort);
               pst.setString(3,DesignEffort);
           pst.setString(4, CodingEffort);
           pst.setString(5, TestEffort);
           pst.setString(6,ReworkEffort );
            pst.setString(7,Dt);
            pst.setString(8,Username);
            pst.setString(9,Month);
            pst.setString(10,CategoryName);
            pst.setString(11,PID);
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


