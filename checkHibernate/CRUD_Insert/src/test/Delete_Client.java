
package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import beans.Student;

public class Delete_Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");//for sql  hibernate_Mysql.cfg.xml
                                                 //cfg.configure("resources/hibernate_Mysql.cfg.xml");
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
       Student st=new Student();
       st.setId(5);
                       //data at transient state
                                     //create update in hibernate.cfg.xml file
      sss.delete(st); // data at persist state(means submitted to hibernate)
       t.commit();                    //data inserted in database
       System.out.println("delete success");
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}