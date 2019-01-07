package model;


import java.sql.Connection;
import java.util.ArrayList;
 

import dao.Access5;
import dao.Database;
import dto.MileStoneDetails;


public class AccessManager5 {
	
	public ArrayList<MileStoneDetails> getMil() throws Exception
	{
	ArrayList<MileStoneDetails> milList = new ArrayList<MileStoneDetails>();
	Database db = new Database();
	Connection con = db.getConnection();
	Access5 access6 = new Access5();
	milList = access6.getMil(con);
	return milList;
	
}
}
