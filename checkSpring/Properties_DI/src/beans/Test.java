package beans;

import java.awt.List;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Vector;

import edu.emory.mathcs.backport.java.util.TreeSet;

public class Test {


	private Properties driver;
	

	public Properties getDriver() {
		return driver;
	}


	public void setDriver(Properties driver) {
		this.driver = driver;
	}


	public void display()
	{
		
      Set keys=driver.keySet();
	    for(Object key:keys)
	    {
	    System.out.print(key+""+driver.getProperty(key.toString()));
	    System.out.print("\n");
	    }
	}
	
}
