package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 

import dto.Cost;

 
public class Access1
{
public ArrayList<Cost> getCost(Connection con) throws SQLException
{
ArrayList<Cost> costList = new ArrayList<Cost>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM ProjectCost");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
Cost costObj = new Cost();

costObj.setCost(rs.getDouble("Cost"));
costList.add(costObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return costList;
 
}
}