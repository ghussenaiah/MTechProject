package test;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Icici;



@WebServlet("/reg")
public class ICICIServlet extends HttpServlet {
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

		
		
		 
		 
		 
		 String name=request.getParameter("name");
			String email=request.getParameter("email");
			long phone=Long.parseLong(request.getParameter("phone"));
			 Session sss= ss.openSession();
			   Transaction t= sss.beginTransaction();
			   
		       Icici ic=new Icici(null, name, email, phone);
		    
		            
		                                    
		       String pk=(String)sss.save(ic); 
		       
		       t.commit();                    
		       sss.close();
		       response.getWriter().println("Data Inserted=="    +pk);
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	

}
