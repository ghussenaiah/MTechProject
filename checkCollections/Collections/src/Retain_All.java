import java.util.ArrayList;

public class Retain_All {

	
	public static void main(String args[]){  
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");
		  al.add("Hanumat");
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  //matching al2 values with al those are displayed
		  al.retainAll(al2);  
		  
		  System.out.println("iterating the elements after retaining the elements of al2...");  
		  for(String str:al)  
       	    System.out.println(str); 
		 }  
}
