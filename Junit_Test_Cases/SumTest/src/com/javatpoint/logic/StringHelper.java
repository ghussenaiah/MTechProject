package com.javatpoint.logic;

public class StringHelper {

	public String trunacateAinFirst2Positions(String str){
		
		if(str.length()==0)
			return str;
		if(str.length()<=2)
			return str.replaceAll("A", "");
		String first2Chars=str.substring(0,2);
		String stringminusFirst2Char=str.substring(2);
		
		
		return first2Chars.replaceAll("A","")+stringminusFirst2Char;
	}
			
}
