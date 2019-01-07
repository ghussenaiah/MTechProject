package com.sqlite;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteConnection {
	 
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:sqlite:F:\\Sqlite_DB\\David.sqlite");
            Statement stmt = conn.createStatement();
            String sql="select * from student";
          /*  String sql="insert into student(id,name,age)values(3,'gani','24')";*/
           /*   String sql="delete from student where id=1";*/
        
            int i=stmt.executeUpdate(sql);
            System.out.println(i);
      ResultSet rs=stmt.executeQuery(sql);
            
     while(rs.next())
     {
    	 System.out.println(rs.getString(2));
     }
            stmt.close();
            conn.close();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}