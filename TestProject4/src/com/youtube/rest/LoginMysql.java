package com.youtube.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import javax.ws.rs.FormParam;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.PreparedStatement;

@Path("/k1")
public class LoginMysql {

  String data="success";

	@POST
	@Path("/k2")
	@Produces(MediaType.TEXT_HTML)
	public String Login(@FormParam("username") String Username,
		@FormParam("password") String Password) throws SQLException {
	 
	//public static void main(String args[]){  
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/testdb","root","root");  
			  
			//here sonoo is database name, root is username and password  
			 PreparedStatement ps =(PreparedStatement) con.prepareStatement
                     ("select * from testtable where username='"+Username+"'");
 ps.setString(1, Username);
 ps.setString(2, Password);
 ResultSet rs =ps.executeQuery();
 if(rs.next())
 {
	 return data;
 }
 else
 {
	 return data;
 }
			
			  
			}catch(Exception e){ System.out.println(e);}  
			  
		return data;
			}  
	
	}
	

