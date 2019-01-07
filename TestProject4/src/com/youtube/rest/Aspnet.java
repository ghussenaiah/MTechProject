package com.youtube.rest;


import java.sql.*;

//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;

//import java.sql.*;
@Path("/d1")
public class Aspnet {

	
	Connection conn;
    ResultSet rslt;
    String Vuser ="Your valid User";
    String name1 ="inserted successfully";
    String Iuser="Invalid username or password";
    Statement stmt;
    PreparedStatement pst;
    
	
    
    @Path("/d2")
    
    @POST
    @Produces(MediaType.TEXT_HTML)
    
    
    	
    	

    public String Login(@QueryParam("name1") String UserName,@QueryParam("pwd1") String PassWord,@QueryParam("la") String Lastname) throws SQLException
    {
    	
    	
    	
    	try{

    		   Class.forName("com.mysql.jdbc.Driver");  
    			  
    			Connection conn=DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/TestDB","root","root");
    	 stmt = conn.createStatement();
    	//	String sql ="delete from TestTable where username ='" + PassWord + "'";
    	// String sql ="Insert into TestTable values ('" + PassWord + "','" + Lastname + "')";
         
    	 String sql ="update TestTable set username='" + PassWord + "' where password='" + Lastname + "'";
         stmt.executeUpdate(sql);
    	}catch(Exception e){ System.out.println(e);} 
    	
    	
	//String name = "hello" + " " + "hai";
	String name = PassWord+ " "+Lastname;
	 // System.out.println("Username is"+ UserName);
	  System.out.println("Password is"+ PassWord);
	  System.out.println("Username is"+ Lastname);
	return name;
	
 
// return PassWord;
	
	 
    }
    
     }