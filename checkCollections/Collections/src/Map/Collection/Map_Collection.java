package Map.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Collection {

	 public static void main(String args[]){ 
//	HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		 //---------------------or-------------------------------------------
	Map<Integer,String> hm = new HashMap<Integer,String>();  
	  
	hm.put(99,"Hai");
	
	  hm.put(100, "Amit");  
	  hm.put(101, "Vijay");  
	  hm.put(102, "Rahul");
	  
	  Set<Integer> keys=hm.keySet();
	  
	  for(Integer m:keys){  
	   System.out.println(m+"-------------------------"+hm.get(m));  
	 
	  }
	  }  
}
