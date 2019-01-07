package source.com;

public class CalService  {

	ICalculator call;
	

	public void setCal(ICalculator cal) {
		this.call = cal;
	}


public int add(int x, int y) {
		
		return call.addTwo(x, y);
	}

}
