package Compare.requiredType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_Collection {

	
	 public static void main(String args[]){  
		 

	      List<Integer> al1=new ArrayList<>();//creating arraylist 
	      al1.add(894);
         al1.add(789);  
         al1.add(100);  
         al1.add(103);   
 //it will sort based on last two digits in ascending order
         Comparator<Integer> com=new ComImpl();
                   Collections.sort(al1,com);
                  
                   al1.forEach(System.out::println);
}
}
