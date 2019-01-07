package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import beans.Student;


@WebServlet("/TestData")
public class TestData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory ss;
 
	public void init(ServletConfig config) throws ServletException {
		
		Configuration cfg=new Configuration();
		
		cfg.configure("resources/hibernate.cfg.xml");
	                                                
		 ss=cfg.buildSessionFactory();
		
	}

	public void destroy() {
		
		 ss.close();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int fr1=Integer.parseInt(request.getParameter("fr"));
		int mr1=Integer.parseInt(request.getParameter("mr"));
		 Session sss= ss.openSession();
		 
		 Query q=sss.createQuery("from Student");
		 q.setFirstResult(fr1);
		 q.setMaxResults(mr1);
		 
		 List<Student> list=q.list();
		 
		 for(Student s:list)
			 
		 {
			 
			 System.out.println(s.getId());
			 System.out.println(s.getName());
		 }
		 
		 
	}


}
