package beans;

public class Car {
	
	private static String carname;


	
	public static String getCarname() {
		return carname;
	}



	public static void setCarname(String carname) {
		Car.carname = carname;
	}



	public static void printdata()
	{
		System.out.println("CarName========="+carname);
	}
	

}
