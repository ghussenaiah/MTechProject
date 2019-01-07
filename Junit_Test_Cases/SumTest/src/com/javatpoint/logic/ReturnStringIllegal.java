package com.javatpoint.logic;

public class ReturnStringIllegal {

	
	public String returnSting(String str){
	

  if(str==null || str.length()==0)
  {
	  throw new IllegalArgumentException();
  }


		return str;
	}
	
/*	public static void main(String args[])
	
	{
		
		ReturnStringIllegal a=new ReturnStringIllegal();
		//System.out.println(a.returnSting(1,0));
		System.out.println(a.returnSting(""));
		
	}*/
	
}
