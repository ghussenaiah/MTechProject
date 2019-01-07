import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumTestTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}



	@Before
	public void setUp() throws Exception {
	}

	
	
	
	

	@Test
	public void testSum() {
		
		
		int[] sum={2,3,4,5};
		int a=SumTest.sum(sum);
		assertTrue(a==14);
		
		//assertTrue(SumTest.sum(sum)==14);
	}





	@Test
	public void testMul() {
		

		int[] mul={2,3,4,5};
		int b=SumTest.mul(mul);
		assertTrue(b==120);
		
		//assertTrue(SumTest.mul(mul)==120);
	}
	
	
	
	
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
