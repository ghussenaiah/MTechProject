package beans;
import java.util.Date;

import java.sql.Connection;


import org.apache.commons.dbcp.BasicDataSource;

public class Test {

	public static void main(String args[])
	{
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("root");
		bds.setMaxActive(15);
		bds.setMaxIdle(5);
		bds.setMaxWait(1000*5);
		
		
		
		Date d1 = new Date();
				
		//here we are not close the coonection that's why 16 th requset not accepted if close then it will accept
		for(int i=0;i<200000;i++)
		{
			try{
				Connection con=bds.getConnection();
				System.out.println(con+""+i);
				//con.close();
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
