package Exception;

class TestMultipleCatchBlock1{  
	  public static void main(String args[]){  
	   try{  
	    int a[]=new int[5];  
	    a[5]=30/0;  
	   }  
	   catch(Exception e){System.out.println("common task completed");
	   e.printStackTrace();}  
	   
	/*   catch(ArithmeticException e){System.out.println("task1 is completed");}  
	   catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");} */ 
	   System.out.println("rest of the code...");  
	 }  
	}

/*Rule: All catch blocks must be ordered from most specific to most general i.e. catch 
for ArithmeticException must come before catch for Exception .*/