package sql.conn;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;





public class SQL_Insert_Pdf {

	
	public static void main(String args[]){  

				 try
			        {
			     Class.forName("oracle.jdbc.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
			    
			     System.out.println("connection established successfully...!!");     
			           
				  
					File pdfFile = new File("F://mysqltest.pdf");
					byte[] pdfData = new byte[(int) pdfFile.length()];
					DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
					dis.readFully(pdfData);  // read from file into byte[] array
					dis.close();
					String sql="insert into PdfFile1(name,pdf) values (?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					
					ps.setString(1,"testpdf");
					ps.setBytes(2, pdfData);  // byte[] array
					int i=ps.executeUpdate();
					System.out.println(i);
			    
			      }
			        catch (Exception e){
			            e.printStackTrace();
			     }
			
					
			}
	
}
