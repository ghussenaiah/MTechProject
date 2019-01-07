package model;



import java.sql.Connection;
import java.util.ArrayList;


import dao.Access8;
import dao.Database;

import dto.GetRollId;

public class AccessManager8
{
public ArrayList<GetRollId> getId() throws Exception
{
ArrayList<GetRollId> courseList = new ArrayList<GetRollId>();
Database db = new Database();
Connection con = db.getConnection();
Access8 access = new Access8();
courseList = access.getId(con);
return courseList;
}
}