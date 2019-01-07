package webService;



import java.util.ArrayList;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 


import com.google.gson.Gson;
 
//import model.AccessManager8;
//import dto.Data;

//import dto.GetRollId;

 

 
@Path("/g1")
public class GetRollId
{
@GET
@Path("/g2")
@Produces("application/json")
public String courses()
{
String courses = null;
ArrayList<GetRollId> courseList = new ArrayList<GetRollId>();
try
{
//courseList = new AccessManager8().getId();
Gson gson = new Gson();
courses = gson.toJson(courseList);
} catch (Exception e)
{
e.printStackTrace();
}
return courses;
}
}