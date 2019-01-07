package Exception;
public class TestMultipleCatchBlock{  
	  public static void main(String args[]){  
	   try{  
	    int a[]=new int[5];  
	    a[5]=30/0;  
	   }  
	   catch(ArithmeticException e){System.out.println("task1 is completed");}  
	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");}  
	   catch(Exception e){System.out.println("common task completed");}  
	  
	   System.out.println("rest of the code...");  
	 }  
	}
/*Rule: At a time only one Exception is occured and at a time only one
catch block is executed.*/