package beans;


import java.util.Map;
import java.util.Set;
import java.util.List;
public class Test {

	private List fruits;
	private Set cricketers;
	private Map cc;
	
	
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	} 
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCc() {
		return cc;
	}
	public void setCc(Map cc) {
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
