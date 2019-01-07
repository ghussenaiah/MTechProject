package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoInterface;
import model.Student;

public class Client {

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		StudentDaoInterface dao=(StudentDaoInterface)cap.getBean("dao");
		
		
		Student st=new Student();
		st.setId(111);
		st.setName("david");
		st.setEmail("daivd@gmail.com");
		st.setAddress("wanaparthy");
		
	int i=(Integer)dao.save(st);
		System.out.println("sucess"+i);
		
		}
}
