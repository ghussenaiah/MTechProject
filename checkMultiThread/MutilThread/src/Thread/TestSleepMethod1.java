package Thread;

class TestSleepMethod1 extends Thread{  
	 public void run677(){ 
		 
		 
	  for(int i=1;i<5;i++){ 
		  
		  
	    try{
	    	Thread.sleep(1000*5);
	    	}
	    
	    catch(InterruptedException e)
	    
	    {
	    	System.out.println(e);
	    }  
	    System.out.println(i);  
	  }  
	 }  
	 
	 public static void main(String args[]){  
	  TestSleepMethod1 t1=new TestSleepMethod1();  
	 // TestSleepMethod1 t2=new TestSleepMethod1();  
	   
	 // t1.start();  
	  t1.run677(); 
	 // t2.start();  
	 }  
	}  