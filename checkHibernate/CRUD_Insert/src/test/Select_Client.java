
package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import beans.Student;

public class Select_Client {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");//for sql  hibernate_Mysql.cfg.xml
                                                 //cfg.configure("resources/hibernate_Mysql.cfg.xml");
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	 
	   //it does not require transaction in case of selection operation 
       
       Object o=sss.get(Student.class,4);
       
       Student st=(Student)o;
       
     
                     
                                     //update mode in hibernate.cfg.xml file
        // data at persist state(means submitted to hibernate)
                        //data inserted in database
       System.out.println(st.getEmail());
       System.out.println(st.getId());
       System.out.println(st.getName());
       System.out.println(st.getMarks());
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}