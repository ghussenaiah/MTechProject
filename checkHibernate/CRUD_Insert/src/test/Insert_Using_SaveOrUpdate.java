package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;



public class Insert_Using_SaveOrUpdate {

	public static void main(String args[]){
	try{
Configuration cfg=new Configuration();
	
	cfg.configure("resources/hibernate.cfg.xml");//for sql  hibernate_Mysql.cfg.xml
                                                 //cfg.configure("resources/hibernate_Mysql.cfg.xml");
	SessionFactory ss=cfg.buildSessionFactory();

	   Session sss= ss.openSession();
	   Transaction t= sss.beginTransaction();
	   
       Student st=new Student();
       st.setId(4);
       st.setName("david");
       st.setEmail("david@yahoo.com");
       st.setMarks(88);                //data at transient state
       
       //saveOrUpdate does not return anything  update attribute value change update hibernate.cfg.xml file also
     sss.saveOrUpdate(st); // data at persist state(means submitted to hibernate)
       t.commit();                    //data inserted in database
    
       
       
       
	   sss.close();ss.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

