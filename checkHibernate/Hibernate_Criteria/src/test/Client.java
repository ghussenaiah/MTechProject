package test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import beans.Student;


public class Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");
                                                
	SessionFactory ss=cfg.buildSessionFactory();

	
     	   Session sss= ss.openSession();
     	  Criteria c=sss.createCriteria(Student.class);
	   
/*  Transaction t= sss.beginTransaction();
	   
	   Student s1=new Student(111,"abc","abc@gmail.com",5000);
	   Student s2=new Student(222,"lmn","lmn@gmail.com",5000);*/
		  
	  
                    
           //1.  select all 
                   /*  List<Student> list=c.list();

                      for(Student s:list){
                    	  System.out.println(s.getId());
                      }*/
     	   
     	   //2.   select where id=1
     	   
     	/*   SimpleExpression cr=Restrictions.eq("id", 111);
     	    c.add(cr);
     	    
     	   Student s=(Student) c.uniqueResult(); 
     	   
     	  System.out.println(s.getId());*/
     	  
     	  //3.  emp salart gt>8000
     /*	  
     	 SimpleExpression cr=Restrictions.gt("salary",4000);
     	  
     	 List<Student> list=c.list();

         for(Student s:list){
       	  System.out.println(s.getId());
         }
     	  */
     	  
     	  //4.   projections on one attribute
     	  
   /*  	  Projection p=Projections.property("name");
     	  
     	  c.setProjection(p);
     	  
     	 List<String> list=c.list();

         for(String s:list){
       	  System.out.println(s);
         }*/
     	     //select operation two attributes
  Projection p2=Projections.property("name");
  Projection p1=Projections.property("email");
  
  
  ProjectionList p3=Projections.projectionList();
  
  p3.add(p1);
  p3.add(p2);
  
     	  
     	  c.setProjection(p3);
     	  
     	 List<Object[]> list=c.list();

         for(Object[] o:list){
       	  System.out.println(o[0]);
       	 System.out.println(o[1]);
         }    
                     
	   
	   
	   
	   
                   
   /*    
       sss.save(s1);
       sss.save(s2);
       
       t.commit();*/

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}