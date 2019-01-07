package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Admin;
import beans.HEmployee;
import beans.SEmployee;






public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
	   SEmployee se=new SEmployee(222,"david","david@gmail.com",5000,"Hibernate");
	   HEmployee he=new HEmployee(111,"husen","husen@gmail.com",5000,10);
	   Admin aaaa=new Admin(333,"john","john@gmail.com",5000,"jntu");
	   
     sss.save(se);
     sss.save(he); 
     sss.save(aaaa); 
       t.commit();                    
      
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}