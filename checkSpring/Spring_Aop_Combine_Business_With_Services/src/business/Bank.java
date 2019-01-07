package business;

public class Bank {
	
	int amount=5000;
	String ac="sbi123";
	
		
	
	public int deposit(String ac,int amount)
	{
		
		
		
		if(ac.equals(this.ac))
			
		{
			System.out.println("in deposit method");
		    this.amount=this.amount+amount;
		    return this.amount;
		}
		else
		{
			
			throw new AcNotFoundException();
		}
	}
	
	public int findBalance(String ac)
	{
		if(ac.equals(this.ac))
		{
			
			    return this.amount;
		}
		else
		{
			throw new AcNotFoundException();
		}
	}
	}


