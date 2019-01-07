
package webService;

import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;


@Path("/mis121")
public class UpdateMilestoneDetails {

	Connection conn;
    ResultSet rslt;
    String Vuser ="Valid";
    String Iuser="Invalid";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/mis212")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
    
   public String LoginUser(@QueryParam("la") String LastName,@QueryParam("psp1") String PlannedStoryPoints,			
		@QueryParam("asp1") String ActualStoryPoints,
			@QueryParam("am1") String AgileMaturity,@QueryParam("rl1") String ReleaseLength,
			
			@QueryParam("dw1") String DiscoveredWork,
			@QueryParam("td1") String TechnicalDept,
			@QueryParam("ab1") String AverageBuilds,			
			@QueryParam("abt1") String AverageBuildTime,
				@QueryParam("abv1") String AverageBuildVerification,@QueryParam("cc1") String CodeCoverage,
				
				@QueryParam("sy1") String StoryCycleTime,
		@QueryParam("pid1") String PID,@QueryParam("m17") String Month,
			@QueryParam("u17") String Username,
			@QueryParam("ss1") String CategoryName,@QueryParam("dt1") String Dt) throws SQLException
  //  public void LoginUser()
    {
    
    	
         try{
      	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      	 
         
             String url="jdbc:sqlserver://IE1FVWISOP016\\SQLSER2008R2;databaseName=TestDB";
              conn=DriverManager.getConnection(url,"sa","Password@1");
           
           
             String sql="UPDATE AgileMetrics SET PlannedStoryPoints=?,ActualStoryPoints=?,AgileMaturity=?,ReleaseLength=?,DiscoveredWork=?,TechnicalDept=?,AverageBuilds=?,AverageBuildTime=?,AverageBuildVerification=?,CodeCoverage=?,StoryCycleTime=?, Dt=? where Username=? and Month=? and CategoryName=? and PID=? ";
             
       
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, PlannedStoryPoints);
            pst.setString(2, ActualStoryPoints);
               pst.setString(3,AgileMaturity );
           pst.setString(4, ReleaseLength);
           pst.setString(5, DiscoveredWork);
           pst.setString(6,TechnicalDept );
           pst.setString(7, AverageBuilds);
           
           pst.setString(8, AverageBuildTime);
           pst.setString(9, AverageBuildVerification);
           pst.setString(10, CodeCoverage);
           pst.setString(11, StoryCycleTime);
            pst.setString(12,Dt);
            pst.setString(13,Username);
            pst.setString(14,Month);
            pst.setString(15,CategoryName);
            pst.setString(16,PID);
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


