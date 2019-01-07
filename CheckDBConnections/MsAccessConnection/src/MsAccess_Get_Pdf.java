import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;



public class MsAccess_Get_Pdf {

	
	 public static void main(String[] args)
     {
     try 
       {
    	 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DavidHusen\\Documents\\David.accdb");
    	
    	 byte[] fileBytes;
    		
 		String sql="select * from PdfTable where id='1'";
 		java.sql.PreparedStatement ps=conn.prepareStatement(sql);  
 		ResultSet rs=ps.executeQuery(); 
 	
 		if (rs.next()) {
             fileBytes = rs.getBytes(1);
             OutputStream targetFile=  new FileOutputStream("k://project//newtest4.pdf");
             targetFile.write(fileBytes);
             System.out.println("ok");
             targetFile.close();
         }
       }catch(Exception e)
     {
    	   System.out.println(e);
     }
	
     }

}
