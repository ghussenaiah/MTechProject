package model;
 
import java.sql.Connection;
import java.util.ArrayList;
 



import dao.Access1;
import dao.Database;
import dto.Cost;

 
public class AccessManager1
{
public ArrayList<Cost> getCost() throws Exception
{
ArrayList<Cost> costList = new ArrayList<Cost>();
Database db = new Database();
Connection con = db.getConnection();
Access1 access1 = new Access1();
costList = access1.getCost(con);
return costList;
}
}