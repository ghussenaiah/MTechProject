package sql.conn;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class SQL_Insert_Image {

	
	
	public static void main(String args[]){  
		// create table picture(id int(10),photo blob);
		//TINYBLOB: 255 bytes       BLOB: 64 KB           MEDIUMBLOB: 16 MB            LONGBLOB: 4 GB
		try{  
			  FileInputStream fis = null;
			    PreparedStatement ps = null;
			    Class.forName("oracle.jdbc.OracleDriver");
			     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
	String INSERT_PICTURE = "insert into Picture(id,photo) values (?,?)";


  
      con.setAutoCommit(false);
      File file = new File("d:\\g.jpg");
      fis = new FileInputStream(file);
      ps = con.prepareStatement(INSERT_PICTURE);
      ps.setString(1, "001");
    
      ps.setBinaryStream(2, fis, (int) file.length());
      int i=ps.executeUpdate();
      System.out.println(i);
      con.commit();
  
    } catch(Exception e){
    	System.out.println(e);
    }
	
    }
}
