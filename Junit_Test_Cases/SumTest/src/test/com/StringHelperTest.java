package test.com;

import static org.junit.Assert.*;

import org.junit.Test;

import com.javatpoint.logic.StringHelper;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper str=new StringHelper();
		String actualOutput=str.trunacateAinFirst2Positions("AAAA");
		String expectedOutput="AA";
		assertEquals(expectedOutput,actualOutput);
		assertEquals("BB",str.trunacateAinFirst2Positions("AABB"));
		assertEquals("MMAA",str.trunacateAinFirst2Positions("MMAA"));
	}

}
