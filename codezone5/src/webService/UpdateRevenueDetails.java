
package webService;

import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;


@Path("/rev121")
public class UpdateRevenueDetails {

	Connection conn;
    ResultSet rslt;
    String Vuser ="Valid";
    String Iuser="Invalid";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/rev212")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
    
   public String LoginUser(@QueryParam("la") String LastName,@QueryParam("hs1") String HSEScore,			
		@QueryParam("am1") String Automation,
			@QueryParam("ps1") String ProductivitySavings,@QueryParam("kb1") String KBriefs,
			
			@QueryParam("pt1") String Patents,
			@QueryParam("wids1") String WIDS,
			@QueryParam("ppv1") String PPVPOC,			
			@QueryParam("kr1") String KaizensResolved,
				@QueryParam("tm1") String TeamSize,
		@QueryParam("pid1") String PID,@QueryParam("m17") String Month,
			@QueryParam("u17") String Username,
			@QueryParam("ss1") String CategoryName,@QueryParam("dt1") String Dt) throws SQLException
  //  public void LoginUser()
    {
    
    	
         try{
      	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      	 
         
             String url="jdbc:sqlserver://IE1FVWISOP016\\SQLSER2008R2;databaseName=TestDB";
              conn=DriverManager.getConnection(url,"sa","Password@1");
           
           
             String sql="UPDATE Common SET HSEScore=?,Automation=?,ProductivitySavings=?,KBriefs=?,Patents=?,WIDS=?,PPVPOC=?,KaizensResolved=?,TeamSize=?,Dt=? where Username=? and Month=? and CategoryName=? and PID=? ";
             
       
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, HSEScore);
            pst.setString(2, Automation);
               pst.setString(3,ProductivitySavings );
           pst.setString(4, KBriefs);
           pst.setString(5, Patents);
           pst.setString(6,WIDS );
           pst.setString(7, PPVPOC);
           pst.setString(8, KaizensResolved);
           pst.setString(9, TeamSize);
            pst.setString(10,Dt);
            pst.setString(11,Username);
            pst.setString(12,Month);
            pst.setString(13,CategoryName);
            pst.setString(14,PID);
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


