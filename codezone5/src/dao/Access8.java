package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.GetRollId;
 

 
public class Access8
{
public ArrayList<GetRollId> getId(Connection con) throws SQLException
{
ArrayList<GetRollId> courseList = new ArrayList<GetRollId>();
PreparedStatement stmt = con.prepareStatement("SELECT * FROM courses");
ResultSet rs = stmt.executeQuery();
try
{
while(rs.next())
{
GetRollId courseObj = new GetRollId();
courseObj.setId(rs.getString("id"));

courseList.add(courseObj);
}
} catch (SQLException e)
{
e.printStackTrace();
}
return courseList;
 
}
}