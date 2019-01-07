package model;
 
import java.sql.Connection;
import java.util.ArrayList;
 



import dao.Access7;
import dao.Database;
import dto.Data;

 
public class AccessManager7
{
public ArrayList<Data> getData() throws Exception
{
ArrayList<Data> dataList = new ArrayList<Data>();
Database db = new Database();
Connection con = db.getConnection();
Access7 access8 = new Access7();
dataList = access8.getData(con);
return dataList;
}
}