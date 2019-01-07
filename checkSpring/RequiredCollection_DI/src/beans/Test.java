package beans;

import java.awt.List;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import edu.emory.mathcs.backport.java.util.TreeSet;

public class Test {


	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable cc; 
	
    public Vector getFruits() {
		return fruits;
	}

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public TreeSet getCricketers() {
		return cricketers;
	}

	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}

    public Hashtable getCc() {
		return cc;
	}
	public void setCc(Hashtable cc) {
		this.cc = cc;
	}


	public void display()
	{
		
		
	
		for(Object fruit: fruits)
		{
		System.out.print("fruit\n"+ fruit);
		}
		for(Object cricketer:cricketers)
		{
		System.out.print("cricketer"+cricketer);
		}
		
	          Set keys=cc.keySet();
	    for(Object key:keys)
	    {
	    System.out.print(key+""+cc.get(key));
	    }
	}
	
}
