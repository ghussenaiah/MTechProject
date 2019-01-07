
package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import beans.Student;

public class Update_Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");//for sql  hibernate_Mysql.cfg.xml
                                                 //cfg.configure("resources/hibernate_Mysql.cfg.xml");
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   //updating values of id:4 record
       Student st=new Student();
       st.setId(4);
       st.setName("david1");
       st.setEmail("david1@gmail.com");
       st.setMarks(88);                //data at transient state
                                     //update mode in hibernate.cfg.xml file
      sss.update(st); // data at persist state(means submitted to hibernate)
       t.commit();                    //data inserted in database
     
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}