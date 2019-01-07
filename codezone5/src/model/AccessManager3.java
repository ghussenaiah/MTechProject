package model;

import java.sql.Connection;
import java.util.ArrayList;
 





import dao.Access3;
import dao.Database;
import dto.MetricDetails;

 

public class AccessManager3 {
	

	public ArrayList<MetricDetails> getMet() throws Exception
	{
	ArrayList<MetricDetails> meList = new ArrayList<MetricDetails>();
	Database db = new Database();
	Connection con = db.getConnection();
	Access3 access3 = new Access3();
	meList = access3.getMet(con);
	return meList;
	
	
}
}
