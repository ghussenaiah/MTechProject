package test;



import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	
	public static void main(String args[])
	{
		
	    //  String file[]=new String[]{"resources/car.xml","resources/engine.xml"};
		//ApplicationContext factory=new ClassPathXmlApplicationContext(file);
		 String file[]=new String[]{"resources/car-engine.xml"};
ApplicationContext factory=new ClassPathXmlApplicationContext(file);

Test c= (Test)factory.getBean("t");
c.display();    /*comment this steps and run constructor methods are executed nothing but instances are created at run time of the classes*/
		
		//model year proble ioc video part 10		
	}

}
