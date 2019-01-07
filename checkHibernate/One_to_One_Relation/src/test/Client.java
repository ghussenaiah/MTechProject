package test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import beans.Vote;
import beans.Voter;

public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
	Voter vo=new Voter();
    Vote vote1=new Vote();
   
/*    Vote vote2=new Vote();*/
    
    vo.setVid(111);
    vo.setVname("david");
    vo.setVage(25);
    
    
    vote1.setPartyname("bjp");
    vote1.setCdate(new Date());
    vote1.setVoter(vo);
    
  /*  vote2.setPartyname("bjp");
    vote2.setCdate(new Date());
    vote2.setVoter(vo);*/
	   
	   
	   
	   


	  
	  
	
	  
	   
     sss.save(vo);
    sss.save(vote1); 
    //it gives error bcoz one voter cannot inject into more than one time into  vote object
   /* sss.save(vote2); */

 
    
       t.commit();                    
      
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}