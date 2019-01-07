package test;



import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Mysql;

public class Client {

	
	public static void main(String args[]) throws ClassNotFoundException
	{
		
           

		ApplicationContext factory=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Mysql cc=(Mysql) factory.getBean("my");
		cc.getConn();
		
				
	}

}
