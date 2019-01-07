package webService;


import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import com.google.gson.Gson;
 

import model.AccessManager6;
import dto.Mser;
 
@Path("/m1")
public class Mservice {

	
	
	@GET
	@Path("/m2")
	@Produces("application/json")
//	public String ManagerService(@QueryParam("la") String LastName,@QueryParam("month1") String Month) throws SQLException{
	public String ManagerService(){
		
		//String m1=Month;
	String mser = null;
	ArrayList<Mser> mservice = new ArrayList<Mser>();
	try
	{
		
	//	System.out.println("selected month is Mservice"+Month);
	//mservice = new AccessManager6().getM(Month);
	mservice = new AccessManager6().getM();
	Gson gson = new Gson();
	mser = gson.toJson(mservice);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return mser;
	}
}