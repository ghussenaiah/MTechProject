package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.MileStoneDetails;





public class Access5 {

	public ArrayList<MileStoneDetails> getMil(Connection con) throws SQLException
	{
	ArrayList<MileStoneDetails> milList = new ArrayList<MileStoneDetails>();
	PreparedStatement stmt = con.prepareStatement("SELECT * FROM MilestoneDetails");
	ResultSet rs = stmt.executeQuery();
	try
	{
	while(rs.next())
	{
		MileStoneDetails proObj = new MileStoneDetails();
		
		proObj.setRFPComment(rs.getString("RFPComment"));
		proObj.setProduct_Dev_High(rs.getString("Product_Dev_High"));
		proObj.setkeyeve(rs.getString("keyeve"));
		proObj.setInnolvation(rs.getString("Innolvation"));
		
	milList.add(proObj);
	}
	} catch (SQLException e)
	{
	e.printStackTrace();
	}
	return milList;
	 
	}
	
}
