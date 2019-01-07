package beans;
import beans.Engine;

public class Car {

	private String carname; 
    private Engine engine;
	Car()
	{
		System.out.print("car\n");
	}

	
	public void setCarname(String carname) {
		this.carname = carname;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void display()
	{
		System.out.print("carname\n"+carname);
		System.out.print("model year"+engine.getModelyear());
	}
	
}

