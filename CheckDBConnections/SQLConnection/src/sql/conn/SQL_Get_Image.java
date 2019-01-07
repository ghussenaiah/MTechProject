package sql.conn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQL_Get_Image {

	
	
	public static void main(String args[]){  
	
		try{  
			  
			    Class.forName("oracle.jdbc.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
	String sql = "select * from picture";

	PreparedStatement ps=con.prepareStatement(sql);  
	ResultSet rs=ps.executeQuery();  
	if(rs.next()){//now on 1st row  
	              
	Blob b=rs.getBlob(2);//2 means 2nd column data  
	byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
	              
	FileOutputStream fout=new FileOutputStream("f:\\kkkk.jpg");  
	fout.write(barr);  
	              
	fout.close();  
	}//end of if  
	System.out.println("ok");  
	              
	con.close();
  
    
  
    } catch(Exception e){
    	System.out.println(e);
    }
	
    }
}
