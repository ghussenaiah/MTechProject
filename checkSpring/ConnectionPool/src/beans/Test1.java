package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import org.apache.commons.dbcp.BasicDataSource;

public class Test1 {

	public static void main(String args[])
	{
	//time it will take more in simple jdbc coonections	
		Date d1 = new Date();
				
		//here we are close the coonection but it not close properly (every 5sec database refuses the connection)
		for(int i=0;i<200000;i++)
		{
			try{

                      Class.forName("oracle.jdbc.OracleDriver");
                      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root"); 
				System.out.println(con+"-------------------------------------------------"+i);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		Date d2=new Date();
		//time to measure 16 sec required for 200000 connections only
		System.out.println(d1+""+d2);
		
		
		
	}
}