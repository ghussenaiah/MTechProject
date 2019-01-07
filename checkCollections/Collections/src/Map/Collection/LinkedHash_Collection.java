package Map.Collection;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHash_Collection {

	public static void main(String args[]){  
		
		//it maintains insertion order
		  Map<Integer,String> hm=new LinkedHashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");
		  
		  Set<Entry<Integer,String>> values=hm.entrySet();
		  
		  for(Entry<Integer,String> m:values){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  
}
