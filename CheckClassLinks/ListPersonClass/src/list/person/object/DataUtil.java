package list.person.object;

import java.util.ArrayList;
import java.util.List;
import list.person.object.Person;

public class DataUtil {

	
	public static List<Person> getPersonData()
	{
		
		Person p1=new Person("aa",20,"ind");
		//Person p1=new Person();
		Person p2=new Person("bb",40,"pak");
		Person p3=new Person("cc",50,"sri");
	/*	Person p1=new Person();
		p1.setName("david");
		p1.setAge(40);
		p1.setCountry("india");
		p1.getName();
		p1.getAge();
		p1.getCountry();*/
		
		
		String name=p1.getName();
		System.out.println(name);
		
		List<Person> plist=new ArrayList<>();
		plist.add(p1);
		//plist.add(p2);
		//plist.add(p3);
		return plist;
	}
}