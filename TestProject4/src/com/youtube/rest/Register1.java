package com.youtube.rest;


//import java.awt.PageAttributes.MediaType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.Produces;





import com.mysql.jdbc.Statement;


@Path("/r1")
public class Register1 {


	Connection conn;
 
  String data ="successfully inserted";
  Statement stmt;
  
  @Path("/r2")
  @POST
	
	
	public String UserRegistration(@FormParam("firstname") String FirstName,			
			@FormParam("lastname") String Lastname,
			@FormParam("username") String Username,
			@FormParam("password") String Password) throws SQLException {
  	
  	String lLoginQuery ="insert into register values ('" + FirstName + "','" +Lastname  + "','" +Username + "', "
  			+ "'" + Password + "')";
	//	lLoginQuery =lLoginQuery + "" + FirstName + "','" +Lastname  + "','" +
	//			Username + "', '" + Password + "','";
		
//	String lLoginQuery ="insert into regi values ('notnull','nusall','nudasll','nasdull')";
  //	String lLoginQuery="insert into TestTable(firstname, lastname, username, password) values( FirstName, Lastname,Username,password)";
		try{  
  		Class.forName("com.mysql.jdbc.Driver");  
  		  
  		Connection con=DriverManager.getConnection(  
  		"jdbc:mysql://localhost:3306/testdb","root","root");  
  		  
  		//here sonoo is database name, root is username and password  
  		  
  		Statement stmt=(Statement) con.createStatement();  
  		  
  		stmt.executeUpdate(lLoginQuery);  
  		
  		//stmt.executeQuery(lLoginQuery);
  		//rslt.close();
  		 
  		System.out.println("successfully inserted");
  		
  		stmt.close();
  		//con.close();  
  	
  	//	return "successfully inserted";
  	
  		}
		catch(Exception e){ System.out.println(e);}  
		return data;
  }
  
}