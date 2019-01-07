package test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	//cfg.configure("resources/hibernate.cfg.xml");//for sql  hibernate_Mysql.cfg.xml
cfg.configure("resources/hibernate_Mysql.cfg.xml");
	SessionFactory ss=cfg.buildSessionFactory();
	try{
		Thread.sleep(1000*10);
	}
	catch(Exception e){}
	
	ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}