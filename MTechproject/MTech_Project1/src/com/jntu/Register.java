package com.jntu;



import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Register extends HttpServlet {
	
int status=1;
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int userid=Integer.parseInt(request.getParameter("userid"));
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		int number=Integer.parseInt(request.getParameter("number"));
		String role=request.getParameter("role");
		
		System.out.println("username"+username);
		
		
		
		
		
		
		
		
		
		
		try{
			 Class.forName("oracle.jdbc.OracleDriver");
		  Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","don1","root");
		 
		 
		          
		
		  
	        String sql="INSERT INTO users (userid,username,password,key,status,role) VALUES (?,?,?,?,?,?)";
	           
	         java.sql.PreparedStatement pst=con.prepareStatement(sql);
	       
	         pst.setInt(1, userid);  
	         pst.setString(2, username); 
	         pst.setString(3, password); 
	         pst.setInt(4, number); 
	         pst.setInt(5, status);
	         pst.setString(6, role); 
	int n1=pst.executeUpdate();
	if(n1>0)
		        
	{
		System.out.println("success");
	}
			
			}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		                  
		}
				
		
		
		
		
		
		
		
		
		
		

		
	}

	
	
