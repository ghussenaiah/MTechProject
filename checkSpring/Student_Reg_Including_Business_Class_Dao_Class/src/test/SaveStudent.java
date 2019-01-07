package test;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBInterface;
import model.Student;

@WebServlet("/stusave")


public class SaveStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
     ConfigurableApplicationContext cap;

	public void init(ServletConfig config) throws ServletException {
		
		
		cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		
		
	}

	
	public void destroy() {
		cap.close();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		StudentBInterface std=(StudentBInterface)cap.getBean("bi");
		int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
String address=request.getParameter("address");

		Student st=new Student();
		st.setId(id);
		st.setName(name);
		st.setEmail(email);
		st.setAddress(address);
		
		
		int i=std.createStudent(st);
	
		response.getWriter().println("success"+i);
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
