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



public class LoginAction extends HttpServlet {
	
	String user1="admin";
	String user2="user";
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println("username"+username);
		
		
		
		
		
		
		
		
		
		
		try{
			 Class.forName("oracle.jdbc.OracleDriver");
		  Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","don1","root");
		  Statement st=(Statement) ((java.sql.Connection) con).createStatement();
		 
		          
		 
		  ResultSet rs=((java.sql.Statement) st).executeQuery("select * from users where username='"+username+"' and password='"+password+"'");
		        
		 if(rs.next())
		 {

			String role=rs.getString("role");
			System.out.println("role is "+ role);
			
			if( user1.equalsIgnoreCase(role))
				
			{
				System.out.println(" in admin "+role);
				   RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
			        rd.forward(request, response);  
				
			}
			
			else if( user2.equalsIgnoreCase(role))
			{

				   RequestDispatcher rd=request.getRequestDispatcher("servlet3");  
			        rd.forward(request, response); 
				
				
			}
			else{
				
				System. out.print("Sorry UserName or Password Error!");  
			        RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");  
			        rd.include(request, response);  
			}
			
			
			}
		 
			
			}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		                  
		}
				
		
		
		
		
		
		
		
		
		
		

		
	}

	
	
