    package test.com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
    import org.junit.*;

import com.javatpoint.logic.ReturnStringIllegal;

public class ReturnStringIllegalTest {

	 ReturnStringIllegal r; //making r instance as global now
	 
	@Before
	public void setup() {

	 r = new ReturnStringIllegal();
    }
	//-----------------------------------------------------
	
	
	@Test
	public void testReturnSting() {

		
	//	String actual=r.returnSting("Hello");
    //   ("Hello",actual);
		Assert.assertEquals("Hello",r.returnSting("Hello"));
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testReturnSting_with_name_null() {

		
	    r.returnSting(null);
    
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testReturnSting_with_name_empty() {

		
	    r.returnSting("");
    
		
	}
	
	//------------------------------------------
	@After
	public void teardown() {

		 r = null; //removing object


		}


}
