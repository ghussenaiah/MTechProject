package webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 

import model.AccessManager4;

import com.google.gson.Gson;

import dto.RevenueDetails;


 @Path("/rev1")


public class RevenueDet {

	@GET
	@Path("/rev2")
	@Produces("application/json")
	public String Revenue()
	{
	String rev = null;
	ArrayList<RevenueDetails> revList = new ArrayList<RevenueDetails>();
	try
	{
	revList = new AccessManager4().getRev();
	Gson gson = new Gson();
	rev = gson.toJson(revList);
	} catch (Exception e)
	{
	e.printStackTrace();
	}
	return rev;
	}
}
	


