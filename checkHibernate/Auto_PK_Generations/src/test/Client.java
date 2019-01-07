package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.MovieTicket;




public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
       MovieTicket mt=new MovieTicket();
    
      mt.setMoviename("pk");
       mt.setShowtime("10pm");
       mt.setSeatno(21);             
                                    
       int pk=(Integer)sss.save(mt); 
       t.commit();                    
       System.out.println(pk);
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}