package model;
 
import java.sql.Connection;
import java.util.ArrayList;
 



import dao.Access2;
import dao.Database;
import dto.ProjectDetails;
 
public class AccessManager2
{
public ArrayList<ProjectDetails> getPro() throws Exception
{
ArrayList<ProjectDetails> proList = new ArrayList<ProjectDetails>();
Database db = new Database();
Connection con = db.getConnection();
Access2 access2 = new Access2();
proList = access2.getPro(con);
return proList;
}
}