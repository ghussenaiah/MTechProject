package test;



import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import business.StdentBI;
import business.StudentBImple;
import model.Student;

public class Client {  

	//executed
	public static void main(String args[]) throws Exception
	{
		
		ConfigurableApplicationContext cp=new ClassPathXmlApplicationContext("resources/test.xml");

		StdentBI ss= (StdentBI)cp.getBean("stbi");
	
	int i=ss.createstudent(new Student(111,"david","d@gmail.com","wnp"));
	System.out.println(i);
   
		
		
	}

}
