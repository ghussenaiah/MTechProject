package sql.conn;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.ResultSet;

public class SQL_Get_Pdf {

	
	public static void main(String args[]){  

		 try
	        {
			 byte[] fileBytes;
	     Class.forName("oracle.jdbc.OracleDriver");
	     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
	    
	     System.out.println("connection established successfully...!!");     
	           

			String sql="select pdf from PdfFile1 where name='testpdf'";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
			
					ResultSet rs=(ResultSet) ps.executeQuery();
		
			if (rs.next()) {
	            fileBytes = rs.getBytes(1);
	            OutputStream targetFile=  new FileOutputStream("k://project//newtest2.pdf");
	            targetFile.write(fileBytes);
	            System.out.println("ok");
	            targetFile.close();
	        }
	      }
	        catch (Exception e){
	            e.printStackTrace();
	     }
	
			
	}
}
