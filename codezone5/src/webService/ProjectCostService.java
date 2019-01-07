package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 
import com.google.gson.Gson;
 
import model.AccessManager1;
import dto.Cost;

 
@Path("/cost1")
public class ProjectCostService {

	@GET
	@Path("/cost2")
	@Produces("application/json")
	public String cost()
	{
	String cost = null;
	ArrayList<Cost> costList = new ArrayList<Cost>();
	try
	{
	costList = new AccessManager1().getCost();
	Gson gson = new Gson();
	cost = gson.toJson(costList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return cost;
	}	
}
