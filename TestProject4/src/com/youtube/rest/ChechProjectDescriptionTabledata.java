package com.youtube.rest;

import java.sql.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;
@Path("/p1")
public class ChechProjectDescriptionTabledata {

	Connection conn;
    ResultSet rslt;
    String Vuser ="Green";
    String Iuser="Invalid";
    Statement stmt;
  String s1;
	 String s2;
	String s3;
   
   @Path("/p2")
    
  @GET
    @Produces(MediaType.TEXT_HTML)
    
    
 //  public String LoginUser(@QueryParam("la") String LastName,@QueryParam("m3") String Month) throws SQLException
  public String LoginUser() throws SQLException{
    
 //  public static void main(String args[]){  
	   //ProjectDetails
	   return "welcome";
    //	try{
    	   
      //     Class.forName("com.mysql.jdbc.Driver");  
 		  
   		//Connection conn=DriverManager.getConnection(  
   	//	"jdbc:mysql://localhost:3306/TestDB","root","root"); 
         
         // String sql="select ProjectDescription,Vam,Owner from Newtable where Month='"+Month+"' and Username='"+Username+"'";
         // String sql="select ProjectDescription,Status from mreview where Month='"+Month+"'";
   	//	String sql="select ProjectDescription,Status from mreview where Month ='March'and Status='Red'";
        //  String sql="select ProjectDescription,Status from mreview";
         //  String sql="select * from ProjectDetails";
           
    //     java.sql.PreparedStatement pst=conn.prepareStatement(sql);
     //    ResultSet rs1=pst.executeQuery();
       
//int n1=pst.executeUpdate();
//if(n1>0)
    //   if(!rs1.next())
    //    {
        	 
        	
           //  System.out.println(Month);
        
        //   String s1 = rs1.getString("ProjectDescription");
         //    String s2 = rs1.getString("Status");
        	//System.out.println(rs1.getString(1)+"  "+rs1.getString(2));  
         //    System.out.println(s1);
         //   System.out.println(s2);
          //  if(s1!= null && s2!= null  )
         	//{
        	 // System.out.println("data not null");
         		//return Vuser;
        	  
         	//}
      // }
       
      // }catch(Exception e){
    //	   System.out.println(e);
     //  }
    
    // return Iuser;  
}
    }
