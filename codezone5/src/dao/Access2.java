package dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.ProjectDetails;
 

 
public class Access2
{
public ArrayList<ProjectDetails> getPro(Connection con) throws SQLException
{
ArrayList<ProjectDetails> proList = new ArrayList<ProjectDetails>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM ProjectDetails");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
	ProjectDetails proObj = new ProjectDetails();
	
	proObj.setProjectDescription(rs.getString("ProjectDescription"));
	proObj.setVam(rs.getString("Vam"));
	proObj.setOwner(rs.getString("Owner"));
	
proList.add(proObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return proList;
 
}
}