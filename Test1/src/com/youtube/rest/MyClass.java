package com.youtube.rest;

import java.sql.*;  

public class MyClass {

	

	
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	java.sql.Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/TestDB","root","root");  
	  
	//here sonoo is database name, root is username and password  
	  
	Statement stmt=con.createStatement();  
	  
	ResultSet rs=stmt.executeQuery("select * from TestTable");  
	  
	while(rs.next())  
	System.out.println(rs.getString(1)+"  "+rs.getString(2));  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  

