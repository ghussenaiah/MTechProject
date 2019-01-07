package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 


import dto.Data;
 
public class Access7
{
public ArrayList<Data> getData(Connection con) throws SQLException
{
ArrayList<Data> dataList = new ArrayList<Data>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM Data1");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
Data courseObj = new Data();

courseObj.setDetails(rs.getString("Details"));
courseObj.setStatus(rs.getString("Status"));

dataList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return dataList;
 
}
}