import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MsAccess_Image_Insert {

	
	public static void main(String[] args)
    {
		FileInputStream fis = null;
    try 
      {
   	 Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DavidHusen\\Documents\\David.accdb");
  
	
   	String INSERT_PICTURE = "insert into Image(ID,Image) values (?, ?)";

    PreparedStatement ps = null;
  
            conn.setAutoCommit(false);
            File file = new File("d:\\g.jpg");
            fis = new FileInputStream(file);
            ps = conn.prepareStatement(INSERT_PICTURE);
            ps.setString(1, "001");
            ps.setBinaryStream(2, fis, (int) file.length());
            int i=ps.executeUpdate();
            conn.commit();
            System.out.println(i);

   	
      }catch(Exception e)
    {
   	   System.out.println(e);
    }
	
    }
}
