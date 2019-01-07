package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 




import dto.Mser;
public class Access6 {

	//public ArrayList<Mser> getM(Connection con,String Month) throws SQLException
	public ArrayList<Mser> getM(Connection con) throws SQLException
	{
	ArrayList<Mser> mservice = new ArrayList<Mser>();
	//System.out.println("selected month in Access6" +Month);
	//String sql ="select ProjectDescription,Status from MReview where Month=?";
	//PreparedStatement stmt = con.prepareStatement("select ProjectDescription,Status from MReview where Month='"+Month+"'");
	PreparedStatement stmt = con.prepareStatement("select ProjectDescription,Status from mreview");
	//PreparedStatement stmt = con.prepareStatement(sql);
	ResultSet rs = stmt.executeQuery();
	try
	{
	while(rs.next())
	{
		//System.out.println("selected month in Access6" +Month);
	Mser courseObj1 = new Mser();
	
	courseObj1.setProjectDescription(rs.getString("ProjectDescription"));
	courseObj1.setStatus(rs.getString("Status"));
	
	mservice.add(courseObj1);
	}
	} catch (SQLException e)
	{
	e.printStackTrace();
	}
	return mservice;
	}
}