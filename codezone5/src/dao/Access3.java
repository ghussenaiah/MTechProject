package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.MetricDetails;



 
public class Access3
{
public ArrayList<MetricDetails> getMet(Connection con) throws SQLException
{
ArrayList<MetricDetails> meList = new ArrayList<MetricDetails>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM MetricDetails");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
	MetricDetails proObj = new MetricDetails();
	
	proObj.setPhase(rs.getInt("Phase"));
	proObj.setResources(rs.getString("Resources"));

	proObj.setComments(rs.getString("Comments"));
	proObj.setCost(rs.getString("Cost"));
	proObj.setRisk(rs.getString("Risk"));
	proObj.setQuality(rs.getString("Quality"));
	proObj.setStatus(rs.getString("Status"));
	
meList.add(proObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return meList;
 
}
}