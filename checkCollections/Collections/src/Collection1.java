

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;  
class Collection1{  
 public static void main(String args[]){  
	 
//this non generic type it can accept any type of datatype value
	    Collection al=new ArrayList<>();
	    //Collection<Integer> al=new ArrayList<Integer>();
                       
                       al.add(5);
                       al.add("kamini");
                       
  
                       Iterator itr=al.iterator();  
                       while(itr.hasNext())
                       {  
                    	   System.out.println(itr.next());  
                       }  
 }  
}  