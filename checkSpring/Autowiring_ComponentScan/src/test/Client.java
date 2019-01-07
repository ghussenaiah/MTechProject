package test;



import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;


//not executed
public class Client {

	
	public static void main(String args[]) throws ClassNotFoundException
	{
		
           

		ApplicationContext factory=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		Car cc=(Car)factory.getBean(Car.class);
		cc.printdata();
		}

}