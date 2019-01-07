package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	//@Qualifier(value="e1")
	private Engine engine;


	
	public void printdata()
	{
		System.out.println("ModelYear========="+engine.getModelyear());
	}
	

}
