package com.youtube.rest;

import java.sql.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

//import com.mysql.jdbc.PreparedStatement;
//import com.sun.corba.se.pept.transport.Connection;

@Path("/z1")
public class ChechProjectDescriptionTabledata1 {
	String v1="hello";
	String data="Green";
	String data1="notGreen";
Statement stmt=null;
	@Path("/z2")
	@GET
	@Produces(MediaType.TEXT_HTML)
  public String LoginUser(@QueryParam("la") String LastName,@QueryParam("m3") String Month,@QueryParam("u3") String ProjectDescription) throws SQLException
	//public String returnTitle()
	
	{
		
		  	try{
 	   
	          
		  		//Class.forName("com.mysql.jdbc.Driver");  
  			  
    			//Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/TestDB","root","root");
		  		Class.forName("com.mysql.jdbc.Driver");  
				  
				Connection conn=DriverManager.getConnection( "jdbc:mysql://localhost:3306/TestDB","root","root"); 
				
				 
			      stmt = conn.createStatement();
String sql="select ProjectDescription,Status,Vam from mreview where Month='"+Month+"'and ProjectDescription='"+ProjectDescription+"'";
			 //     String sql = "select ProjectDescription,Status,Vam from mreview where Month ='March'and ProjectDescription='dd'";
			      ResultSet rs=stmt.executeQuery(sql);
	   		//PreparedStatement ps =(PreparedStatement) ((java.sql.Connection) conn).prepareStatement
                //    ("select ProjectDescription,Status from mreview where Month ='March'and Status='Red'");

//ResultSet rs =ps.executeQuery();
if(rs.next())
{
       String s1 = rs.getString("ProjectDescription");
       String s2 = rs.getString("Status");
       String s3= rs.getString("Vam");
       if(s1!= null && s2!= null && s3!=null ){
	 return data;}
       return data1;
}
else
{
	 return data1;
}
			
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		return data1;
			}  
}
	      
		//return "welcome honeywell david ";
		//return v1;
	

