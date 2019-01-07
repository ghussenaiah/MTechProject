package beans;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bus {
	
	@Autowired
	//@Qualifier("e1")
	@Qualifier("engine")
	private Engine engine;
	
	
	public void printdata()
	{
		System.out.println("ModelYear========="+engine.getModelyear());
	}
	

}
