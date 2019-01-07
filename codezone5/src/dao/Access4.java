package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import dto.RevenueDetails;

public class Access4 {

	public ArrayList<RevenueDetails> getRev(Connection con) throws SQLException
	{
	ArrayList<RevenueDetails> revList = new ArrayList<RevenueDetails>();
	PreparedStatement stmt = con.prepareStatement("SELECT * FROM RevenueDetails");
	ResultSet rs = stmt.executeQuery();
	try
	{
	while(rs.next())
	{
		RevenueDetails proObj = new RevenueDetails();
		
		proObj.setNpiRevenue(rs.getInt("NpiRevenue"));
		proObj.setRDBudget(rs.getInt("RDBudget"));
		proObj.setRDBudgetActual(rs.getInt("RDBudgetActual"));
		proObj.setrevenue2016(rs.getInt("revenue2016"));
		proObj.setrevenue2017(rs.getInt("revenue2017"));
		
	revList.add(proObj);
	}
	} catch (SQLException e)
	{
	e.printStackTrace();
	}
	return revList;
	 
	}
	
}
