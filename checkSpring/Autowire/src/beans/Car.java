package beans;

public class Car {
	
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

/*	 Car(){
		 System.out.println("default constructor");
		 
	 }*/
	public void setEngine(Engine engine) {
		
		System.out.println("setter method");
		this.engine = engine;
	}
	
	Car(Engine engine)
	{
		System.out.println("parameterized method");
		this.engine = engine;
	}

	
	public void printdata()
	{
		System.out.println("ModelYear========="+engine.getModelyear());
	}
	

}
