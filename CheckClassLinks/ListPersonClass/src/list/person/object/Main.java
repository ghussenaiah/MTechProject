package list.person.object;

import list.person.object.Person;
import list.person.object.DataUtil;
public class Main {

	public static void main(String[] args) {
		
		int s=DataUtil.getPersonData().get(0).getAge();
		System.out.println(s);
	
		
	//	Person pk=new Person("fff",67,"ty");
		/*Person pk=new Person();
		String name=pk.getName();
		System.out.println(name);
		
		but in this case we can not able to get value
		bcoz we are not passing any value through p1 reference and 
		it does not link up with collection list
		*/
		
		
	}
}