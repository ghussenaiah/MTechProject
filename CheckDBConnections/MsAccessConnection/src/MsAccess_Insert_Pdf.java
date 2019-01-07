import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MsAccess_Insert_Pdf {

	
	public static void main(String[] args)
    {
		
    try 
      {
   	 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DavidHusen\\Documents\\David.accdb");
  
	
   	File pdfFile = new File("F://mysqltest.pdf");
	byte[] pdfData = new byte[(int) pdfFile.length()];
	DataInputStream dis = new DataInputStream(new FileInputStream(pdfFile));
	dis.readFully(pdfData);  // read from file into byte[] array
	dis.close();
	String sql="insert into PdfTable(ID,Pdf) values (?,?)";
	PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
	
	ps.setInt(1,2);
	ps.setBytes(2, pdfData);  // byte[] array
	int i=ps.executeUpdate();
	System.out.println(i);

   	
      }catch(Exception e)
    {
   	   System.out.println(e);
    }
	
    }
}
