package User_Defined_Objetcs;

import java.util.ArrayList;


class Student{  
	  int rollno;  
	  String name;  
	  int age;  
	  Student(int rollno,String name,int age){  
	   this.rollno=rollno;  
	   this.name=name;  
	   this.age=age;  
	  }  
	}  


public class UserDefined_ClassObject {

	
	 public static void main(String args[]){  
		  //Creating user-defined class objects  
		  Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		      
		  ArrayList<Student> al=new ArrayList<Student>();//creating arraylist  
		  al.add(s1);//adding Student class object  
		  al.add(s2);  
		  al.add(s3);  
		    
		  java.util.Iterator<Student> itr=al.iterator();
		  while(itr.hasNext()){
		    Student st=itr.next();
		    System.out.println(st.rollno+" "+st.name+" "+st.age);
		  }  
		 }  
}
