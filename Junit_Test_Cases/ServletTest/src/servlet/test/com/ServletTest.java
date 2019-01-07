package servlet.test.com;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import servlet.src.com.Servlet;

public class ServletTest {
	
	
	@Mock
	javax.servlet.http.HttpServletRequest req;
	javax.servlet.http.HttpServletRequest res;
	
    @Before
    public void setup()
    {
    	MockitoAnnotations.initMocks(this);


    }
	
	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() throws ServletException, IOException {
		

		 Mockito.when(req.getParameter("username")).thenReturn("pk");
		 Mockito.when(req.getParameter("pass")).thenReturn("ppkk");
		 Servlet ser=new Servlet();
		 ser.doGet(req, (HttpServletResponse) res);
		

	}

}
