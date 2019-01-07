package beans;
import beans.Engine;

public class Car {

	private String[] carname; 
    private Engine[] engine;

	
	public String[] getCarname() {
		return carname;
	}

public void setCarname(String[] carname) {
		this.carname = carname;
	}

public Engine[] getEngine() {
		return engine;
	}

public void setEngine(Engine[] engine) {
		this.engine = engine;
	}




	public void display()
	{
		
		for(String car:carname)
		{
		System.out.print("carname\n"+car);
		}
		for(Engine e:engine)
		{
		System.out.print("model year"+e.getModelyear());
		}
	}
	
}

