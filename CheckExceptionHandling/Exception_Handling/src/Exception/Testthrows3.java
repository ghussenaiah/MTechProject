package Exception;

import java.io.*;  
class Mm{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
class Testthrows3{  
   public static void main(String args[])throws IOException{//declare exception  
     Mm m=new Mm();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
}  