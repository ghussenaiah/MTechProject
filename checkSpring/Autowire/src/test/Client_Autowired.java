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

import beans.Bus;
import beans.Car;



public class Client_Autowired {

	
	public static void main(String args[]) throws ClassNotFoundException
	{
		
           

		ApplicationContext factory=new ClassPathXmlApplicationContext("resources/Autowired_By_Annotation.xml");
		
		Bus cc=(Bus)factory.getBean("b");
		cc.printdata();
		}

}
