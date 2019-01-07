package model;
import java.sql.Connection;
import java.util.ArrayList;
 

import dao.Access4;
import dao.Database;
import dto.RevenueDetails;

public class AccessManager4 {

	public ArrayList<RevenueDetails> getRev() throws Exception
	{
	ArrayList<RevenueDetails> revList = new ArrayList<RevenueDetails>();
	Database db = new Database();
	Connection con = db.getConnection();
	Access4 access4 = new Access4();
	revList = access4.getRev(con);
	return revList;
	
}
}
