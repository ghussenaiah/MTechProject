
package webService;

import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;


@Path("/pd121")
public class UpdateProjectDetails {

	Connection conn;
    ResultSet rslt;
    String Vuser ="Valid";
    String Iuser="Invalid";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/pd212")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
    
   public String LoginUser(@QueryParam("la") String LastName,@QueryParam("od1") String OpenDefects,			
		@QueryParam("fd1") String FunctionalDefects,
			@QueryParam("id1") String IntegrationDefects,@QueryParam("vx1") String VxDefects,
			
			@QueryParam("nfr1") String NFRDefects,@QueryParam("prd1") String PostReleaseDefects,
		@QueryParam("pid1") String PID,@QueryParam("m17") String Month,
			@QueryParam("u17") String Username,
			@QueryParam("ss1") String CategoryName,@QueryParam("dt1") String Dt) throws SQLException
  //  public void LoginUser()
    {
    
    	
         try{
      	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      	 
         
             String url="jdbc:sqlserver://IE1FVWISOP016\\SQLSER2008R2;databaseName=TestDB";
              conn=DriverManager.getConnection(url,"sa","Password@1");
           
           
             String sql="UPDATE Defects SET OpenDefects=?,FunctionalDefects=?,IntegrationDefects=?,VxDefects=?,NFRDefects=?,PostReleaseDefects=?, Dt=? where Username=? and Month=? and CategoryName=? and PID=? ";
             
       
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, OpenDefects);
            pst.setString(2, FunctionalDefects);
               pst.setString(3,IntegrationDefects );
           pst.setString(4, VxDefects);
           pst.setString(5, NFRDefects);
           pst.setString(6,PostReleaseDefects );
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


