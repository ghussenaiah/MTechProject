package Finally;

import java.io.*;  
class Parent3{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
class TestExceptionChild5 extends Parent3{  
  void msg(){System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent3 p=new TestExceptionChild5();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  