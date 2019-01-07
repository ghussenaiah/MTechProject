package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Cource;
import beans.Faculty;









public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
	Cource c1=new Cource();
	Cource c2=new Cource();
	Cource c3=new Cource();
	Cource c4=new Cource();
	Cource c5=new Cource();
	
	c1.setCid(1);
	c1.setCname("ab");
	c1.setFee(200);
	
	c2.setCid(2);
	c2.setCname("cd");
	c2.setFee(700);
	
	c3.setCid(3);
	c3.setCname("ef");
	c3.setFee(500);
	
	c4.setCid(4);
	c4.setCname("gh");
	c4.setFee(400);
	
	c5.setCid(5);
	c5.setCname("jk");
	c5.setFee(300);
	
	Set<Cource> cc1=new HashSet<Cource>();
	cc1.add(c1);
	cc1.add(c2);
	
	Set<Cource> cc2=new HashSet<Cource>();
	cc2.add(c3);
	cc2.add(c4);
	cc2.add(c5);
	
	Faculty f1=new Faculty();
	Faculty f2=new Faculty();
	Faculty f3=new Faculty();
	f1.setFid(111);
	f1.setName("xyz");
	f1.setExp(6);
	f1.setCources(cc1);
	
	f2.setFid(222);
	f2.setName("lmn");
	f2.setExp(7);
	f2.setCources(cc2);
	
	sss.save(f1);
	   sss.save(f2);
	sss.save(c1);
	    sss.save(c2);
	sss.save(c3);
	     sss.save(c4);
	sss.save(c5);
	    
	
	
	
	   
   //  sss.save(m1);
  //   sss.save(m2);  if i add cascade option in actor.hbm.xml file
	   //then there is no need to save m1 and m2
    
       t.commit();                    
      
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}